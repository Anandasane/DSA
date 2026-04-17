/*
understanding the array list and its various methods like
add, remove, get, set, size, clear, contains, indexOf, lastIndexOf, isEmpty and so on with examples and explanations.
*/
import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(); // creating an array list of integers
    // array list does not length it has size
    // adding elements to the array list
    list.add(10); // adding 10 to the array list
    list.add(20); // adding 20 to the array list
    list.add(30); // adding 30 to the array list
    list.add(40); // adding 40 to the array list
    list.add(50); // adding 50 to the array list
    list.add(60); // adding 60 to the array list

    System.out.println("The array list is: " + list); // printing the array list

    // getting the element at a specific index
    System.out.println("The element at index 2 is: " + list.get(2)); // getting the element at index 2

    // setting the element at a specific index
    list.set(2, 100); // setting the element at index 2 to 100
    System.out.println("The array list is: " + list); // printing the array list

    // removing the element at a specific index
    list.remove(3); // removing the element at index 3
    System.out.println("The array list is: " + list); // printing the array list

    // getting the size of the array list
    System.out.println("The size of the array list is: " + list.size()); // getting the size of the array list

    // clearing the array list

    list.clear(); // clearing the array list
    System.out.println("The array list is: " + list); // printing the array list

    // checking if the array list is empty
    System.out.println("The array list is empty: " + list.isEmpty()); // checking if the array list is empty

    // checking if the array list contains an element
    System.out.println("The array list contains 10: " + list.contains(10)); // checking if the array list contains 10

    // reversing the array list
    Collections.reverse(list); // reversing the array list
    System.out.println("The reversed array list is: " + list); // printing the reversed array list  



    }
    
}
