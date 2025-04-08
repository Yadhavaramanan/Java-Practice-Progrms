import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    HashMap<Integer,String> map = new HashMap<>();
	    
	    for(int i=0;i<n;i++){
	        int num = scan.nextInt();
	        String name = scan.nextLine();
	        map.put(num,name);
	    }
	    
	    for(Map.Entry e : map.entrySet()){
	        System.out.println(e.getKey()+" "+e.getValue());
	    }
	    System.out.println("--------------");
	    for(Integer Key : map.keySet()){
	        System.out.println(Key+""+map.get(Key));
	    }
	}
}

//occurance count
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    HashMap<Integer,Integer> map = new HashMap<>();
	    for(int i=0;i<n;i++){
	        int key = scan.nextInt();
	        if(map.containsKey(key)){
	            map.put(key,map.get(key)+1);
	        }
	        else{
	            map.put(key,1);
	        }
	    }
	    
	    for(Integer key : map.keySet()){
	        System.out.println(key+" "+ map.get(key));
	    }
	}
}

