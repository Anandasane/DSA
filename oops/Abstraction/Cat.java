package oops.Abstraction;

/**
 * Concrete subclass extending the abstract class Animal.
 *
 * Cat provides its own implementation of the abstract method makeSound().
 * It inherits sleep() and displayInfo() from Animal.
 */
class Cat extends Animal {

    private String color;

    Cat(String name, int age, String color) {
        super(name, age); // Calls Animal's constructor
        this.color = color;
    }

    // Implementation of the abstract method from Animal
    @Override
    void makeSound() {
        System.out.println(name + " says: Meow!");
    }

    // Cat-specific behavior
    void climb() {
        System.out.println(name + " the " + color + " cat is climbing the tree.");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
        System.out.println("Type: Cat");
    }
}

