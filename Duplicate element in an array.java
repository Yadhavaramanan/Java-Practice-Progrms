import java.util.*;

public class dub {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); 
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        boolean foundDuplicate = false;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println( entry.getKey());
                foundDuplicate = true;
                break; 
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicates found.");
        }

        scan.close();
    }
}
