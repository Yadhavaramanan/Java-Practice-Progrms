import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Map<Integer,Integer>map=new HashMap<>();
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
             arr[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey()+" ");
            }
        }
    }
}
