package contest_question_answer.module_contest_12_02_23;
import java.util.*;
public class Happy_Balloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int count=0;
        for(int i=1; i<=n; i++){
            if((i%2!=0 &&arr[i-1]%2!=0) || (i%2==0 && arr[i-1]%2==0)){
                count++;
            }
        }
        System.out.println(count);
    }
}
