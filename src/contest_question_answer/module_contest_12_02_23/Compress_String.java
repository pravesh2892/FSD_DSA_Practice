package contest_question_answer.module_contest_12_02_23;
import java.util.*;
public class Compress_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();
            int count=0;
            for(int i=0; i<str.length(); i++){
                count++;
                if(i==str.length()-1 || str.charAt(i)!=str.charAt(i+1)){
                    System.out.print(str.charAt(i)+""+count);
                    count=0;
                }
            }
            System.out.println();
        }
    }
}
