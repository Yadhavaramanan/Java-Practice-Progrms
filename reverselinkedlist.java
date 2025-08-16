import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    void insertNode(int n){
        Node newNode = new Node(n);
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("New Node Inserted...");
    }
    
    void reverseList(){
        Node temp = head, pre = null, next = null;
        while(temp != null){
            next = temp.next;
            temp.next = pre;
            pre = temp;
            temp = next;
        }
        head = pre;
        System.out.println("LinkedList Reversed...");
    }
    
    void displayList(){
        if(head == null){
            System.out.println("Empty LinkedList...");
        }else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+"-->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    LinkedList ll = new LinkedList();
	    ll.displayList();
	    ll.insertNode(1);
	    ll.insertNode(2);
	    ll.insertNode(3);
	    ll.insertNode(4);
	    ll.insertNode(5);
	    ll.displayList();
	    
	    ll.reverseList();
	    ll.displayList();
	}
}
