package oops.Polymorphism;

/**
 * Base class for RUNTIME POLYMORPHISM.
 *
 * Runtime polymorphism is achieved using METHOD OVERRIDING.
 * A child class provides its own implementation of a method already present
 * in the parent class.
 */
class Payment {
    String payerName;

    Payment(String payerName) {
        this.payerName = payerName;
    }

    void pay(double amount) {
        System.out.println(payerName + " is making a general payment of Rs." + amount);
    }
}
