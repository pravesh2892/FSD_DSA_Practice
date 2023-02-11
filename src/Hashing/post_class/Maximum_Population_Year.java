package Hashing.post_class;
import  java.util.*;
public class Maximum_Population_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][]arr =  new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
        }
        long[]arr2 = new long[2200];
        for(int i=0; i<n; i++){
            arr[i][1] = sc.nextInt();


            for(int j= arr[i][0]; j<arr[i][1]; j++){
                arr2[j]++;
            }
        }
        long result=0;
        int index=0;
        for(int i=arr2.length-1; i>=1900; i--){
            if(arr2[i]>=result){
                result = arr2[i];
                index =i;
            }
        }
        System.out.println(index);
    }
}
