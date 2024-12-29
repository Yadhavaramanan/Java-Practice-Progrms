import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();
        int arr[] = new int[n];

  
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

  
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> uniqueElements = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) { 
                uniqueElements.add(entry.getKey());
            }
        }

    
        Collections.sort(uniqueElements);

      System.out.println("Unique elements in the array:");
        for (int element : uniqueElements) {
            System.out.print(element + " ");
        }
        System.out.println(); 

        scan.close();
    }
}
