import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the no. of elements:");
	    int n = scan.nextInt();
	    LinkedHashSet<Integer> s = new LinkedHashSet<>();
	    System.out.println("Enter the elements:");
	    for(int i=0;i<n;i++){
	        s.add(scan.nextInt());
	    }
		System.out.println(s);
		
		for(Integer d:s){
		    System.out.println("LinkedHashSet:"+ d);
		}
	}
}
