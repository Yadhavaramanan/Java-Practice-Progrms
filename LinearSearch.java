import java.util.*;
public class Main
{
    static int LinearSearch(int[] arr, int n, int tar){
       for(int i=0;i<n;i++){
           if(arr[i]==tar){
               return i+1;
           }
       }
       return -1;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
        int t = sc.nextInt();
		System.out.print(LinearSearch(arr,n,t));
	}
}
