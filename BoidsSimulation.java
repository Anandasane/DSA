import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BoidsSimulation extends JPanel {
    private List<Boid> boids;
    private final int WIDTH = 1000;
    private final int HEIGHT = 700;
    private final int BOID_COUNT = 80;
    
    // Physics Tweaks for "Bird-like" movement
    private final double MAX_SPEED = 6.0;      // Faster
    private final double MAX_FORCE = 0.25;     // Much sharper turns (Agile)
    private final double PERCEPTION_RADIUS = 80.0;
    private final double SEPARATION_DIST = 25.0; // Don't stop too far away
    
    private long frameCount = 0;

    public BoidsSimulation() {
        boids = new ArrayList<>();
        Random rand = new Random();
        
        for (int i = 0; i < BOID_COUNT; i++) {
            double x = rand.nextDouble() * WIDTH;
            double y = rand.nextDouble() * HEIGHT;
            double vx = (rand.nextDouble() - 0.5) * MAX_SPEED * 2;
            double vy = (rand.nextDouble() - 0.5) * MAX_SPEED * 2;
            boids.add(new Boid(x, y, vx, vy, rand));
        }
        
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(new Color(20, 30, 60)); // Deep sky blue
        
        // 60 FPS
        Timer timer = new Timer(16, e -> {
            frameCount++;
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Sort boids by Y position to simulate depth (lower Y draws behind higher Y)
        // This gives a pseudo-3D effect where birds in "front" overlap birds "behind"
        boids.sort((a, b) -> Double.compare(a.position.y, b.position.y));

        for (Boid boid : boids) {
            boid.update(boids);
            boid.borders(WIDTH, HEIGHT);
            boid.draw(g2d, frameCount);
        }
    }

    // Vector Class remains the same
    static class Vector2D {
        double x, y;

        public Vector2D(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public void add(Vector2D other) {
            this.x += other.x;
            this.y += other.y;
        }

        public void subtract(Vector2D other) {
            this.x -= other.x;
            this.y -= other.y;
        }

        public void scale(double factor) {
            this.x *= factor;
            this.y *= factor;
        }

        public double magnitude() {
            return Math.sqrt(x * x + y * y);
        }

        public void normalize() {
            double mag = magnitude();
            if (mag > 0) {
                this.x /= mag;
                this.y /= mag;
            }
        }

        public void limit(double max) {
            if (magnitude() > max) {
                normalize();
                scale(max);
            }
        }
        
        public double dist(Vector2D other) {
            double dx = this.x - other.x;
            double dy = this.y - other.y;
            return Math.sqrt(dx * dx + dy * dy);
        }
        
        // Returns a new vector that is this vector rotated by angle
        public Vector2D rotate(double angle) {
            double cos = Math.cos(angle);
            double sin = Math.sin(angle);
            return new Vector2D(this.x * cos - this.y * sin, this.x * sin + this.y * cos);
        }
    }

    class Boid {
        private Vector2D position;
        private Vector2D velocity;
        private Vector2D acceleration;
        private final double size;
        private final Color bodyColor;
        private final Color wingColor;
        private final double wingSpan;
        
        // For animation
        private double wingAngle = 0;
        private double bankAngle = 0;

        public Boid(double x, double y, double vx, double vy, Random rand) {
            this.position = new Vector2D(x, y);
            this.velocity = new Vector2D(vx, vy);
            this.acceleration = new Vector2D(0, 0);
            
            // Random size for depth perception
            this.size = 6.0 + rand.nextDouble() * 4.0; 
            this.wingSpan = this.size * 2.5;
            
            // Color variation
            int r = 180 + rand.nextInt(60);
            int g = 200 + rand.nextInt(50);
            int b = 255;
            this.bodyColor = new Color(r, g, b);
            this.wingColor = new Color(Math.max(50, r - 100), Math.max(80, g - 100), 255);
        }

        public void update(List<Boid> boids) {
            separate(boids);
            align(boids);
            cohesion(boids);

            velocity.add(acceleration);
            velocity.limit(MAX_SPEED);
            position.add(velocity);
            acceleration.scale(0); // Reset acceleration

            // Calculate banking angle based on turning (steering force)
            // If turning hard, bank more.
            double turnForce = acceleration.magnitude();
            double turnDir = (acceleration.x * velocity.y - acceleration.y * velocity.x); // Cross product sign
            bankAngle = Math.max(-0.8, Math.min(0.8, (turnForce * 2.0) * Math.signum(turnDir)));
            
            // Flap wings faster if moving faster
            double flapSpeed = 0.2 + (velocity.magnitude() / MAX_SPEED) * 0.3;
            wingAngle = Math.sin(frameCount * flapSpeed) * (0.6 + (velocity.magnitude()/MAX_SPEED)*0.4);
        }

        public void separate(List<Boid> boids) {
            Vector2D sum = new Vector2D(0, 0);
            int count = 0;
            for (Boid other : boids) {
                double d = position.dist(other.position);
                if (other != this && d < SEPARATION_DIST && d > 0) {
                    Vector2D diff = new Vector2D(position.x - other.position.x, position.y - other.position.y);
                    diff.normalize();
                    diff.scale(1.0 / d); // Weight by distance (closer = stronger repulsion)
                    sum.add(diff);
                    count++;
                }
            }
            if (count > 0) {
                sum.scale(1.0 / count);
                sum.normalize();
                sum.scale(MAX_SPEED);
                sum.subtract(velocity);
                sum.limit(MAX_FORCE * 1.5); // Stronger separation force
                acceleration.add(sum);
            }
        }

        public void align(List<Boid> boids) {
            Vector2D sum = new Vector2D(0, 0);
            int count = 0;
            for (Boid other : boids) {
                double d = position.dist(other.position);
                if (other != this && d < PERCEPTION_RADIUS) {
                    sum.add(other.velocity);
                    count++;
                }
            }
            if (count > 0) {
                sum.scale(1.0 / count);
                sum.normalize();
                sum.scale(MAX_SPEED);
                sum.subtract(velocity);
                sum.limit(MAX_FORCE);
                acceleration.add(sum);
            }
        }

        public void cohesion(List<Boid> boids) {
            Vector2D sum = new Vector2D(0, 0);
            int count = 0;
            for (Boid other : boids) {
                double d = position.dist(other.position);
                if (other != this && d < PERCEPTION_RADIUS) {
                    sum.add(other.position);
                    count++;
                }
            }
            if (count > 0) {
                sum.scale(1.0 / count);
                seek(sum);
            }
        }

        private void seek(Vector2D target) {
            Vector2D desired = new Vector2D(target.x - position.x, target.y - position.y);
            desired.normalize();
            desired.scale(MAX_SPEED);
            Vector2D steer = new Vector2D(desired.x - velocity.x, desired.y - velocity.y);
            steer.limit(MAX_FORCE);
            acceleration.add(steer);
        }

        public void borders(double w, double h) {
            // Wrap around logic
            if (position.x < -size) position.x = w + size;
            if (position.x > w + size) position.x = -size;
            if (position.y < -size) position.y = h + size;
            if (position.y > h + size) position.y = -size;
        }

        public void draw(Graphics2D g2d, long time) {
            double angle = Math.atan2(velocity.y, velocity.x);
            
            // Save state
            g2d.translate(position.x, position.y);
            g2d.rotate(angle); // Face direction of travel
            
            // Apply Banking (Roll) - Rotate the bird body around its X-axis (which is now Z in 2D)
            // We simulate this by skewing or rotating the drawing context slightly
            // Since we are in 2D, "banking" is usually drawn by tilting the wings relative to the body
            // But for a simple 2D view, we can rotate the whole bird slightly by bankAngle
            // However, standard 2D birds usually just show the wing flapping. 
            // Let's rotate the wings specifically.
            
            // Draw Body
            g2d.setColor(bodyColor);
            // Elongated oval body
            g2d.fill(new java.awt.geom.Ellipse2D.Double(-size, -size/2.5, size * 2.2, size * 1.2));
            
            // Head
            g2d.fill(new java.awt.geom.Ellipse2D.Double(size - 2, -size/3, size * 0.8, size * 0.8));
            
            // Tail
            g2d.setColor(bodyColor.darker());
            Path2D tail = new Path2D.Double();
            tail.moveTo(-size * 1.2, 0);
            tail.lineTo(-size * 2.0, size * 0.6);
            tail.lineTo(-size * 2.0, -size * 0.6);
            tail.closePath();
            g2d.fill(tail);

            // Draw Wings with Flapping
            g2d.setColor(wingColor);
            
            // Left Wing
            Path2D leftWing = new Path2D.Double();
            // Base at body
            leftWing.moveTo(0, 0);
            // Wing tip moves based on wingAngle and bankAngle
            double wingTipY = wingSpan * Math.cos(wingAngle + bankAngle);
            double wingTipX = -size * 0.5 - (wingSpan * Math.sin(wingAngle + bankAngle) * 0.5);
            
            leftWing.lineTo(wingTipX, wingTipY);
            // Back to body
            leftWing.lineTo(0, size * 0.4);
            leftWing.closePath();
            g2d.fill(leftWing);

            // Right Wing
            Path2D rightWing = new Path2D.Double();
            rightWing.moveTo(0, 0);
            double rWingTipY = -wingSpan * Math.cos(wingAngle - bankAngle); // Mirror logic
            double rWingTipX = -size * 0.5 - (wingSpan * Math.sin(wingAngle - bankAngle) * 0.5);
            
            rightWing.lineTo(rWingTipX, rWingTipY);
            rightWing.lineTo(0, -size * 0.4);
            rightWing.closePath();
            g2d.fill(rightWing);

            // Restore state
            g2d.rotate(-angle);
            g2d.translate(-position.x, -position.y);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Realistic Boids - Birds");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new BoidsSimulation());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}