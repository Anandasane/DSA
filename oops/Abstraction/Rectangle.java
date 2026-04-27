package oops.Abstraction;

/**
 * Concrete subclass of Shape representing a Rectangle.
 *
 * Implements the abstract methods calculateArea() and calculatePerimeter()
 * using the specific formulas for a rectangle.
 */
class Rectangle extends Shape {

    private double length;
    private double width;

    Rectangle(double length, double width, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    void displayInfo() {
        System.out.println("Shape: Rectangle");
        System.out.println("Length: " + length + ", Width: " + width);
        super.displayInfo();
    }
}

