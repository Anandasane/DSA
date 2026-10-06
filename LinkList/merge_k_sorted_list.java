class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MergeKLists {

    // Merges K sorted linked lists using nested while loops
    static Node mergeKLists(Node[] lists, int k) {
        if (k == 0 || lists[0] == null) return null;

        // Start with the first list as the base
        Node merged = lists[0];

        // Outer while: iterate over remaining k-1 lists
        int listIdx = 1;
        while (listIdx < k) {
            Node curr = lists[listIdx];

            // Inner while: insert each node of current list into merged
            while (curr != null) {
                Node temp = curr;
                curr = curr.next;  // advance before modifying

                // Find position to insert in merged list
                if (merged.data >= temp.data) {
                    // Insert at head
                    temp.next = merged;
                    merged = temp;
                } else {
                    // Traverse to find correct position
                    Node prev = merged;
                    while (prev.next != null && prev.next.data < temp.data) {
                        prev = prev.next;
                    }
                    temp.next = prev.next;
                    prev.next = temp;
                }
            }

            listIdx++;
        }

        return merged;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println(" -> null");
    }

    public static void main(String[] args) {
        int k = 3;
        Node[] lists = new Node[k];

        // List 1: 1 -> 3 -> 5 -> 7
        lists[0] = new Node(1);
        lists[0].next = new Node(3);
        lists[0].next.next = new Node(5);
        lists[0].next.next.next = new Node(7);

        // List 2: 2 -> 4 -> 6 -> 8
        lists[1] = new Node(2);
        lists[1].next = new Node(4);
        lists[1].next.next = new Node(6);
        lists[1].next.next.next = new Node(8);

        // List 3: 0 -> 9 -> 10 -> 11
        lists[2] = new Node(0);
        lists[2].next = new Node(9);
        lists[2].next.next = new Node(10);
        lists[2].next.next.next = new Node(11);

        Node head = mergeKLists(lists, k);
        printList(head);
        // Output: 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10 -> 11 -> null
    }
}   