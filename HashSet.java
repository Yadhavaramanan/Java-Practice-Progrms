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
//Intersection
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the no. of elements:");
	    int n = scan.nextInt();
	    HashSet<Integer> s1 = new HashSet<>();
	    HashSet<Integer> s2 = new HashSet<>();
	    System.out.println("Enter the Set1 elements:");
	    for(int i=0;i<n;i++){
	        s1.add(scan.nextInt());
	    }
	    System.out.println("Enter the Set2 elements:");
	    for(int i=0;i<n;i++){
	        s2.add(scan.nextInt());
	    }
		System.out.println("Set1:"+s1);
		System.out.println("Set2:"+s2);
		
		s1.retainAll(s2);
		System.out.println("Set IntewrSection:"+s1);
	}
}
// union
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the no. of elements:");
	    int n = scan.nextInt();
	    HashSet<Integer> s1 = new HashSet<>();
	    HashSet<Integer> s2 = new HashSet<>();
	    System.out.println("Enter the Set1 elements:");
	    for(int i=0;i<n;i++){
	        s1.add(scan.nextInt());
	    }
	    System.out.println("Enter the Set2 elements:");
	    for(int i=0;i<n;i++){
	        s2.add(scan.nextInt());
	    }
		System.out.println("Set1:"+s1);
		System.out.println("Set2:"+s2);
		
		s1.addAll(s2);
		System.out.println("Set Union:"+s1);
	}
}

//containsAll

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the no. of elements:");
	    int n = scan.nextInt();
	    HashSet<Integer> s1 = new HashSet<>();
	    HashSet<Integer> s2 = new HashSet<>();
	    System.out.println("Enter the Set1 elements:");
	    for(int i=0;i<n;i++){
	        s1.add(scan.nextInt());
	    }
	    System.out.println("Enter the Set2 elements:");
	    for(int i=0;i<n;i++){
	        s2.add(scan.nextInt());
	    }
		System.out.println("Set1:"+s1);
		System.out.println("Set2:"+s2);
		
		System.out.println("Set ContainAll:"+s1.containsAll(s2));
	}
}

