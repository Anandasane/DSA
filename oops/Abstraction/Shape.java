package oops.Abstraction;

/**
 * ABSTRACT CLASS EXAMPLE - Shape
 *
 * This abstract class demonstrates that abstract classes can have:
 *   - Fields (state)
 *   - Constructors
 *   - Abstract methods (must be implemented by subclasses)
 *   - Concrete methods (shared implementation)
 *
 * Shape is a general concept. You cannot create a "Shape" object directly.
 * You must create a specific shape like Circle or Rectangle.
 */
abstract class Shape {

    // Fields common to all shapes
    protected String color;
    protected boolean filled;

    // Constructor
    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // -------------------------------------------------------------------
    // ABSTRACT METHODS
    // -------------------------------------------------------------------
    // Every shape must know how to calculate its area and perimeter.
    // But the formula is different for each shape, so we leave it abstract.
    abstract double calculateArea();

    abstract double calculatePerimeter();

    // -------------------------------------------------------------------
    // CONCRETE METHODS
    // -------------------------------------------------------------------
    // These methods are shared by all shapes.

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Filled: " + filled);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

