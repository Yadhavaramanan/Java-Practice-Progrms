import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
		
		Map<Float,HashMap<String,String>> map1= new HashMap<>();
		
		System.out.println(map1);
		map1.put(1.0f,new HashMap<String,String>());
		System.out.println(map1);
		map1.get(1.0f).put("1","dog");
		map1.get(1.0f).put("2","cat");
		map1.put(2.0f,new HashMap<String,String>());
		System.out.println(map1);
		map1.get(2.0f).put("3","dog");
		map1.get(2.0f).put("4","cat");
		System.out.println(map1);
		
	}
}
