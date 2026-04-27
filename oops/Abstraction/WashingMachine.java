package oops.Abstraction;

/**
 * Concrete subclass of Appliance representing a Washing Machine.
 *
 * Provides its own implementation of the operate() method.
 */
class WashingMachine extends Appliance {

    private int loadCapacity;

    WashingMachine(String brand, int loadCapacity) {
        super(brand);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void operate() {
        if (isOn) {
            System.out.println(brand + " washing machine is washing clothes (Load: " + loadCapacity + " kg).");
        } else {
            System.out.println(brand + " washing machine is OFF. Turn it on first.");
        }
    }

    void rinse() {
        if (isOn) {
            System.out.println(brand + " washing machine is rinsing clothes.");
        }
    }

    @Override
    void showStatus() {
        System.out.println("Appliance: Washing Machine");
        super.showStatus();
        System.out.println("Load Capacity: " + loadCapacity + " kg");
    }
}

