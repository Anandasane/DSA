import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){this.val=val;}

}

class DLL{
    ListNode head;
    ListNode tail;
    int size;

    void insertAtHead(int val ){

        ListNode temp = new ListNode(val);
        if(head==null) head = tail= temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;

        }
        size++;

    }

    void insertAtTail(int val){
        
        ListNode temp = new ListNode(val);
        if(head==null) head = tail= temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;

        }
        size++;
    }

    void deleteAtHead(){
        if(size==0){
            System.out.println("List is empty");
            return;
        }
        else if(size==1){
            head = tail = null;
            size--;
        }
        else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void deleteAtTail(){
        if(size==0){
            System.out.println("List is empty");
            return;
        }
        else if(size==1){
            head = tail = null;
            size--;
        }
        else{
            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }

    void display(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void displayReverse(){
        ListNode temp = tail;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp =temp.prev;
        }
        System.out.println();
    }

    void insertAtIndex(int idx , int val){
        if(idx<0 || idx >size){
            System.out.println("Invalid index");
            return;
        }
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtTail(val);
            return;
        }
        ListNode a = new ListNode(val);
        ListNode temp = head;
        for(int i =1; i<=idx-1;i++){
            temp = temp.next;
        }

        a.prev = temp;
        a.next = temp.next;
        temp.next = a;
        a.next.prev = a;
        size++;
        // alternative
        // ListNode b = temp.next;
        // temp.next = a;
        // a.prev = temp;
        // a.next = b;
        // b.prev = a;

    }

    void deleteAtIndex(int idx){
        if(idx<0 || idx >=size ){
            System.out.println("Invalid index");
            return;
        }
        if(idx==0){
            deleteAtHead();
            return;
        }
        if(idx==size-1){
            deleteAtTail();
            return;
        }
        ListNode temp = head;
        for(int i =1; i<=idx-1;i++){
            temp = temp.next;
        }
        ListNode b = temp.next;
        temp.next = b.next;
        b.next.prev = temp;
        size--;
    }

}

public class doublyLinkedList {
    public static void main(String[] args){
        DLL list = new DLL();

        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.display();
        list.insertAtTail(50);
        list.display();
        list.displayReverse();

        list.deleteAtHead();
        list.display();
        list.deleteAtTail();
        list.displayReverse();

        list.insertAtIndex(3,66);
        list.display();
        list.deleteAtIndex(3);
        list.display();
    }
}