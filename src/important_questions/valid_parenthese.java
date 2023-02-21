package important_questions;
import java.util.*;
public class valid_parenthese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
      if(isvalid(str)){
          System.out.println("true");
      }else{
          System.out.println("false");
      }
    }
  public  static  boolean isvalid(String str){
      Stack<Character> st = new Stack<>();
      for(char ch : str.toCharArray()){
          if(ch=='(' || ch=='{' || ch=='['){
              st.push(ch);
          }else if(ch==')' && !st.isEmpty() && st.peek()=='('){
              st.pop();

          }else if(ch=='}' && !st.isEmpty() && st.peek()=='{'){
              st.pop();
          }else if(ch==']' && !st.isEmpty() && st.peek()=='['){
              st.pop();
          }else{
              return false;
          }
      }
      return st.isEmpty();

  }
}
