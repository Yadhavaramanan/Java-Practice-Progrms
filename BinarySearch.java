import java.util.*;
public class Main
{
    static int BinarySearch(int[] arr, int l, int r, int tar){
        while(l<r){
            int mid = (l+r)/2;
            if(arr[mid] == tar){
                return mid+1;
            }else if(arr[mid]>tar){
                r = mid-1;
            }else{
                l = mid+1;
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
		int target = sc.nextInt();
		int l=0, r=n-1;
		Arrays.sort(arr);
		System.out.print(BinarySearch(arr,l,r,target));
	}
}
