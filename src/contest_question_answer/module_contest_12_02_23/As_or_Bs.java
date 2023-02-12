package contest_question_answer.module_contest_12_02_23;
import java.util.*;
public class As_or_Bs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans=0, temp=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='A'){
                temp++;
            }else{
                ans = Math.max(ans, temp);
                temp=0;
            }
        }
        ans = Math.max(ans, temp);
        System.out.println(ans);
    }
}
