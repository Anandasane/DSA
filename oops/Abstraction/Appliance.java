package oops.Abstraction;

/**
 * ABSTRACT CLASS EXAMPLE - Appliance
 *
 * This abstract class demonstrates abstraction with real-world objects.
 * Appliances share common states like brand and power status,
 * but each appliance operates differently.
 */
abstract class Appliance {

    protected String brand;
    protected boolean isOn;

    Appliance(String brand) {
        this.brand = brand;
        this.isOn = false;
    }

    // Abstract method: each appliance operates differently
    abstract void operate();

    // Concrete methods: shared behavior
    void turnOn() {
        isOn = true;
        System.out.println(brand + " appliance is now ON.");
    }

    void turnOff() {
        isOn = false;
        System.out.println(brand + " appliance is now OFF.");
    }

    void showStatus() {
        System.out.println("Brand: " + brand);
        System.out.println("Status: " + (isOn ? "Running" : "Stopped"));
    }
}

