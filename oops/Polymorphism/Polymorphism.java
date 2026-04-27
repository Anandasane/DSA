package oops.Polymorphism;

/**
 * =============================================================================
 * JAVA POLYMORPHISM - TYPES AND EXAMPLES
 * =============================================================================
 *
 * POLYMORPHISM means "many forms".
 * In Java, it means the same method name or reference type can behave
 * differently depending on arguments or actual object type.
 *
 * IMPORTANT TYPES:
 *   1. Compile-time Polymorphism / Static Polymorphism
 *      - Achieved by method overloading
 *      - Compiler decides which method to call
 *
 *   2. Runtime Polymorphism / Dynamic Polymorphism
 *      - Achieved by method overriding
 *      - JVM decides which method to call at runtime
 *
 *   3. Interface / Subtype Polymorphism
 *      - Parent class or interface reference stores child class objects
 *      - Helps write flexible and reusable code
 *
 * NOTE:
 * Java does not support custom operator overloading like C++.
 * The + operator works with String because Java provides built-in support for it.
 */
public class Polymorphism {

    public static void main(String[] args) {

        System.out.println("============================================================");
        System.out.println("             JAVA POLYMORPHISM - ALL TYPES DEMO             ");
        System.out.println("============================================================\n");

        // -------------------------------------------------------------------
        // DEMO 1: COMPILE-TIME POLYMORPHISM
        // -------------------------------------------------------------------
        System.out.println("1. COMPILE-TIME POLYMORPHISM");
        System.out.println("   Achieved using method overloading.");
        System.out.println("   Same method name, different parameter lists.");
        System.out.println("-------------------------------------------------------------");

        Calculator calculator = new Calculator();

        System.out.println("add(int, int): " + calculator.add(10, 20));
        System.out.println("add(int, int, int): " + calculator.add(10, 20, 30));
        System.out.println("add(double, double): " + calculator.add(10.5, 20.7));
        System.out.println("add(String, String): " + calculator.add("Swami", "Anand"));
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 2: RUNTIME POLYMORPHISM
        // -------------------------------------------------------------------
        System.out.println("2. RUNTIME POLYMORPHISM");
        System.out.println("   Achieved using method overriding.");
        System.out.println("   Parent reference can call child class overridden methods.");
        System.out.println("-------------------------------------------------------------");

        Payment payment1 = new CreditCardPayment("Rahul", "1234");
        Payment payment2 = new UpiPayment("Priya", "priya@upi");

        // Both references are of type Payment.
        // But Java calls the method based on actual object type at runtime.
        payment1.pay(2500.00);
        payment2.pay(900.50);
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 3: INTERFACE / SUBTYPE POLYMORPHISM
        // -------------------------------------------------------------------
        System.out.println("3. INTERFACE / SUBTYPE POLYMORPHISM");
        System.out.println("   Interface reference can store objects of implementing classes.");
        System.out.println("-------------------------------------------------------------");

        Drawable shape1 = new Circle();
        Drawable shape2 = new Rectangle();

        shape1.draw();
        shape2.draw();
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 4: POLYMORPHISM WITH ARRAYS
        // -------------------------------------------------------------------
        System.out.println("4. POLYMORPHISM WITH ARRAYS");
        System.out.println("   One parent array can store different child objects.");
        System.out.println("-------------------------------------------------------------");

        Payment[] payments = {
                new CreditCardPayment("Aman", "9876"),
                new UpiPayment("Neha", "neha@okaxis"),
                new Payment("General User")
        };

        for (Payment payment : payments) {
            payment.pay(500.00);
        }

        System.out.println();
        System.out.println("============================================================");
        System.out.println("                        SUMMARY                             ");
        System.out.println("============================================================");
        System.out.println("Compile-time:  Method overloading, decided by compiler");
        System.out.println("Runtime:       Method overriding, decided by actual object");
        System.out.println("Interface:     Interface reference points to many implementations");
        System.out.println("Array example: Parent type stores multiple child object types");
        System.out.println("============================================================");
    }
}
