import java.util.*;

public class deletion_Reverse_LL {
    static class Node {
        int data;
        Node next;
        Node(int x) { data = x; next = null; }
    }

    static class Solution {
        Node reverse(Node head) {
            if (head == null || head.next == head) return head;
            Node prev = head, current = head.next;
            while (current != head) {
                Node nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }
            head.next = prev;
            return prev;
        }

        Node deleteNode(Node head, int key) {
            if (head == null) return head;
            Node current = head, prev = null;
            do {
                if (current.data == key) {
                    if (current == head && current.next == head) return null;
                    if (current == head) {
                        Node tail = head;
                        while (tail.next != head) tail = tail.next;
                        head = current.next;
                        tail.next = head;
                    } else {
                        prev.next = current.next;
                    }
                    return head;
                }
                prev = current;
                current = current.next;
            } while (current != head);
            return head;
        }
    }

    static Node buildList(int[] arr) {
        if (arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node tail = head;
        for (int i = 1; i < arr.length; i++) {
            tail.next = new Node(arr[i]);
            tail = tail.next;
        }
        tail.next = head;
        return head;
    }

    static void printList(Node head) {
        if (head == null) { System.out.println("-1"); return; }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test 1
        Node head1 = buildList(new int[]{2, 5, 7, 8, 10});
        head1 = sol.deleteNode(head1, 8);
        head1 = sol.reverse(head1);
        System.out.println("Test 1:");
        printList(head1);

        // Test 2
        Node head2 = buildList(new int[]{1, 7, 8, 10});
        head2 = sol.deleteNode(head2, 8);
        head2 = sol.reverse(head2);
        System.out.println("Test 2:");
        printList(head2);

        // Test 3
        Node head3 = buildList(new int[]{3, 6, 4, 10});
        head3 = sol.deleteNode(head3, 9);
        head3 = sol.reverse(head3);
        System.out.println("Test 3:");
        printList(head3);
    }
}   