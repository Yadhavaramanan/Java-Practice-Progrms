import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Integer[] arr1 ={1,2,3};
        Integer[] arr2 ={4,5,6};
        Integer[] arr3 ={7,8,9};
        
        System.out.println("Array1: "+Arrays.toString(arr1));
        System.out.println("Array2: "+Arrays.toString(arr2));
        System.out.println("Array3: "+Arrays.toString(arr3));
        
        ArrayList<Integer> r1 =new ArrayList<Integer>(Arrays.asList(arr1));
        ArrayList<Integer> r2 =new ArrayList<Integer>(Arrays.asList(arr2));
        ArrayList<Integer> r3 =new ArrayList<Integer>(Arrays.asList(arr3));
        
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        
        matrix.add(r1);
        matrix.add(r2);
        matrix.add(r3);
        
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r1.get(0));
        System.out.println(r2.get(0));
        System.out.println(r3.get(0));
        System.out.println(matrix);
        r1.add(10);
        System.out.println(matrix);
	}
}
