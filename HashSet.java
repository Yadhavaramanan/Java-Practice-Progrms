import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the no. of elements:");
	    int n = scan.nextInt();
	    HashSet<Integer> s = new HashSet<>();
	    for(int i=0;i<n;i++){
	        s.add(scan.nextInt());
	    }
		System.out.println(s);
	}
}
