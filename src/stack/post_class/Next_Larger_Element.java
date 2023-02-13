package stack.post_class;
import  java.util.*;
public class Next_Larger_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int nextElement =0;
        for(int i=0; i<n; i++){
            nextElement= -1;
            for(int j=i+1; j<n; j++){
                if(arr[i]<arr[j]){
                    nextElement = arr[j];
                    break;
                }

            }
            System.out.print(nextElement+" ");
        }
    }
}
