package important_questions;
import  java.util.*;
public class Reverse_Words_in_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder ans= new StringBuilder();
        String[]s = str.split(" ");
        for(int i=s.length-1; i>=0; i--){
            ans.append(s[i]).append(" ");
        }
        System.out.print(ans.substring(0,ans.length()-1));

    }
}
