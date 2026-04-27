package oops.Abstraction;

/**
 * Concrete subclass of Appliance representing a Refrigerator.
 *
 * Provides its own implementation of the operate() method.
 */
class Refrigerator extends Appliance {

    private double temperature;

    Refrigerator(String brand, double temperature) {
        super(brand);
        this.temperature = temperature;
    }

    @Override
    void operate() {
        if (isOn) {
            System.out.println(brand + " refrigerator is cooling at " + temperature + "°C.");
        } else {
            System.out.println(brand + " refrigerator is OFF. Turn it on first.");
        }
    }

    void setTemperature(double temperature) {
        this.temperature = temperature;
        System.out.println(brand + " refrigerator temperature set to " + temperature + "°C.");
    }

    @Override
    void showStatus() {
        System.out.println("Appliance: Refrigerator");
        super.showStatus();
        System.out.println("Temperature: " + temperature + "°C");
    }
}

