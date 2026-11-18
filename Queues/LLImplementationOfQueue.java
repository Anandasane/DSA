



public class LLImplementationOfQueue {

    static class MyQueue {
        private static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

        private Node head;
        private Node tail;

        void add(int data) {
            Node node = new Node(data);
            if (tail == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        int remove() {
            if (head == null) {
                throw new RuntimeException("Queue is empty");
            }
            int data = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return data;
        }

        void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data);
                if (current.next != null) {
                    System.out.print(" ");
                }
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(10); q.add(20); q.add(30); q.add(40);
        q.display();
        System.out.println(q.remove());
        q.display();
    }
}
