
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

    int get(int idx){
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        return temp.data;
    }

    int search(int data){
        if(head==null) return -1;
        Node temp = head;
        int idx =0;
        while(temp!=null){
            if(temp.data == data) return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }
    
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

    void insert(int data , int idx){
        if(idx <0 || idx>size) System.out.println("Invalid index");
        
        if(idx==0)addAtHead(data);
        else if(idx==size) addAtTail(data);
        else{
            Node temp = head;
            for(int i=0; i<=idx-1;i++){
                temp = temp.next;

            }
            Node t = new Node(data);
            t.next = temp.next;
            temp.next =t;
            size++;
        }
    }
     
     void delete(int idx){
        if(idx<0 || idx>=size) {
            System.out.println("Invalid index! ");
            return;
        }
        if(idx==0){
            deletAtHead();
            return;
        }
        Node temp = head;
        for(int i=1;i<= idx;i++){
            temp=temp.next;
            
        }
        temp.next=temp.next.next;// deleting the node
        if(idx== size-1) tail=temp;// we are deleting the tail
        size--;
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

        l1.insert(100, 3); l1.display();
        System.out.print(l1.get(6)); 
        
        l1.delete(3);l1.display();

        



    }
}

