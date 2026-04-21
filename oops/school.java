package oops;

public class school {
    public static void main(String[] args) throws Exception{
       //  System.out.println("welcome to school");
       // default constructor
       // object creation
        //    student s1 = new student();

        //    System.out.println(s1.name);
        //     // setting values using object
        //    s1.id = 1;
        //    s1.name = "abc";
        //    s1.age = 15;
        //    s1.nos = 23;
        //    // printing values
        //    System.out.println(s1.id);
        //    System.out.println(s1.name);
        //    System.out.println(s1.age);
        //    System.out.println(s1.nos);
        //     // calling methods using object
        //    s1.study();
        //    s1.sleep();
        //    s1.bunk();

        // parametersied constructor
         Student s1 = new Student(1, "Anand", 12, 3);
        // System.out.println(s1.id);
        // System.out.println(s1.name);
        // System.out.println(s1.age);
        // System.out.println(s1.nos);

        s1.bunk();
        s1.sleep();
        s1.study();
        // copy constructor initialization
        Student s2 = new Student(s1);
        System.out.println(s2.id);
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.nos);

    }
    
}
