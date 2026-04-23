package oops.Inhertance.Transport;

/**
 * Vehicle is the Parent (Superclass) in Hierarchical Inheritance.
 * Hierarchical Inheritance: A single base class is inherited by multiple subclasses.
 * Here, Vehicle serves as the common base class that provides shared attributes
 * and behaviors to all types of vehicles.
 *
 * Both Car and Motorcycle extend this class, forming a tree-like structure:
 *         Vehicle
 *          /   \
 *        Car   Motorcycle
 */
public class Vehicle {

    // Protected fields so subclasses can access them directly
    protected String brand;  // Brand name of the vehicle (e.g., Toyota, Harley-Davidson)
    protected int speed;     // Current speed of the vehicle in km/h

    // Default constructor: initializes with default values
    public Vehicle() {
        this.brand = "Unknown";
        this.speed = 0;
    }

    // Parameterized constructor: allows setting brand and speed at creation
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Common behavior for all vehicles: start the engine
    public void start() {
        System.out.println(brand + " vehicle is starting.");
    }

    // Common behavior for all vehicles: stop the engine and reset speed
    public void stop() {
        System.out.println(brand + " vehicle is stopping.");
        this.speed = 0;
    }

    // Common behavior for all vehicles: increase speed by a given amount
    public void accelerate(int amount) {
        this.speed += amount;
        System.out.println(brand + " accelerated to " + speed + " km/h.");
    }

    // Display common vehicle information. Subclasses will override this
    // to include their own specialized attributes.
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

