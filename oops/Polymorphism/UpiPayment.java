package oops.Polymorphism;

/**
 * Another child class overriding pay().
 *
 * At runtime, Java checks the actual object type and calls that version of pay().
 */
class UpiPayment extends Payment {
    private String upiId;

    UpiPayment(String payerName, String upiId) {
        super(payerName);
        this.upiId = upiId;
    }

    @Override
    void pay(double amount) {
        System.out.println(payerName + " paid Rs." + amount + " using UPI ID: " + upiId);
    }
}
