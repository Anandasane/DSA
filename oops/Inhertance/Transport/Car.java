package oops.Inhertance.Transport;

/**
 * Car is a Subclass (Derived/Child class) that extends Vehicle.
 * In Hierarchical Inheritance, Car inherits all accessible fields and methods
 * from the Vehicle superclass, and adds its own specialized attributes and behaviors.
 *
 * What Car inherits from Vehicle:
 *   - Fields: brand, speed
 *   - Methods: start(), stop(), accelerate(), displayInfo()
 *
 * What Car adds on its own:
 *   - Fields: numDoors, hasTrunk
 *   - Methods: honk(), openTrunk()
 *
 * The 'extends' keyword establishes the inheritance relationship.
 */
public class Car extends Vehicle {

    // Car-specific attributes (not present in Vehicle or Motorcycle)
    private int numDoors;       // Number of doors the car has
    private boolean hasTrunk;   // Whether the car has a trunk

    // Default constructor: calls super() to initialize Vehicle fields with defaults
    // Then sets Car-specific default values
    public Car() {
        super();  // Calls Vehicle's default constructor
        this.numDoors = 4;
        this.hasTrunk = true;
    }

    // Parameterized constructor: calls super(brand, speed) to initialize Vehicle fields
    // Then initializes Car-specific fields
    public Car(String brand, int speed, int numDoors, boolean hasTrunk) {
        super(brand, speed);  // Calls Vehicle's parameterized constructor
        this.numDoors = numDoors;
        this.hasTrunk = hasTrunk;
    }

    // Car-specific behavior: simulates honking the horn
    public void honk() {
        System.out.println(brand + " car is honking: Beep Beep!");
    }

    // Car-specific behavior: opens the trunk if the car has one
    public void openTrunk() {
        if (hasTrunk) {
            System.out.println(brand + " car trunk is now open.");
        } else {
            System.out.println(brand + " car does not have a trunk.");
        }
    }

    // Method Overriding: Car provides its own implementation of displayInfo()
    // It first calls super.displayInfo() to show Vehicle's common info,
    // then adds Car-specific details. This is called extending parent behavior.
    @Override
    public void displayInfo() {
        super.displayInfo();  // Reuse parent class method
        System.out.println("Type: Car");
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Has Trunk: " + hasTrunk);
    }
}

