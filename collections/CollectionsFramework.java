package collections;

/**
 * =============================================================================
 * JAVA COLLECTION FRAMEWORK - OVERVIEW
 * =============================================================================
 *
 * The Java Collection Framework (JCF) is a unified architecture for representing
 * and manipulating collections of objects. It reduces programming effort and
 * increases performance by providing high-performance, reusable data structures.
 *
 * HIERARCHY:
 *                    Iterable (interface)
 *                         |
 *                    Collection (interface)
 *                    /      |      \
 *                 List      Set     Queue
 *                  |        / \       |
 *             ArrayList  HashSet  SortedSet  PriorityQueue
 *             LinkedList LinkedHashSet   |      Deque
 *             Vector              TreeSet    ArrayDeque
 *             Stack
 *
 * CORE INTERFACES:
 *   1. Collection: Root interface for all collections except Map.
 *   2. List: Ordered collection, allows duplicates, indexed access.
 *   3. Set: Unordered collection, no duplicates.
 *   4. Queue: FIFO collection for holding elements prior to processing.
 *   5. Map: Key-value pairs, not part of Collection hierarchy.
 *
 * KEY CLASSES:
 *   List  -> ArrayList, LinkedList, Vector, Stack
 *   Set   -> HashSet, LinkedHashSet, TreeSet
 *   Queue -> PriorityQueue, ArrayDeque, LinkedList
 *   Map   -> HashMap, LinkedHashMap, TreeMap, Hashtable
 *
 * WHEN TO USE WHAT:
 *   | Need               | Use                          |
 *   |--------------------|------------------------------|
 *   | Fast random access | ArrayList                    |
 *   | Frequent insertions| LinkedList                   |
 *   | Thread-safe List   | Vector, Collections.synchronizedList |
 *   | Unique elements    | HashSet (fast), TreeSet (sorted) |
 *   | Maintain insertion | LinkedHashSet                |
 *   | Key-Value lookup   | HashMap                      |
 *   | Sorted Map         | TreeMap                      |
 *   | Thread-safe Map    | Hashtable, ConcurrentHashMap |
 */
public class CollectionsFramework {

    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("        JAVA COLLECTION FRAMEWORK - OVERVIEW                ");
        System.out.println("============================================================\n");

        System.out.println("The Collection Framework provides:");
        System.out.println("  1. Interfaces: Define common behavior (List, Set, Map, Queue)");
        System.out.println("  2. Implementations: Concrete classes (ArrayList, HashSet, etc.)");
        System.out.println("  3. Algorithms: Sorting, searching, shuffling, etc.");
        System.out.println();

        System.out.println("-------------------------------------------------------------");
        System.out.println("All collections (except Map) extend the Collection interface,");
        System.out.println("which extends Iterable, allowing enhanced for-loops.");
        System.out.println("-------------------------------------------------------------");

        System.out.println();
        System.out.println("Key Differences:");
        System.out.println("  List: Ordered, allows duplicates, indexed");
        System.out.println("  Set : Unordered, unique elements only");
        System.out.println("  Map : Key-value pairs, unique keys");
        System.out.println("  Queue: FIFO processing order");
        System.out.println();

        System.out.println("============================================================");
        System.out.println("        Explore sub-packages for detailed demos:             ");
        System.out.println("        collections.List, collections.Set                    ");
        System.out.println("        collections.Queue, collections.Map                   ");
        System.out.println("============================================================");
    }
}

