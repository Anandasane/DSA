package oops.Encapsulation;

public class Student1 {
    private int id;
    private String name;
    private int age;
    private int nos;
    private String gf;

    // parameterized constructor 
    public Student1(int id, String name, int age, int nos, String gf) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
        this.gf = gf;
    }
    
    


    // methods / behaviours
    public void study(){
        System.out.println(name + " studying...");
    }

    public void sleep(){
        System.out.println(name + " sleeping...");
    }

    public void bunk(){
        System.out.println(name + " bunking...");
    }

    private void gfChatting() {
        System.out.println(name + " is chatting with " + gf);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getNos() {
        return nos;
    }

    public String getGf() {
        return gf;
    }

    // Setters with validation
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void setNos(int nos) {
        if (nos >= 0) {
            this.nos = nos;
        }
    }

    public void setGf(String gf) {
        this.gf = gf;
    }

    // Demo main method to showcase encapsulation
    public static void main(String[] args) {
        Student1 student = new Student1(1, "John", 20, 5, "Jane");
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        student.setAge(21);
        System.out.println("Updated Age: " + student.getAge());

        student.study();
        // student.id = 2; // Error: private field, demonstrates encapsulation
    }
}
