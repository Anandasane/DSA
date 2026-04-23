package oops.Inhertance;

/**
 * =============================================================================
 * JAVA INHERITANCE - ALL TYPES IN A SINGLE FILE
 * =============================================================================
 *
 * INHERITANCE: A mechanism where a new class (child/subclass) derives properties
 * and behaviors (fields and methods) from an existing class (parent/superclass).
 * It promotes code reusability and establishes an "IS-A" relationship.
 *
 * TYPES OF INHERITANCE SUPPORTED IN JAVA:
 *   1. Single Inheritance      (Class A -> Class B)
 *   2. Multilevel Inheritance  (Class A -> Class B -> Class C)
 *   3. Hierarchical Inheritance (Class A -> Class B, Class A -> Class C)
 *   4. Multiple Inheritance    (Not supported with classes, only with Interfaces)
 *   5. Hybrid Inheritance      (Combination, using classes + interfaces)
 *
 * NOTE: Java does NOT support Multiple Inheritance with classes to avoid the
 * "Diamond Problem" (ambiguity when two parent classes have the same method).
 * However, it IS supported using Interfaces.
 */

// =============================================================================
// 1. SINGLE INHERITANCE
// =============================================================================
// Definition: A subclass inherits from ONE superclass only.
// Example: Dog IS-A Animal

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Dog extends Animal (Single Inheritance)
// Dog inherits: name field, eat() and sleep() methods from Animal
// Dog adds its own: bark() method
class Dog extends Animal {

    Dog(String name) {
        super(name); // Calls Animal's constructor to initialize 'name'
    }

    // Dog-specific behavior
    void bark() {
        System.out.println(name + " is barking: Woof Woof!");
    }
}

// =============================================================================
// 2. MULTILEVEL INHERITANCE
// =============================================================================
// Definition: A class inherits from a class, which itself inherits from another class.
// It forms a chain: Grandparent -> Parent -> Child
// Example: Puppy IS-A Dog, Dog IS-A Animal, therefore Puppy IS-A Animal

// Puppy extends Dog (which already extends Animal)
// Inheritance Chain: Animal -> Dog -> Puppy
class Puppy extends Dog {

    Puppy(String name) {
        super(name); // Calls Dog's constructor, which calls Animal's constructor
    }

    // Puppy-specific behavior
    void weep() {
        System.out.println(name + " the puppy is weeping.");
    }

    // Overriding: Puppy provides its own implementation of bark()
    @Override
    void bark() {
        System.out.println(name + " the puppy barks softly: Yip Yip!");
    }
}

// =============================================================================
// 3. HIERARCHICAL INHERITANCE
// =============================================================================
// Definition: One superclass is inherited by MULTIPLE subclasses.
// It forms a tree-like structure.
// Example: Employee is parent, Manager and Developer are children

class Employee {
    String empName;
    int empId;
    double salary;

    Employee(String empName, int empId, double salary) {
        this.empName = empName;
        this.empId = empId;
        this.salary = salary;
    }

    void work() {
        System.out.println(empName + " is working.");
    }

    void showDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Salary: $" + salary);
    }
}

// Manager extends Employee (Hierarchical Inheritance - Branch 1)
class Manager extends Employee {
    int teamSize;

    Manager(String empName, int empId, double salary, int teamSize) {
        super(empName, empId, salary); // Initialize Employee fields
        this.teamSize = teamSize;
    }

    void conductMeeting() {
        System.out.println(empName + " is conducting a team meeting.");
    }

    @Override
    void showDetails() {
        super.showDetails(); // Reuse parent's showDetails()
        System.out.println("Role: Manager");
        System.out.println("Team Size: " + teamSize);
    }
}

// Developer extends Employee (Hierarchical Inheritance - Branch 2)
class Developer extends Employee {
    String programmingLanguage;

    Developer(String empName, int empId, double salary, String programmingLanguage) {
        super(empName, empId, salary); // Initialize Employee fields
        this.programmingLanguage = programmingLanguage;
    }

    void writeCode() {
        System.out.println(empName + " is coding in " + programmingLanguage + ".");
    }

    @Override
    void showDetails() {
        super.showDetails(); // Reuse parent's showDetails()
        System.out.println("Role: Developer");
        System.out.println("Primary Language: " + programmingLanguage);
    }
}

// =============================================================================
// 4. MULTIPLE INHERITANCE (Using Interfaces)
// =============================================================================
// Java does NOT support multiple inheritance with CLASSES.
// But it DOES support multiple inheritance with INTERFACES.
// A class can implement multiple interfaces.

// Interface 1: Camera functionality
interface Camera {
    void takePhoto();
    void recordVideo();
}

// Interface 2: Music player functionality
interface MusicPlayer {
    void playMusic();
    void stopMusic();
}

// Interface 3: Phone functionality
interface Phone {
    void makeCall(String number);
    void receiveCall();
}

// SmartPhone implements ALL THREE interfaces (Multiple Inheritance)
class SmartPhone implements Camera, MusicPlayer, Phone {
    String model;

    SmartPhone(String model) {
        this.model = model;
    }

    // Implementing Camera interface methods
    public void takePhoto() {
        System.out.println(model + " is taking a photo.");
    }

    public void recordVideo() {
        System.out.println(model + " is recording a video.");
    }

    // Implementing MusicPlayer interface methods
    public void playMusic() {
        System.out.println(model + " is playing music.");
    }

    public void stopMusic() {
        System.out.println(model + " stopped playing music.");
    }

    // Implementing Phone interface methods
    public void makeCall(String number) {
        System.out.println(model + " is calling " + number + ".");
    }

    public void receiveCall() {
        System.out.println(model + " is receiving a call.");
    }
}

// =============================================================================
// 5. HYBRID INHERITANCE (Combination of Hierarchical + Multiple)
// =============================================================================
// Hybrid inheritance is a combination of two or more types of inheritance.
// In Java, we achieve this using classes + interfaces together.

// Base class for electronic devices
class ElectronicDevice {
    String brand;

    ElectronicDevice(String brand) {
        this.brand = brand;
    }

    void powerOn() {
        System.out.println(brand + " device is powered ON.");
    }

    void powerOff() {
        System.out.println(brand + " device is powered OFF.");
    }
}

// Interface for wireless connectivity
interface Wireless {
    void connectWifi(String network);
    void disconnectWifi();
}

// Interface for Bluetooth connectivity
interface Bluetooth {
    void pairDevice(String deviceName);
    void unpairDevice();
}

// Laptop extends ElectronicDevice (Single Inheritance)
// and implements Wireless (Multiple Inheritance via Interface)
class Laptop extends ElectronicDevice implements Wireless {
    String processor;

    Laptop(String brand, String processor) {
        super(brand);
        this.processor = processor;
    }

    public void connectWifi(String network) {
        System.out.println(brand + " laptop connected to WiFi: " + network);
    }

    public void disconnectWifi() {
        System.out.println(brand + " laptop disconnected from WiFi.");
    }

    void compileCode() {
        System.out.println(brand + " laptop with " + processor + " is compiling code.");
    }
}

// SmartWatch extends ElectronicDevice (Hierarchical Inheritance - sibling of Laptop)
// and implements Wireless + Bluetooth (Multiple Inheritance via Interfaces)
class SmartWatch extends ElectronicDevice implements Wireless, Bluetooth {
    String strapColor;

    SmartWatch(String brand, String strapColor) {
        super(brand);
        this.strapColor = strapColor;
    }

    public void connectWifi(String network) {
        System.out.println(brand + " smartwatch connected to WiFi: " + network);
    }

    public void disconnectWifi() {
        System.out.println(brand + " smartwatch disconnected from WiFi.");
    }

    public void pairDevice(String deviceName) {
        System.out.println(brand + " smartwatch paired with " + deviceName + ".");
    }

    public void unpairDevice() {
        System.out.println(brand + " smartwatch unpaired.");
    }

    void trackSteps() {
        System.out.println(brand + " smartwatch is tracking steps.");
    }
}

// =============================================================================
// MAIN CLASS: Demonstrates all types of inheritance
// =============================================================================
public class inheritance {
    public static void main(String[] args) {

        System.out.println("============================================================");
        System.out.println("            JAVA INHERITANCE - ALL TYPES DEMO               ");
        System.out.println("============================================================\n");

        // -------------------------------------------------------------------
        // DEMO 1: SINGLE INHERITANCE
        // -------------------------------------------------------------------
        System.out.println("1. SINGLE INHERITANCE");
        System.out.println("   Structure: Animal -> Dog");
        System.out.println("   Dog inherits from Animal (one parent, one child)");
        System.out.println("-------------------------------------------------------------");

        Dog myDog = new Dog("Buddy");
        myDog.eat();      // Inherited from Animal
        myDog.sleep();    // Inherited from Animal
        myDog.bark();     // Dog's own method
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 2: MULTILEVEL INHERITANCE
        // -------------------------------------------------------------------
        System.out.println("2. MULTILEVEL INHERITANCE");
        System.out.println("   Structure: Animal -> Dog -> Puppy");
        System.out.println("   Inheritance chain: each class extends the one above it");
        System.out.println("-------------------------------------------------------------");

        Puppy myPuppy = new Puppy("Charlie");
        myPuppy.eat();     // Inherited from Animal (through Dog)
        myPuppy.sleep();   // Inherited from Animal (through Dog)
        myPuppy.bark();    // Overridden in Puppy (originally from Dog)
        myPuppy.weep();    // Puppy's own method
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 3: HIERARCHICAL INHERITANCE
        // -------------------------------------------------------------------
        System.out.println("3. HIERARCHICAL INHERITANCE");
        System.out.println("   Structure: Employee -> Manager, Employee -> Developer");
        System.out.println("   One parent (Employee), multiple independent children");
        System.out.println("-------------------------------------------------------------");

        Manager manager = new Manager("Alice", 101, 80000, 10);
        Developer developer = new Developer("Bob", 102, 60000, "Java");

        System.out.println("--- Manager Details ---");
        manager.showDetails();
        manager.conductMeeting();

        System.out.println("\n--- Developer Details ---");
        developer.showDetails();
        developer.writeCode();
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 4: MULTIPLE INHERITANCE (Using Interfaces)
        // -------------------------------------------------------------------
        System.out.println("4. MULTIPLE INHERITANCE (Using Interfaces)");
        System.out.println("   Structure: SmartPhone implements Camera, MusicPlayer, Phone");
        System.out.println("   Java allows a class to implement multiple interfaces");
        System.out.println("-------------------------------------------------------------");

        SmartPhone myPhone = new SmartPhone("iPhone 15");
        myPhone.takePhoto();          // From Camera interface
        myPhone.recordVideo();        // From Camera interface
        myPhone.playMusic();          // From MusicPlayer interface
        myPhone.makeCall("123-456-7890"); // From Phone interface
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 5: HYBRID INHERITANCE (Classes + Interfaces)
        // -------------------------------------------------------------------
        System.out.println("5. HYBRID INHERITANCE");
        System.out.println("   Combines Hierarchical + Multiple inheritance");
        System.out.println("   Structure: ElectronicDevice -> Laptop (implements Wireless)");
        System.out.println("              ElectronicDevice -> SmartWatch (implements Wireless, Bluetooth)");
        System.out.println("-------------------------------------------------------------");

        Laptop laptop = new Laptop("Dell", "Intel i7");
        laptop.powerOn();                      // From ElectronicDevice
        laptop.connectWifi("HomeNetwork");     // From Wireless interface
        laptop.compileCode();                  // Laptop's own method
        laptop.powerOff();                     // From ElectronicDevice

        System.out.println();

        SmartWatch watch = new SmartWatch("Apple", "Midnight Blue");
        watch.powerOn();                       // From ElectronicDevice
        watch.connectWifi("HomeNetwork");      // From Wireless interface
        watch.pairDevice("AirPods");           // From Bluetooth interface
        watch.trackSteps();                    // SmartWatch's own method
        watch.powerOff();                      // From ElectronicDevice
        System.out.println();

        // -------------------------------------------------------------------
        // SUMMARY
        // -------------------------------------------------------------------
        System.out.println("============================================================");
        System.out.println("                        SUMMARY                             ");
        System.out.println("============================================================");
        System.out.println("Single Inheritance:     One class extends one class");
        System.out.println("Multilevel Inheritance: Chain of inheritance (A -> B -> C)");
        System.out.println("Hierarchical:           One parent, multiple children");
        System.out.println("Multiple:               One class implements multiple interfaces");
        System.out.println("Hybrid:                 Combination of above types");
        System.out.println("============================================================");
    }
}

