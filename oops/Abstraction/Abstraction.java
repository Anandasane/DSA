package oops.Abstraction;

/**
 * =============================================================================
 * JAVA ABSTRACTION - TYPES AND EXAMPLES
 * =============================================================================
 *
 * ABSTRACTION means hiding internal implementation details and showing only
 * essential features to the user.
 *
 * In Java, abstraction is achieved in TWO ways:
 *   1. Abstract Classes
 *      - Declared with the 'abstract' keyword
 *      - Can have abstract methods (no body) and concrete methods (with body)
 *      - Can have fields, constructors, and static methods
 *      - A class can extend ONLY ONE abstract class (single inheritance)
 *
 *   2. Interfaces
 *      - Declared with the 'interface' keyword
 *      - All methods are abstract by default (before Java 8)
 *      - Cannot have instance fields (only public static final constants)
 *      - A class can implement MULTIPLE interfaces
 *
 * WHY USE ABSTRACTION?
 *   - Reduces complexity by hiding unnecessary details.
 *   - Increases code reusability through inheritance.
 *   - Enforces a contract: subclasses MUST implement abstract methods.
 *   - Helps achieve loose coupling in applications.
 *
 * DIFFERENCE: Abstract Class vs Interface
 *   | Feature           | Abstract Class          | Interface                |
 *   |-------------------|-------------------------|--------------------------|
 *   | Methods           | Abstract + Concrete     | Abstract (default Java 8)|
 *   | Fields            | Instance variables OK   | Only constants           |
 *   | Constructors      | Yes                     | No                       |
 *   | Inheritance       | Single (extends)        | Multiple (implements)    |
 *   | Access Modifiers  | Any                     | Public by default        |
 */
public class Abstraction {

    public static void main(String[] args) {

        System.out.println("============================================================");
        System.out.println("             JAVA ABSTRACTION - ALL TYPES DEMO              ");
        System.out.println("============================================================\n");

        // -------------------------------------------------------------------
        // DEMO 1: ABSTRACT CLASS - Animal
        // -------------------------------------------------------------------
        System.out.println("1. ABSTRACT CLASS - Animal");
        System.out.println("   Animal is abstract. You cannot create: new Animal(...)");
        System.out.println("   Only concrete subclasses like Dog and Cat can be instantiated.");
        System.out.println("-------------------------------------------------------------");

        // Animal animal = new Animal("Bob", 5); // ERROR: Cannot instantiate abstract class

        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 2, "White");

        dog.displayInfo();
        dog.makeSound();  // Dog's implementation
        dog.sleep();      // Inherited from Animal
        dog.fetch();      // Dog-specific
        System.out.println();

        cat.displayInfo();
        cat.makeSound();  // Cat's implementation
        cat.sleep();      // Inherited from Animal
        cat.climb();      // Cat-specific
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 2: ABSTRACT CLASS - Shape
        // -------------------------------------------------------------------
        System.out.println("2. ABSTRACT CLASS - Shape");
        System.out.println("   Shape defines abstract methods: calculateArea(), calculatePerimeter()");
        System.out.println("   Each subclass provides its own formula.");
        System.out.println("-------------------------------------------------------------");

        Circle circle = new Circle(5.0, "Red", true);
        Rectangle rectangle = new Rectangle(10.0, 20.0, "Blue", false);

        circle.displayInfo();
        System.out.println();
        rectangle.displayInfo();
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 3: ABSTRACT CLASS - Appliance
        // -------------------------------------------------------------------
        System.out.println("3. ABSTRACT CLASS - Appliance");
        System.out.println("   Different appliances share common state and behavior,");
        System.out.println("   but each operates in its own way.");
        System.out.println("-------------------------------------------------------------");

        WashingMachine washingMachine = new WashingMachine("LG", 7);
        Refrigerator refrigerator = new Refrigerator("Samsung", 4.0);

        washingMachine.turnOn();
        washingMachine.operate();
        washingMachine.rinse();
        washingMachine.turnOff();
        System.out.println();

        refrigerator.turnOn();
        refrigerator.operate();
        refrigerator.setTemperature(2.0);
        refrigerator.operate();
        refrigerator.turnOff();
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 4: ABSTRACTION WITH ARRAYS
        // -------------------------------------------------------------------
        System.out.println("4. ABSTRACTION WITH ARRAYS");
        System.out.println("   Abstract class references can store different subclass objects.");
        System.out.println("-------------------------------------------------------------");

        Animal[] animals = {
            new Dog("Charlie", 4, "Beagle"),
            new Cat("Luna", 1, "Black")
        };

        for (Animal animal : animals) {
            animal.makeSound(); // Calls the overridden method based on actual object
        }
        System.out.println();

        // -------------------------------------------------------------------
        // SUMMARY
        // -------------------------------------------------------------------
        System.out.println("============================================================");
        System.out.println("                        SUMMARY                             ");
        System.out.println("============================================================");
        System.out.println("Abstraction hides implementation details, showing only");
        System.out.println("essential features. It reduces complexity and enforces");
        System.out.println("contracts for subclasses.");
        System.out.println();
        System.out.println("Achieved via:");
        System.out.println("  - Abstract Classes: partial abstraction, single inheritance");
        System.out.println("  - Interfaces: full abstraction (pre-Java 8), multiple inheritance");
        System.out.println("============================================================");
    }
}

