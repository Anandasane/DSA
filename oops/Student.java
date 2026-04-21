package oops;

public class Student {
    // Attributes
    public int id;
    public String name;
    public int age;
    public int nos;

    // default constructor
    public Student(){
        System.out.println("Student default constructor called");
    }

    // parametrized constructor
    public Student(int id, String name, int age, int nos){
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
    }

    // copy constructor
    public Student(Student srcobj){
        System.out.println("copy constructor is called ");
        this.id = srcobj.id;
        this.name = srcobj.name;
        this.age = srcobj.age;
        this.nos = srcobj.nos;
    }

    // Methods
    public void study(){
        System.out.println(name + " studying...");
    }

    public void sleep(){
        System.out.println(name + " sleeping...");
    }
    
    public void bunk(){
        System.out.println(name + " bunking...");
    }
}
