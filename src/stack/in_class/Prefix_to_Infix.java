package stack.in_class;
import java.util.*;
public class Prefix_to_Infix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(prefixtoInfix(str));
    }
    public static String prefixtoInfix(String str){
        Stack<String> st = new Stack<>();
        int len = str.length();
        for(int i=len-1; i>=0; i--){
            char ch = str.charAt(i);
            if(isoprator(ch)){
                String str1= st.pop();
                String str2 = st.pop();

                String temp = "("+ str1+ch+str2+")";
                st.push(temp);
            }else{
                st.push(ch +"");
            }
        }
        return st.pop();
    }
    static boolean isoprator(char c){
        switch(c){
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                return true;
        }
        return false;
    }
}
