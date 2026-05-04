package collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * =============================================================================
 * JAVA MAP INTERFACE - ALL IMPLEMENTATIONS
 * =============================================================================
 *
 * MAP stores data in KEY-VALUE pairs.
 * Keys are unique; values can be duplicated.
 * Map does NOT extend Collection interface.
 *
 * IMPLEMENTATIONS:
 *   1. HashMap        : Hash table, fastest, no ordering, allows one null key
 *   2. LinkedHashMap  : Maintains insertion order, slightly slower than HashMap
 *   3. TreeMap        : Sorted by keys, Red-Black tree, no null keys
 *   4. Hashtable      : Legacy, synchronized (thread-safe), no null keys/values
 *
 * TIME COMPLEXITY:
 *   | Operation    | HashMap | LinkedHashMap | TreeMap  | Hashtable |
 *   |--------------|---------|---------------|----------|-----------|
 *   | put()        | O(1)    | O(1)          | O(log n) | O(1)      |
 *   | get()        | O(1)    | O(1)          | O(log n) | O(1)      |
 *   | remove()     | O(1)    | O(1)          | O(log n) | O(1)      |
 *   | containsKey()| O(1)    | O(1)          | O(log n) | O(1)      |
 *
 * KEY POINTS:
 *   - HashMap is generally preferred for non-threaded environments
 *   - For thread safety, use ConcurrentHashMap (not Hashtable, which is legacy)
 *   - TreeMap maintains keys in sorted order (natural or Comparator)
 *   - HashMap allows one null key and multiple null values
 *   - Hashtable and ConcurrentHashMap allow NO null keys or values
 */
public class MapCollections {

    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("             JAVA MAP - ALL IMPLEMENTATIONS                 ");
        System.out.println("============================================================\n");

        // -------------------------------------------------------------------
        // DEMO 1: HashMap
        // -------------------------------------------------------------------
        System.out.println("1. HASHMAP");
        System.out.println("   Fastest Map. No ordering guarantee. Allows one null key.");
        System.out.println("-------------------------------------------------------------");

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);
        hashMap.put("Alice", 26);     // Overwrites previous value
        hashMap.put(null, 0);          // One null key allowed
        hashMap.put("NullValue", null); // Null values allowed

        System.out.println("HashMap: " + hashMap);
        System.out.println("Size: " + hashMap.size());
        System.out.println("Alice's age: " + hashMap.get("Alice"));
        System.out.println("Contains 'Bob'? " + hashMap.containsKey("Bob"));
        System.out.println("Contains age 30? " + hashMap.containsValue(30));
        hashMap.remove("Charlie");
        System.out.println("After removing Charlie: " + hashMap);
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 2: LinkedHashMap
        // -------------------------------------------------------------------
        System.out.println("2. LINKEDHASHMAP");
        System.out.println("   Maintains insertion order. Slightly slower than HashMap.");
        System.out.println("-------------------------------------------------------------");

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("First", "1st");
        linkedHashMap.put("Second", "2nd");
        linkedHashMap.put("Third", "3rd");
        linkedHashMap.put("First", "Updated 1st"); // Overwrite

        System.out.println("LinkedHashMap: " + linkedHashMap);
        System.out.println("Iteration order matches insertion order!");
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 3: TreeMap
        // -------------------------------------------------------------------
        System.out.println("3. TREEMAP");
        System.out.println("   Keys sorted in natural order. Backed by Red-Black tree.");
        System.out.println("-------------------------------------------------------------");

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(45, "Forty-Five");
        treeMap.put(12, "Twelve");
        treeMap.put(89, "Eighty-Nine");
        treeMap.put(23, "Twenty-Three");
        treeMap.put(67, "Sixty-Seven");
        // treeMap.put(null, "Null"); // NullPointerException!

        System.out.println("TreeMap (sorted by keys): " + treeMap);
        System.out.println("First Key: " + treeMap.firstKey());
        System.out.println("Last Key: " + treeMap.lastKey());
        System.out.println("Lower than 50: " + treeMap.lowerKey(50));
        System.out.println("Higher than 50: " + treeMap.higherKey(50));
        System.out.println("SubMap [20, 70): " + treeMap.subMap(20, 70));
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 4: Hashtable
        // -------------------------------------------------------------------
        System.out.println("4. HASHTABLE");
        System.out.println("   Legacy synchronized Map. Thread-safe but slower.");
        System.out.println("   NO null keys or values allowed.");
        System.out.println("-------------------------------------------------------------");

        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        hashtable.put("Three", 3);
        // hashtable.put(null, 0); // NullPointerException!

        System.out.println("Hashtable: " + hashtable);
        System.out.println("Size: " + hashtable.size());
        System.out.println("Get 'Two': " + hashtable.get("Two"));
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 5: Iterating Over Maps
        // -------------------------------------------------------------------
        System.out.println("5. ITERATING OVER MAPS");
        System.out.println("   Different ways to traverse key-value pairs.");
        System.out.println("-------------------------------------------------------------");

        Map<String, Double> scores = new HashMap<>();
        scores.put("Math", 95.5);
        scores.put("Science", 88.0);
        scores.put("English", 92.5);

        // Method 1: EntrySet
        System.out.println("Using entrySet():");
        for (Map.Entry<String, Double> entry : scores.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
        }

        // Method 2: KeySet
        System.out.println("Using keySet():");
        for (String subject : scores.keySet()) {
            System.out.println("  " + subject + " -> " + scores.get(subject));
        }

        // Method 3: forEach (Java 8+)
        System.out.println("Using forEach():");
        scores.forEach((key, value) -> System.out.println("  " + key + " -> " + value));
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 6: Map Utilities
        // -------------------------------------------------------------------
        System.out.println("6. MAP UTILITIES");
        System.out.println("   Common operations and checks.");
        System.out.println("-------------------------------------------------------------");

        Map<String, Integer> mapA = new HashMap<>();
        mapA.put("A", 1); mapA.put("B", 2);

        Map<String, Integer> mapB = new HashMap<>();
        mapB.put("B", 2); mapB.put("C", 3);

        System.out.println("Map A: " + mapA);
        System.out.println("Map B: " + mapB);

        // Merge maps
        Map<String, Integer> merged = new HashMap<>(mapA);
        merged.putAll(mapB);
        System.out.println("Merged (A + B): " + merged);

        // Check if empty
        System.out.println("Is mapA empty? " + mapA.isEmpty());

        // Replace value
        mapA.replace("A", 10);
        System.out.println("After replace 'A' with 10: " + mapA);

        // GetOrDefault
        System.out.println("Get 'Z' or default 0: " + mapA.getOrDefault("Z", 0));
        System.out.println();

        // -------------------------------------------------------------------
        // SUMMARY
        // -------------------------------------------------------------------
        System.out.println("============================================================");
        System.out.println("                        SUMMARY                             ");
        System.out.println("============================================================");
        System.out.println("HashMap:        Fastest, unordered, allows null key/value");
        System.out.println("LinkedHashMap:  Maintains insertion order, allows null");
        System.out.println("TreeMap:        Sorted by keys, no null, O(log n) ops");
        System.out.println("Hashtable:      Synchronized, legacy, no null allowed");
        System.out.println();
        System.out.println("Recommendation: Use HashMap for general purpose");
        System.out.println("                 Use TreeMap when sorted keys needed");
        System.out.println("                 Use ConcurrentHashMap for thread safety");
        System.out.println("============================================================");
    }
}

