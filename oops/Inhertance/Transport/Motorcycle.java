package oops.Inhertance.Transport;

/**
 * Motorcycle is a Subclass (Derived/Child class) that extends Vehicle.
 * In Hierarchical Inheritance, Motorcycle inherits all accessible fields and methods
 * from the Vehicle superclass, and adds its own specialized attributes and behaviors.
 *
 * What Motorcycle inherits from Vehicle:
 *   - Fields: brand, speed
 *   - Methods: start(), stop(), accelerate(), displayInfo()
 *
 * What Motorcycle adds on its own:
 *   - Fields: hasSidecar, handlebarType
 *   - Methods: wheelie(), revEngine()
 *
 * Both Car and Motorcycle extend Vehicle independently. They share the parent
 * class behavior but do not inherit from each other. This is the key feature
 * of Hierarchical Inheritance: one parent, multiple independent children.
 */
public class Motorcycle extends Vehicle {

    // Motorcycle-specific attributes (not present in Vehicle or Car)
    private boolean hasSidecar;     // Whether the motorcycle has a sidecar attached
    private String handlebarType;   // Type of handlebars (e.g., Standard, Ape Hanger)

    // Default constructor: calls super() to initialize Vehicle fields with defaults
    // Then sets Motorcycle-specific default values
    public Motorcycle() {
        super();  // Calls Vehicle's default constructor
        this.hasSidecar = false;
        this.handlebarType = "Standard";
    }

    // Parameterized constructor: calls super(brand, speed) to initialize Vehicle fields
    // Then initializes Motorcycle-specific fields
    public Motorcycle(String brand, int speed, boolean hasSidecar, String handlebarType) {
        super(brand, speed);  // Calls Vehicle's parameterized constructor
        this.hasSidecar = hasSidecar;
        this.handlebarType = handlebarType;
    }

    // Motorcycle-specific behavior: simulates doing a wheelie
    public void wheelie() {
        System.out.println(brand + " motorcycle is doing a wheelie!");
    }

    // Motorcycle-specific behavior: simulates revving the engine
    public void revEngine() {
        System.out.println(brand + " motorcycle engine revving: Vroom Vroom!");
    }

    // Method Overriding: Motorcycle provides its own implementation of displayInfo()
    // It first calls super.displayInfo() to show Vehicle's common info,
    // then adds Motorcycle-specific details. This demonstrates polymorphism.
    @Override
    public void displayInfo() {
        super.displayInfo();  // Reuse parent class method
        System.out.println("Type: Motorcycle");
        System.out.println("Has Sidecar: " + hasSidecar);
        System.out.println("Handlebar Type: " + handlebarType);
    }
}

