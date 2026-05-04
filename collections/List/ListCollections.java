package collections.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.Collections;
import java.util.Iterator;

/**
 * =============================================================================
 * JAVA LIST INTERFACE - ALL IMPLEMENTATIONS
 * =============================================================================
 *
 * LIST is an ordered collection (sequence) that allows duplicate elements.
 * It maintains insertion order and provides indexed access (0-based).
 *
 * IMPLEMENTATIONS:
 *   1. ArrayList  : Dynamic array, fast random access, slow insertions in middle
 *   2. LinkedList : Doubly-linked list, fast insertions/deletions, slow random access
 *   3. Vector     : Legacy dynamic array, synchronized (thread-safe), slower
 *   4. Stack      : Legacy LIFO structure, extends Vector
 *
 * TIME COMPLEXITY:
 *   | Operation    | ArrayList | LinkedList | Vector  |
 *   |--------------|-----------|------------|---------|
 *   | get(index)   | O(1)      | O(n)       | O(1)    |
 *   | add(end)     | O(1)*     | O(1)       | O(1)*   |
 *   | add(middle)  | O(n)      | O(1)       | O(n)    |
 *   | remove(end)  | O(1)      | O(1)       | O(1)    |
 *   | remove(mid)  | O(n)      | O(1)       | O(n)    |
 *   | contains()   | O(n)      | O(n)       | O(n)    |
 *
 *   *Amortized - may require array resizing
 */
public class ListCollections {

    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("             JAVA LIST - ALL IMPLEMENTATIONS                ");
        System.out.println("============================================================\n");

        // -------------------------------------------------------------------
        // DEMO 1: ArrayList
        // -------------------------------------------------------------------
        System.out.println("1. ARRAYLIST");
        System.out.println("   Backed by dynamic array. Best for: frequent reads, few insertions.");
        System.out.println("-------------------------------------------------------------");

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Apple"); // Duplicates allowed

        System.out.println("ArrayList: " + arrayList);
        System.out.println("Size: " + arrayList.size());
        System.out.println("Element at index 1: " + arrayList.get(1));
        arrayList.remove("Banana");
        System.out.println("After removing 'Banana': " + arrayList);
        System.out.println("Contains 'Cherry'? " + arrayList.contains("Cherry"));
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 2: LinkedList
        // -------------------------------------------------------------------
        System.out.println("2. LINKEDLIST");
        System.out.println("   Doubly-linked list. Best for: frequent insertions/deletions.");
        System.out.println("-------------------------------------------------------------");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.addFirst("Blue");   // Insert at beginning
        linkedList.addLast("Yellow");  // Insert at end

        System.out.println("LinkedList: " + linkedList);
        System.out.println("First: " + linkedList.getFirst());
        System.out.println("Last: " + linkedList.getLast());
        linkedList.removeFirst();
        System.out.println("After removeFirst: " + linkedList);
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 3: Vector
        // -------------------------------------------------------------------
        System.out.println("3. VECTOR");
        System.out.println("   Legacy synchronized dynamic array. Thread-safe but slower.");
        System.out.println("-------------------------------------------------------------");

        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(1, 15); // Insert at index 1

        System.out.println("Vector: " + vector);
        System.out.println("Capacity: " + vector.capacity());
        System.out.println("Size: " + vector.size());
        System.out.println("Element at index 2: " + vector.get(2));
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 4: Stack (LIFO)
        // -------------------------------------------------------------------
        System.out.println("4. STACK (LIFO)");
        System.out.println("   Extends Vector. Last-In-First-Out operations.");
        System.out.println("-------------------------------------------------------------");

        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println("Stack: " + stack);
        System.out.println("Peek (top): " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("After pop: " + stack);
        System.out.println("Is empty? " + stack.isEmpty());
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 5: Iteration Techniques
        // -------------------------------------------------------------------
        System.out.println("5. ITERATION TECHNIQUES");
        System.out.println("   Different ways to traverse a List.");
        System.out.println("-------------------------------------------------------------");

        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.print("For-Each: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        System.out.print("Iterator: ");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.print("For-Loop: ");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) + " ");
        }
        System.out.println();
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 6: Sorting and Searching
        // -------------------------------------------------------------------
        System.out.println("6. SORTING AND SEARCHING");
        System.out.println("   Using Collections utility class.");
        System.out.println("-------------------------------------------------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(23);
        numbers.add(67);

        System.out.println("Original: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted (ascending): " + numbers);
        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);
        int index = Collections.binarySearch(numbers, 67);
        System.out.println("Binary search for 67 (in reversed): index = " + index);
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 7: Polymorphism with List Interface
        // -------------------------------------------------------------------
        System.out.println("7. POLYMORPHISM WITH LIST");
        System.out.println("   Same List reference can point to different implementations.");
        System.out.println("-------------------------------------------------------------");

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        list1.add("ArrayList Element");
        list2.add("LinkedList Element");

        System.out.println("list1 (ArrayList): " + list1);
        System.out.println("list2 (LinkedList): " + list2);
        System.out.println();

        // -------------------------------------------------------------------
        // SUMMARY
        // -------------------------------------------------------------------
        System.out.println("============================================================");
        System.out.println("                        SUMMARY                             ");
        System.out.println("============================================================");
        System.out.println("ArrayList:  Dynamic array, fast access, frequent reads");
        System.out.println("LinkedList: Doubly-linked, fast insert/delete, queue ops");
        System.out.println("Vector:     Synchronized ArrayList, thread-safe, legacy");
        System.out.println("Stack:      LIFO operations, extends Vector");
        System.out.println("============================================================");
    }
}

