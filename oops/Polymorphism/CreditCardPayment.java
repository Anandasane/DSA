package oops.Polymorphism;

/**
 * Child class overriding pay().
 *
 * The method name and parameters are the same as the parent method,
 * but the behavior is different.
 */
class CreditCardPayment extends Payment {
    private String cardLastFourDigits;

    CreditCardPayment(String payerName, String cardLastFourDigits) {
        super(payerName);
        this.cardLastFourDigits = cardLastFourDigits;
    }

    @Override
    void pay(double amount) {
        System.out.println(payerName + " paid Rs." + amount
                + " using credit card ending with " + cardLastFourDigits);
    }
}
