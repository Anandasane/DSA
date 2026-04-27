package oops.Abstraction;

/**
 * Concrete subclass extending the abstract class Animal.
 *
 * Dog provides its own implementation of the abstract method makeSound().
 * It also inherits the concrete methods sleep() and displayInfo() from Animal.
 */
class Dog extends Animal {

    private String breed;

    Dog(String name, int age, String breed) {
        super(name, age); // Calls Animal's constructor
        this.breed = breed;
    }

    // Implementation of the abstract method from Animal
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }

    // Dog-specific behavior
    void fetch() {
        System.out.println(name + " the " + breed + " is fetching the ball.");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
        System.out.println("Type: Dog");
    }
}

