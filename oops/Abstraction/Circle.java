package oops.Abstraction;

/**
 * Concrete subclass of Shape representing a Circle.
 *
 * Implements the abstract methods calculateArea() and calculatePerimeter()
 * using the specific formulas for a circle.
 */
class Circle extends Shape {

    private double radius;

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    void displayInfo() {
        System.out.println("Shape: Circle");
        System.out.println("Radius: " + radius);
        super.displayInfo();
    }
}

