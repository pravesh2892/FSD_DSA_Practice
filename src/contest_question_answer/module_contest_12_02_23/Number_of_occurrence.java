package contest_question_answer.module_contest_12_02_23;
import java.util.*;
public class Number_of_occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch =sc.next().charAt(0);
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
