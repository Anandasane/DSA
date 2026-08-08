
 public class DisplayList{
        public  static void displayRec(Node head){
            if(head == null){
                return;
            }
            System.out.print(head.data + " ");
            displayRec(head.next);
        }
    }







public class LinkedList {
    Node head; // Head of the list

    // Static nested class for Node
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Insertion method
    public static LinkedList insert(LinkedList list, int data) {
        Node newNode = new Node(data); // Fixed: 'node' -> 'Node'
        newNode.next = null;

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    // Traversal method
    public static void printList(LinkedList list) {
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    // Deletion method
    public static LinkedList deleteByKey(LinkedList list, int key) { // Fixed: 'LinkList' -> 'LinkedList', 'deletByKey' -> 'deleteByKey'
        Node currNode = list.head, prev = null;

        // Case 1: Key is at head
        if (currNode != null && currNode.data == key) {
            list.head = currNode.next;
            System.out.println(key + " found and deleted");
            return list;
        }

        // Case 2: Key is elsewhere
        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }

        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println(key + " found and deleted");
        } else {
            System.out.println(key + " not found");
        }
        return list;
    }

   
    // Main method to test the code
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);


        a.next = b;
        b.next = c;
        c.next = d;
        d.next =e;
        
        System.out.println(a.data);
        
        System.out.println(a.next);
        System.out.println(a.next.data);



        // Insert values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);

        // Print list
        printList(list);

        // Delete key 3
        list = deleteByKey(list, 3);
        printList(list);

        // Delete key 10 (not present)
        list = deleteByKey(list, 10);

        displayRec(a);
    }
}   