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
	    
		public void traverseLL(){
		     Node tempNode = Head;
	         while(tempNode !=null){
	                System.out.print(tempNode.data+"-->");
	                tempNode = tempNode.link;
	              }
	        System.out.print(tempNode+"\n");
	        
		}
		
		public Node getLastNode(){
		    Node tempNode = Head;
		    if(isEmpty()){
		        System.out.println("LinkedList is Empty...");
		    }
		    else
		    {
	        while(tempNode.link !=null){
	                System.out.print(tempNode.data+"-->");
	                tempNode = tempNode.link;
	              }
	        System.out.print("Res: "+tempNode.data);
	        System.out.println();
	        
		    }
	        return tempNode;
		    }
		    
		public boolean insertNodeEnd(int val){
		    Node newNode = new Node(val);
		    if(isEmpty()){
		        Head = newNode;
		    }
		    else
		    {
		    Node LastNode = getLastNode();
		    LastNode.link = newNode;
		    
		    }
		    
		    return true;
		}
		
		
	    //System.out.println("-".repeat(50));
		
}
public class Main
{
	public static void main(String[] args) {
		
	    LinkedList ll = new LinkedList();
	    
	    ll.traverseLL();
	    ll.getLastNode();
	    System.out.println("-".repeat(50));
	    
	    ll.insertNodeEnd(10);
	    ll.traverseLL();
	    
	    
	    ll.insertNodeEnd(20);
	    ll.traverseLL();
	    
	    ll.insertNodeEnd(30);
	    ll.traverseLL();
	    
	    ll.insertNodeEnd(40);
	    ll.traverseLL();
	    
	    ll.insertNodeEnd(50);
	    ll.traverseLL();
	    
	    System.out.println("-".repeat(50));
	    
	    ll.getLastNode();
	    
	    System.out.println("-".repeat(50));
	    
	    System.out.print("Res: "+(ll.getLastNode()).data);
	}
	
}
