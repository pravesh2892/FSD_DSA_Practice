package contest_question_answer.module_contest_12_02_23;
import java.util.*;
public class Maximum_Force {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[]arr = new long[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextLong();
        }
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                arr[i] = arr[i]*(-1);
            }
        }
        Arrays.sort(arr);

        for(int i=0, j=n-1; i<j; i++, j--){
            long temp =arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
        }
        long result=0;
        for(int i=0; i<k; i++){
            result =result+arr[i]*arr[i];
        }
        System.out.println(result);
    }
}
