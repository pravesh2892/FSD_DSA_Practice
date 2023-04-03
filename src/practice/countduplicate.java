package practice;
import  java.util.*;
public class countduplicate {
    public static void main(String[] args) {
        int[]arr = {1,3,5,3,2,1,4,6};
       Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
//        int count=0;
//
//        Arrays.sort(arr);
//        // 1,1,2,3,3,4,5,6
//
//        for(int i=0; i<arr.length-1; i++){
//            if(arr[i]==arr[i+1]){
//                count++;
//            }
//        }
//        System.out.println(count);

    }
}
