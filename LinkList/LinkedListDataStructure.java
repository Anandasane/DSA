
class Node{//user define data type
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
} 

class Linkedlist{// user define data Structue
    Node head;
    Node tail;
    int size;
    void addAtHead(int data){
        Node temp = new Node(data);
        if(head==null) head =tail=temp;
        else{
            temp.next =head;
            head=temp;
        }
        size++;
    }
    void addAtTail(int data){
        Node temp = new Node(data);
        if(tail==null) head =tail=temp;
        else{
            tail.next =temp;
            tail=temp;
        }
        size++;
    }


    void deletAtHead(){
        if(head == null){
            System.out.print("List is empty");
            return;
        }
        head = head.next;
        if(head==null) tail=null;
        size--;

    }

    void display(){
    if(head==null) return;
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp = temp.next;
    }
    System.out.println();
    }


}



public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist l1 = new Linkedlist();
        l1.addAtTail(10);
        l1.addAtTail(20);
        l1.addAtTail(30);
        l1.addAtTail(40);
        l1.addAtTail(50);
        l1.addAtTail(60);

        l1.addAtHead(77);
        l1.display();
        l1.deletAtHead();
        l1.display();
        System.out.println(l1.size);

    }
}
