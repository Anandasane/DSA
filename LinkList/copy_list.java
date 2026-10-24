import java.util.*;



public class copy_list {

    public Node deepCopy(Node head1) {
        Node temp1 = head1;
        Node head2 = new Node(-1);
        Node temp2 = head2;
        while (temp1 != null) {
            Node t = new Node(temp1.val);
            temp2.next = t;
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        return head2.next;
    }

    public void merge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        Node temp1 = head1;
        Node temp2 = head2;
        while (temp2 != null) {          // both lists have equal length
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;

            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }
        temp.next = null;                // terminate the merged list
    }

    public void randomConnections(Node head1, Node head2) {
        Node temp1 = head1;
        while (temp1 != null) {
            if (temp1.random == null) {
                temp1.next.random = null;
            } else {
                temp1.next.random = temp1.random.next;  // copy's random = original's random -> its clone
            }
            temp1 = temp1.next.next;
        }
    }

    public Node split(Node head1) {
        Node dummy2 = new Node(-1);      // we only need to track the copy list
        Node temp2 = dummy2;
        Node temp = head1;

        while (temp != null) {
            Node orig = temp;            // original node
            Node copy = temp.next;       // cloned node

            orig.next = copy.next;       // restore original's next
            temp = copy.next;            // move to next original

            temp2.next = copy;           // link copies together
            temp2 = copy;
        }
        temp2.next = null;
        return dummy2.next;              // return new head of copy list
    }

    public Node copyRandomList(Node head1) {
        if (head1 == null) return null;  // edge case!

        Node head2 = deepCopy(head1);
        merge(head1, head2);
        randomConnections(head1, head2);
        return split(head1);             // split returns the restored copy list
    }
}
