package oops.Abstraction;

/**
 * ABSTRACT CLASS EXAMPLE - Animal
 *
 * An abstract class is a class that cannot be instantiated on its own.
 * It is meant to be subclassed by other classes.
 *
 * Key Features:
 *   - Can have both abstract methods (no body) and concrete methods (with body).
 *   - Can have fields (instance variables), constructors, and static methods.
 *   - A class extending an abstract class MUST implement all abstract methods,
 *     unless the subclass is also declared abstract.
 *
 * Why use abstract class?
 *   - To provide a common base with shared code for related classes.
 *   - To enforce that certain methods MUST be implemented by subclasses.
 */
abstract class Animal {

    // Fields: can exist in abstract classes
    protected String name;
    protected int age;

    // Constructor: abstract classes CAN have constructors
    // They are called when a subclass object is created.
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // -------------------------------------------------------------------
    // ABSTRACT METHOD
    // -------------------------------------------------------------------
    // An abstract method has NO body. It only declares the method signature.
    // Every non-abstract subclass MUST provide its own implementation.
    // This enforces a contract: all animals must be able to make a sound.
    abstract void makeSound();

    // -------------------------------------------------------------------
    // CONCRETE METHOD
    // -------------------------------------------------------------------
    // Abstract classes can also have fully implemented methods.
    // Subclasses inherit this method directly without needing to override it.
    void sleep() {
        System.out.println(name + " is sleeping. Zzz...");
    }

    // Another concrete method
    void displayInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Age: " + age + " years");
    }
}

