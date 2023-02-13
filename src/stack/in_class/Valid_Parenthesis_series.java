package stack.in_class;
import java.util.*;
public class Valid_Parenthesis_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(isvalidParanthis(str)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static boolean isvalidParanthis(String str){
        // first solution without using stack
        //     int res=0;
        //     for(int i=0; i<str.length(); i++){
        //         if(str.charAt(i)=='(' ||str.charAt(i)=='*'){
        //             res++;
        //         }else if(res--==0){
        //             return false;

        //         }
        //     }

        // if(res==0) return true;
        // res=0;
        // for(int i=str.length()-1; i>=0; i--){
        //     if(str.charAt(i)==')' || str.charAt(i)=='*'){
        //         res++;
        //     }else if(res--==0){
        //         return false;
        //     }
        // }
        // return true;

        //using stack
        Stack<Integer> star  = new Stack<Integer>();
        //second stack to store position of star
        Stack<Integer> open = new Stack<Integer>();

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);

            //if left bracket then push it in stack
            if(ch =='(')
                open.push(i);

            else  if(ch == '*')
                star.push(i);

            else{
                //when right bracket comes, check for stack of left bracket
                if(!open.empty()) //if non empty remove it
                    open.pop();

                else if(!star.empty()) //if left is 0, then check if we can take star as left bracket
                    star.pop();
                else
                    return false;
            }
        }


        //left over left bracket balance needs to be checked
        while(!open.empty()) {
            if(star.empty())
                return false;

                //position comparison as left bracket should come before right bracket
            else if(open.peek()<star.peek()) {
                open.pop();
                star.pop();
            }

            else
                return false;
        }

        return true;
    }
}


