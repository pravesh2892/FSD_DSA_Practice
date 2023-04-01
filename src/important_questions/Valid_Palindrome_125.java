package important_questions;
import java.util.*;
public class Valid_Palindrome_125 {
    public static void main(String[] args) {
      String  str = "A man, a plan, a canal: Panama";
      boolean check = true;
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                check = false;
            }
        }
        if(check){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }


    }
}
