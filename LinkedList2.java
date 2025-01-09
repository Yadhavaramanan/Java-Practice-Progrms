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
		     if(isEmpty()){
		        System.out.println("LinkedList is Empty...");
		    }
		    else
		    {
	         while(tempNode !=null){
	                System.out.print(tempNode.data+"-->");
	                tempNode = tempNode.link;
	              }
	        System.out.print(tempNode+"\n");
		    }
	        
		}
		
		public Node getLastNode(){
		    Node tempNode = Head;
	        while(tempNode.link !=null){
	                System.out.print(tempNode.data+"-->");
	                tempNode = tempNode.link;
	              }
	        System.out.print("Res: "+tempNode.data);
	        System.out.println();
	       
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
		
		public boolean insertNodeStart(int val){
		    Node newNode = new Node(val);
		    if(isEmpty()){
		        Head = newNode;
		    }
		    else
		    {
		    newNode.link = Head;
		    Head = newNode;
		    
		    }
		    
		    return true;
		}
		
		public boolean insertNodeMid(int val, int key){
		     Node newNode = new Node(val);
		     if(!isEmpty() && Head.link!=null){
		        
		        boolean notFound = true;
		        Node currNode = Head;
		        Node prev = null;
		        while(currNode != null){
		            if(currNode.data==key){
		                if(prev==null){
		                    insertNodeStart(val);
		                    notFound = false;
		                    return true;
		                }else{
		                    newNode.link = currNode;
		                    prev.link = newNode;
		                    notFound = false;
		                    return true;
		                }
		            }
		            
		            prev = currNode;
		            currNode = currNode.link;
		        }
		    
		    }else{
		        return false;
		    }
		  return true;
		}

}
public class Main
{
	public static void main(String[] args) {
		
	    LinkedList ll = new LinkedList();
	    
	    ll.traverseLL();
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
	    
	    ll.insertNodeEnd(60);
	    ll.traverseLL();
	    
	    System.out.println("-".repeat(50));
	    
	    ll.getLastNode();
	    
	    System.out.println("-".repeat(50));
	    
	    System.out.print("Res: "+(ll.getLastNode()).data+"\n");
	    
	    System.out.println("-".repeat(50));
	    
	    ll.insertNodeStart(5);
	    ll.traverseLL();
	    
	    System.out.println("-".repeat(50));
	    ll.insertNodeMid(15,20);
	    ll.traverseLL();

	}
	
}
