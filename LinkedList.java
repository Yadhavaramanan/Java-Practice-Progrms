import java.util.*;

class Node{
    int data;
    Node link;
    
    Node(int val){
        data = val;
        link = null; 
    }
}
public class Main
{
	public static void main(String[] args) {
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		
		System.out.println("n1--"+n1+" :"+n1.data+"-->"+n1.link);
		System.out.println("n2--"+n2+" :"+n2.data+"-->"+n2.link);
		System.out.println("n3--"+n3+" :"+n3.data+"-->"+n3.link);
		System.out.println("n4--"+n4+" :"+n4.data+"-->"+n4.link);
		System.out.println("-".repeat(50));
		n1.link = n2;
		n2.link = n3;
		n3.link = n4;
		
		System.out.println("n1--"+n1+" :"+n1.data+"-->"+n1.link);
		System.out.println("n2--"+n2+" :"+n2.data+"-->"+n2.link);
		System.out.println("n3--"+n3+" :"+n3.data+"-->"+n3.link);
		System.out.println("n4--"+n4+" :"+n4.data+"-->"+n4.link);
		System.out.println("-".repeat(50));
		System.out.println(n1.data+"-->"+n1.link.data+"-->"+n1.link.link.data+"-->"+n1.link.link.link.data+"-->"+n1.link.link.link.link);
	
	    System.out.println("-".repeat(50));
	    
	    Node tempNode = n1;
	    System.out.println(tempNode.data);
	    
	    tempNode = tempNode.link;
	    System.out.println(tempNode.data);
	    
	    tempNode = tempNode.link;
	    System.out.println(tempNode.data);
	    
	    tempNode = tempNode.link;
	    System.out.println(tempNode.data);
	    
	    tempNode = tempNode.link;
	    System.out.println(tempNode);
	    
	    System.out.println("-".repeat(50));
	    tempNode = n1;
	    while(tempNode !=null){
	        System.out.print(tempNode.data+"-->");
	        tempNode = tempNode.link;
	    }
	    System.out.print(tempNode+"\n");
	    
	    System.out.println("-".repeat(50));
	}
	
}
