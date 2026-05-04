package collections.Queue;

import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
import java.util.Comparator;

/**
 * =============================================================================
 * JAVA QUEUE & DEQUE INTERFACE - ALL IMPLEMENTATIONS
 * =============================================================================
 *
 * QUEUE follows FIFO (First-In-First-Out) principle.
 * Used for holding elements prior to processing.
 *
 * DEQUE (Double Ended Queue) allows insertion and removal at both ends.
 * Can be used as Stack (LIFO) or Queue (FIFO).
 *
 * IMPLEMENTATIONS:
 *   1. PriorityQueue : Elements ordered by priority (natural or custom)
 *   2. ArrayDeque    : Resizable array, faster than LinkedList, no nulls
 *   3. LinkedList    : Doubly-linked, can act as Queue or Deque
 *
 * QUEUE METHODS:
 *   | Operation | Throws Exception | Returns Special Value |
 *   |-----------|------------------|-----------------------|
 *   | Insert    | add(e)           | offer(e)              |
 *   | Remove    | remove()         | poll()                |
 *   | Examine   | element()        | peek()                |
 *
 * TIME COMPLEXITY:
 *   | Operation    | PriorityQueue | ArrayDeque | LinkedList |
 *   |--------------|---------------|------------|------------|
 *   | offer()      | O(log n)      | O(1)       | O(1)       |
 *   | poll()       | O(log n)      | O(1)       | O(1)       |
 *   | peek()       | O(1)          | O(1)       | O(1)       |
 *   | addFirst()   | N/A           | O(1)       | O(1)       |
 *   | removeLast() | N/A           | O(1)       | O(1)       |
 */
public class QueueCollections {

    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("           JAVA QUEUE & DEQUE - ALL IMPLEMENTATIONS         ");
        System.out.println("============================================================\n");

        // -------------------------------------------------------------------
        // DEMO 1: PriorityQueue (Min-Heap by default)
        // -------------------------------------------------------------------
        System.out.println("1. PRIORITYQUEUE");
        System.out.println("   Elements ordered by priority. Default: Min-Heap (ascending).");
        System.out.println("-------------------------------------------------------------");

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(45);
        minHeap.offer(12);
        minHeap.offer(89);
        minHeap.offer(23);
        minHeap.offer(67);

        System.out.println("PriorityQueue: " + minHeap);
        System.out.println("Peek (highest priority/smallest): " + minHeap.peek());
        System.out.print("Poll order: ");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 2: PriorityQueue (Max-Heap)
        // -------------------------------------------------------------------
        System.out.println("2. PRIORITYQUEUE AS MAX-HEAP");
        System.out.println("   Using reverseOrder() comparator for descending priority.");
        System.out.println("-------------------------------------------------------------");

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.offer(45);
        maxHeap.offer(12);
        maxHeap.offer(89);
        maxHeap.offer(23);
        maxHeap.offer(67);

        System.out.print("Max-Heap poll order: ");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
        System.out.println();
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 3: ArrayDeque as Queue (FIFO)
        // -------------------------------------------------------------------
        System.out.println("3. ARRAYDEQUE AS QUEUE (FIFO)");
        System.out.println("   Fastest Queue implementation. Resizable array.");
        System.out.println("-------------------------------------------------------------");

        Queue<String> queue = new ArrayDeque<>();
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println("Queue: " + queue);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("After poll: " + queue);
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 4: ArrayDeque as Deque
        // -------------------------------------------------------------------
        System.out.println("4. ARRAYDEQUE AS DEQUE (Double Ended Queue)");
        System.out.println("   Insert and remove from BOTH ends.");
        System.out.println("-------------------------------------------------------------");

        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("First");
        deque.addLast("Last");
        deque.addFirst("New First");
        deque.addLast("New Last");

        System.out.println("Deque: " + deque);
        System.out.println("RemoveFirst: " + deque.removeFirst());
        System.out.println("RemoveLast: " + deque.removeLast());
        System.out.println("After removals: " + deque);
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 5: ArrayDeque as Stack (LIFO)
        // -------------------------------------------------------------------
        System.out.println("5. ARRAYDEQUE AS STACK (LIFO)");
        System.out.println("   Preferred over Stack class (legacy). Faster and cleaner.");
        System.out.println("-------------------------------------------------------------");

        Deque<String> stack = new ArrayDeque<>();
        stack.push("Bottom");
        stack.push("Middle");
        stack.push("Top");

        System.out.println("Stack: " + stack);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("After pop: " + stack);
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 6: LinkedList as Queue
        // -------------------------------------------------------------------
        System.out.println("6. LINKEDLIST AS QUEUE");
        System.out.println("   Doubly-linked list implementing Queue interface.");
        System.out.println("-------------------------------------------------------------");

        Queue<Integer> linkedQueue = new LinkedList<>();
        linkedQueue.offer(100);
        linkedQueue.offer(200);
        linkedQueue.offer(300);

        System.out.println("LinkedList Queue: " + linkedQueue);
        System.out.println("Poll: " + linkedQueue.poll());
        System.out.println("Remaining: " + linkedQueue);
        System.out.println();

        // -------------------------------------------------------------------
        // DEMO 7: PriorityQueue with Custom Objects
        // -------------------------------------------------------------------
        System.out.println("7. PRIORITYQUEUE WITH CUSTOM OBJECTS");
        System.out.println("   Must implement Comparable or provide Comparator.");
        System.out.println("-------------------------------------------------------------");

        PriorityQueue<Task> tasks = new PriorityQueue<>();
        tasks.offer(new Task("Email", 3));
        tasks.offer(new Task("Bug Fix", 1));
        tasks.offer(new Task("Meeting", 2));

        System.out.println("Tasks by priority:");
        while (!tasks.isEmpty()) {
            System.out.println("  " + tasks.poll());
        }
        System.out.println();

        // -------------------------------------------------------------------
        // SUMMARY
        // -------------------------------------------------------------------
        System.out.println("============================================================");
        System.out.println("                        SUMMARY                             ");
        System.out.println("============================================================");
        System.out.println("PriorityQueue: Priority ordering, min-heap by default");
        System.out.println("ArrayDeque:    Fastest Queue/Deque/Stack, resizable array");
        System.out.println("LinkedList:    Doubly-linked, flexible but more overhead");
        System.out.println();
        System.out.println("Recommendation: Use ArrayDeque for Queue/Stack operations");
        System.out.println("                 Use PriorityQueue for priority processing");
        System.out.println("============================================================");
    }
}

/**
 * Custom class for PriorityQueue demonstration.
 * Implements Comparable for natural ordering by priority.
 */
class Task implements Comparable<Task> {
    String name;
    int priority; // Lower number = higher priority

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + "}";
    }
}

