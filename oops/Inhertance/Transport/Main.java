package oops.Inhertance.Transport;

/**
 * Main class to demonstrate Hierarchical Inheritance.
 *
 * Hierarchical Inheritance means a single base class (Vehicle) is inherited
 * by multiple subclasses (Car and Motorcycle). This creates a tree-like
 * structure where inheritance flows from one parent to many children.
 *
 * Inheritance Tree:
 *         Vehicle
 *          /   \
 *        Car   Motorcycle
 *
 * Key Concepts Demonstrated:
 * 1. Code Reusability: Both Car and Motorcycle reuse Vehicle's fields and methods
 * 2. Method Overriding: Subclasses provide specialized implementations of displayInfo()
 * 3. Extensibility: New vehicle types can be added by extending Vehicle without modifying existing code
 * 4. Polymorphism: Objects of different subclasses can be treated as objects of the parent class
 */
public class Main {
    public static void main(String[] args) {

        // Display the inheritance structure being demonstrated
        System.out.println("=== Hierarchical Inheritance Demo ===");
        System.out.println("Vehicle is the parent class.");
        System.out.println("Car and Motorcycle both extend Vehicle.");
        System.out.println();

        // Creating a Car object.
        // The Car constructor calls super(brand, speed) to initialize the Vehicle part,
        // then initializes its own fields (numDoors, hasTrunk).
        Car car = new Car("Toyota", 120, 4, true);

        System.out.println("--- Car ---");
        // displayInfo() is overridden in Car to show both Vehicle info and Car-specific info
        car.displayInfo();
        // start() is inherited from Vehicle without any changes
        car.start();
        // accelerate() is inherited from Vehicle
        car.accelerate(30);
        // honk() and openTrunk() are Car-specific methods (not available in Vehicle or Motorcycle)
        car.honk();
        car.openTrunk();
        // stop() is inherited from Vehicle
        car.stop();
        System.out.println();

        // Creating a Motorcycle object.
        // The Motorcycle constructor calls super(brand, speed) to initialize the Vehicle part,
        // then initializes its own fields (hasSidecar, handlebarType).
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", 150, false, "Ape Hanger");

        System.out.println("--- Motorcycle ---");
        // displayInfo() is overridden in Motorcycle to show both Vehicle info and Motorcycle-specific info
        motorcycle.displayInfo();
        // start() is inherited from Vehicle without any changes
        motorcycle.start();
        // accelerate() is inherited from Vehicle
        motorcycle.accelerate(50);
        // revEngine() and wheelie() are Motorcycle-specific methods (not available in Vehicle or Car)
        motorcycle.revEngine();
        motorcycle.wheelie();
        // stop() is inherited from Vehicle
        motorcycle.stop();
        System.out.println();

        // Visual representation of the inheritance hierarchy
        System.out.println("=== Hierarchical Inheritance Structure ===");
        System.out.println("         Vehicle");
        System.out.println("          /  \\");
        System.out.println("        Car   Motorcycle");
    }
}

