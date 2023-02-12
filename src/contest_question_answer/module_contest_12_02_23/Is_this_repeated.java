package contest_question_answer.module_contest_12_02_23;
import java.util.*;
public class Is_this_repeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        boolean check =false;
        for(int i=2; i<n; i++){
            if(arr[i]==arr[i-1] && arr[i]==arr[i-2]){
                check = true;
            }

        }
        if(check==true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
