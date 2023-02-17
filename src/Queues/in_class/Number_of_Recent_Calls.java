package Queues.in_class;
import  java.util.*;
public class Number_of_Recent_Calls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[]arr = new int[q];
        for(int i=0; i<q; i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<q; i++){
            int count=0;
            for(int j=i; j>=0; j--){
                if(arr[i]-arr[j]<=3000){
                    count++;
                }else{
                    break;
                }
            }
            System.out.print(count+" ");
        }
    }
}
