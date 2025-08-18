import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pos =0; int jumps = 0;
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		
		while(pos < arr.length - 1){
		    if(pos+2 < arr.length && arr[pos+2] == 0){
		        pos += 2;
		    }else if(pos+1 < arr.length && arr[pos+1] == 0){
		        pos += 1;
		    }else{
		        System.out.println("Not possible.");
		        return;
		    }
		    jumps++;
		}
		System.out.print(jumps);
	}
}
