package collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

/**
 * =============================================================================
 * JAVA SET INTERFACE - ALL IMPLEMENTATIONS
 * =============================================================================
 *
 * SET is a collection that does NOT allow duplicate elements.
 * It models the mathematical set abstraction.
 *
 * IMPLEMENTATIONS:
 *   1. HashSet        : Uses hash table, fastest, no ordering guarantee
 *   2. LinkedHashSet  : Maintains insertion order, slightly slower than HashSet
 *   3. TreeSet        : Sorted order (natural or custom), backed by Red-Black tree
 *
 * TIME COMPLEXITY:
 *   | Operation    | HashSet | LinkedHashSet | TreeSet |
 *   |--------------|---------|---------------|---------|
 *   | add()        | O(1)    | O(1)          | O(log n)|
 *   | remove()     | O(1)    | O(1)          | O(log n)|
 *   | contains()   | O(1)    | O(1)          | O(log n)|
 *   | Iteration    | O(n)    | O(n)          | O(n)    |
 *
 * KEY POINTS:
 *   - All Set implementations reject duplicates (add() returns false)
 *   - null is allowed in HashSet and LinkedHashSet (only one)
 *   - TreeSet does NOT allow null elements
 *   - For custom objects, override equals() and hashCode() in HashSet/LinkedHashSet
 *   - For TreeSet, implement Comparable or provide Comparator
 */
public class SetCollections {

    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("             JAVA SET - ALL IMPLEMENTATIONS                 ");
        System.out.println("============================================================\n");

        // -------------------------------------------------------------------
        // DEMO 1: HashSet
        // -------------------------------------------------------------------
        System.out.println("1. HASHSET");
        System.out.println("   Uses hash table. Fastest operations. No ordering guarantee.");
        System.out.println("-------------------------------------------------------------");

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Cherry");
        hashSet.add("Banana"); // Duplicate - ignored
        hashSet.add(null);     // Allows one null

        System.out.println("HashSet: " + hashSet);
        System.out.println("Size: " + hashSet.size());
        System.out.println("Contains 'Apple'? " + hashSet.contains("Apple"));
        hashSet.remove("Cherry");
        System.out.println("After removing 'Cherry': " + hashSet);
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 2: LinkedHashSet
        // -------------------------------------------------------------------
        System.out.println("2. LINKEDHASHSET");
        System.out.println("   Maintains insertion order. Slightly slower than HashSet.");
        System.out.println("-------------------------------------------------------------");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("First");
        linkedHashSet.add("Second");
        linkedHashSet.add("Third");
        linkedHashSet.add("First"); // Duplicate - ignored

        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("Iteration order matches insertion order!");
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 3: TreeSet
        // -------------------------------------------------------------------
        System.out.println("3. TREESET");
        System.out.println("   Sorted order (ascending). Backed by Red-Black tree.");
        System.out.println("-------------------------------------------------------------");

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(45);
        treeSet.add(12);
        treeSet.add(89);
        treeSet.add(23);
        treeSet.add(67);
        // treeSet.add(null); // NullPointerException!

        System.out.println("TreeSet (sorted): " + treeSet);
        System.out.println("First: " + treeSet.first());
        System.out.println("Last: " + treeSet.last());
        System.out.println("Lower than 50: " + treeSet.lower(50));
        System.out.println("Higher than 50: " + treeSet.higher(50));
        System.out.println("Subset [20, 70): " + treeSet.subSet(20, 70));
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 4: Set Operations (Mathematical)
        // -------------------------------------------------------------------
        System.out.println("4. SET OPERATIONS (Mathematical)");
        System.out.println("   Union, Intersection, Difference.");
        System.out.println("-------------------------------------------------------------");

        Set<Integer> setA = new HashSet<>();
        setA.add(1); setA.add(2); setA.add(3); setA.add(4);

        Set<Integer> setB = new HashSet<>();
        setB.add(3); setB.add(4); setB.add(5); setB.add(6);

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);

        // Union
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println("Union (A U B): " + union);

        // Intersection
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection (A n B): " + intersection);

        // Difference
        Set<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);
        System.out.println("Difference (A - B): " + difference);
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 5: Custom Objects in Set
        // -------------------------------------------------------------------
        System.out.println("5. CUSTOM OBJECTS IN SET");
        System.out.println("   Must override equals() and hashCode() for HashSet/LinkedHashSet.");
        System.out.println("   Must implement Comparable for TreeSet.");
        System.out.println("-------------------------------------------------------------");

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student(1, "Alice"));
        studentSet.add(new Student(2, "Bob"));
        studentSet.add(new Student(1, "Alice")); // Duplicate if equals/hashCode correct

        System.out.println("Student HashSet size (should be 2): " + studentSet.size());
        System.out.println("Students: " + studentSet);

        TreeSet<Student> sortedStudents = new TreeSet<>();
        sortedStudents.add(new Student(3, "Charlie"));
        sortedStudents.add(new Student(1, "Alice"));
        sortedStudents.add(new Student(2, "Bob"));
        System.out.println("Sorted Students (by ID): " + sortedStudents);
        System.out.println();

        // -------------------------------------------------------------------
        // SUMMARY
        // -------------------------------------------------------------------
        System.out.println("============================================================");
        System.out.println("                        SUMMARY                             ");
        System.out.println("============================================================");
        System.out.println("HashSet:        Fastest, unordered, allows null");
        System.out.println("LinkedHashSet:  Maintains insertion order, allows null");
        System.out.println("TreeSet:        Sorted order, no null, slower O(log n)");
        System.out.println("============================================================");
    }
}

/**
 * Custom class for Set demonstration.
 * Implements Comparable for TreeSet and overrides equals/hashCode for HashSet.
 */
class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

