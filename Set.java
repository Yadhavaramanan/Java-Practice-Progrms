import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> s =new HashSet<>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(30);
		s.add(40);
		s.add(50);
		
		System.out.println("HashSet 1:"+ s);
		
		boolean b = s.contains(50);
		
		System.out.println("50 - "+ b);
		s.remove(10);
		
		System.out.println("After removing of HashSet:"+ s);
		
		Set<Integer> s1 =new HashSet<>();
		s1.add(40);
		s1.add(70);
		s1.add(80);
		s1.add(90);
		s1.add(10);
		s1.add(100);
		
		System.out.println("HashSet 2:"+ s1);
		
		System.out.println("Iterating through the Set via for-each loop :");
		for(int i:s1)
		    System.out.print(i+", ");
		System.out.println();
		
		Iterator<Integer> j = s1.iterator();
		System.out.println("Iterating through iterators:");
		while(j.hasNext()){
		    System.out.println(j.next());
		}
		
		Set<Integer> u =new HashSet<>(s);
		u.addAll(s1);
		System.out.println("Union HashSet:"+ u);
		
		Set<Integer> is =new HashSet<>(s);
		is.retainAll(s1);
		System.out.println("Intersection HashSet:"+ is);
		
		Set<Integer> d =new HashSet<>(s);
		d.removeAll(s1);
		System.out.println("Differene HashSet:"+ d);
		
		Set<Integer> lh = new LinkedHashSet<Integer>();
		
		lh.add(70);
		lh.add(60);
		lh.add(50);
		lh.add(10);
		lh.add(30);
		lh.add(20);
		
		System.out.println("LinkedHashSet:"+lh);
		
		Set<Integer> ts = new TreeSet<Integer>();
		ts.add(70);
		ts.add(60);
		ts.add(50);
		ts.add(10);
		ts.add(30);
		ts.add(20);
		System.out.println("TreeSet :"+ts);
}
}
