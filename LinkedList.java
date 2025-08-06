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
    int size = 0;
    void AddAtFront(int n){
        Node newNode = new Node(n);
        if(head == null){
            head = newNode;
            size++;
        }else{
            newNode.next = head;
            head = newNode;
            size++;
        }
    }
    
    void AddAtEnd(int n){
        Node temp = head;
        Node newNode = new Node(n);
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }
    
    void AddAtMiddle(int index, int n){
        Node newNode = new Node(n);
        if(index > size){
            System.out.println("Index is out of found");
        }else if(index == 0){
            AddAtFront(n);
        }
        else{
            Node temp = head;
            int i = 0;
            while(i < index-2){
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }
    
    void DeleteAtFront(){
        if(head == null){
            System.out.println("List is empty.");
        }else{
            head = head.next;
            size--;
        }
    }
    
    void DeleteAtEnd(){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }
    
    void DeleteAtMiddle(int index){
        if(index > size){
            System.out.println("Index is out of found");
        }else{
            Node temp = head;
            int i = 0;
            while(i < index-2){
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
            size--;
        }
    }
    
    void print(){
        if(head == null){
            System.out.print("List is empty.");
        }else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data +"-->");
                temp= temp.next;
            }
 
            System.out.println("null");
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.AddAtFront(10);
		ll.AddAtEnd(20);
		ll.AddAtEnd(30);
		ll.AddAtEnd(50);
		ll.AddAtEnd(70);
		ll.AddAtEnd(80);
		ll.print();
		ll.AddAtMiddle(4,40);
		ll.print();
		ll.AddAtMiddle(6,60);
		ll.print();
		ll.DeleteAtFront();
		ll.print();
		ll.DeleteAtEnd();
		ll.print();
		ll.DeleteAtMiddle(5);
		ll.print();
	}
}
