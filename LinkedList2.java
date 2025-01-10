import java.util.*;

class Node{
    int data;
    Node link;
    
    Node(int val){
        data = val;
        link = null;
    }
}

class LinkedList{
    Node Head;
    
    LinkedList(){
        Head = null;
    }
    
    public boolean isEmpty(){
        if(Head == null){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean insertStartNode(int val){
        Node newNode = new Node(val);
        if(isEmpty()){
            Head=newNode; 
        }else{
            newNode.link = Head;
            Head = newNode;
        }
        
        return true;
    }
    
    public Node getNodeEnd(){
        Node tempNode = Head;
        while(tempNode.link!=null){
                System.out.print(tempNode.data + "-->");
                tempNode = tempNode.link;
            }
            
        return tempNode;
    }
    
    public boolean insertNodeMid(int val, int key) {
    Node newNode = new Node(val);
    
    if (isEmpty()) {
        return false; 
    }
    if (Head.data == key) {
        newNode.link = Head;
        Head = newNode;
        return true;
    }
    Node currNode = Head;
    Node prev = null;
    while (currNode != null) {
        if (currNode.data == key) {
            newNode.link = currNode;
            if (prev != null) {
                prev.link = newNode;
            }
            return true;
        }
        prev = currNode;
        currNode = currNode.link;
    }

    return false;
}

    public boolean insertNodeEnd(int  val){
        Node newNode = new Node(val);
        if(isEmpty()){
            Head = newNode;
        }else{
            Node LastNode = getNodeEnd();
            LastNode.link = newNode;
        }
        return true;
    }
    
    public boolean deleteNodeStart(){
        if(isEmpty()){
            return false;
        }else{
            Head = Head.link;
            return true;
        }
    }
    
    public boolean deleteNodeMid(int key) {
    if (isEmpty()) {
        return false; 
    }
    if (Head.data == key) {
        Head = Head.link; 
        return true;
    }
    Node current = Head;
    Node prev = null;

    while (current != null) {
        if (current.data == key) {
            prev.link = current.link;
            return true;
        }
        prev = current;
        current = current.link;
    }

    return false;
}

    
    public boolean deleteNodeEnd(){
        if(isEmpty()){
			return false;
		}else{
			Node tempNode = Head;
			Node prev = null;
			while(tempNode.link != null){
				prev = tempNode;
				tempNode = tempNode.link;
			}
			if(prev == null){
				Head = null;
				return true;
			}else{
				prev.link = null;
				return true;
			}
    }
    }
    
    public boolean traverse(){
        Node tempNode = Head;
        if(isEmpty()){
            System.out.println("LinkedList is Empty...");
        }else{
            while(tempNode!=null){
                System.out.print(tempNode.data + "-->");
                tempNode = tempNode.link;
            }
            System.out.print(tempNode+"\n");
        }
       return true;     
     }
     
    public boolean searchNode(int key) {
    Node current = Head;
    while (current != null) {
        if (current.data == key) {
            return true; 
        }
        current = current.link; 
    }

    return false; 
    }

     
    public void reverse() {
    Node prev = null;
    Node next = null;
    Node current = Head;

    while (current != null) {
        next = current.link;  
        current.link = prev; 
        prev = current;       
        current = next;       
    }
    Head = prev;  
    }

    
}

public class Main
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    LinkedList l = new LinkedList();
	    
	    l.traverse();
	    
	    l.insertStartNode(10);
	    l.traverse();
	    
	    l.getNodeEnd();
	    
	    l.insertNodeEnd(20);
	    l.traverse();
	    
	    l.insertNodeEnd(25);
	    l.traverse();
	    
	    l.insertNodeEnd(30);
	    l.traverse();
	    
	    l.insertNodeEnd(35);
	    l.traverse();
	    
	    l.insertNodeEnd(40);
	    l.traverse();
	    
	    l.insertNodeEnd(45);
	    l.traverse();
	    
	    l.insertNodeEnd(50);
	    l.traverse();
	    
	    l.insertNodeMid(15,20);
	    l.traverse();
	    
	    l.deleteNodeStart();
	    l.traverse();
	    
	    l.deleteNodeMid(15);
	    l.traverse();
	    
	    l.deleteNodeEnd();
	    l.traverse();
	    
	    l.searchNode(45);
	    l.traverse();
	    
	    l.reverse();
	    l.traverse();
	    
	    l.insertNodeMid(15,20);
	    l.traverse();
	    
	}
}
