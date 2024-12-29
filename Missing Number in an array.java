import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Input the array size
        System.out.print("Enter the size of the array (n): ");
        int n = scan.nextInt();

        // Initialize the array and input the elements
        int[] arr = new int[n - 1]; // Array has n-1 elements because one number is missing
        System.out.println("Enter the elements of the array (of size " + (n - 1) + "):");
        
        for (int i = 0; i < n - 1; i++) {
            arr[i] = scan.nextInt();
        }

        // Calculate the expected sum and actual sum
        int expected_sum = (n * (n + 1)) / 2;
        int actual_sum = 0;

        for (int i = 0; i < n - 1; i++) {
            actual_sum += arr[i];
        }

        // The missing number is the difference between the expected sum and the actual sum
        int missing_number = expected_sum - actual_sum;

        // Output the missing number
        System.out.println("The missing number is: " + missing_number);

        scan.close();
    }
}
