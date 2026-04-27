package oops.Polymorphism;

/**
 * COMPILE-TIME POLYMORPHISM / STATIC POLYMORPHISM
 *
 * This is achieved using METHOD OVERLOADING.
 * Method overloading means:
 *   - same method name
 *   - different parameter list
 *   - compiler decides which method to call at compile time
 *
 * Return type alone cannot overload a method in Java.
 */
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
