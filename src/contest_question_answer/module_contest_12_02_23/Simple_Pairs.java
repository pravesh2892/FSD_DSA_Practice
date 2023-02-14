package contest_question_answer.module_contest_12_02_23;
import java.util.*;
public class Simple_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long sum=0;
        for(int i=0, j=n-1; i<j; i++, j--){
            sum += Math.abs(arr[i]-arr[j]);
        }
        System.out.println(sum);
    }
}
