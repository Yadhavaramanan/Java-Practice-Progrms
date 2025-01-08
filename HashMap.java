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
        
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Muthu");
        map.put(2,"Kumar");
        map.put(3,"ram");
        map.put(4,"Vel");
        
        for(Map.Entry<Integer,String> e:map.entrySet() ){
            System.out.println(e);
        }
        System.out.println("--------------------------------------------------");
        for(int e1:map.keySet()){
            System.out.println(e1);
        }
        System.out.println("-".repeat(50));
        for(String e2:map.values()){
            System.out.println(e2);
        }
        System.out.println("-".repeat(50));
    }
}
