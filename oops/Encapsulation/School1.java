package oops.Encapsulation;

public class School1 {
    private String name;
    private String address;
    private int totalStudents;

    // Constructor
    public School1(String name, String address) {
        this.name = name;
        this.address = address;
        this.totalStudents = 0;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Getter for totalStudents
    public int getTotalStudents() {
        return totalStudents;
    }

    // Method to add a student (increment student count)
    public void addStudent() {
        totalStudents++;
    }

    // Method to remove a student (decrement student count)
    public void removeStudent() {
        if (totalStudents > 0) {
            totalStudents--;
        }
    }

    // Display school information
    public void displaySchoolInfo() {
        System.out.println("School Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Total Students: " + totalStudents);
    }

    // Setters with validation
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public void setAddress(String address) {
        if (address != null && !address.trim().isEmpty()) {
            this.address = address;
        }
    }

    // Demo usage showing encapsulation
    public static void main(String[] args) {
        School1 school = new School1("ABC School", "123 Main St");
        school.addStudent();
        school.addStudent();
        school.displaySchoolInfo();

        school.setName("XYZ School");
        System.out.println("Updated School Name: " + school.getName());
        // school.name = "Invalid"; // Error: private field
    }
}
