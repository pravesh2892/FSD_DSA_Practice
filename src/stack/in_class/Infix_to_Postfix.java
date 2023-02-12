package stack.in_class;
import java.io.*;
import  java.util.*;
public class Infix_to_Postfix {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(infixToPostfix(str));
    }

    public static String infixToPostfix(String str) {
        String result = new String("");
        Deque<Character> st = new ArrayDeque<Character>();

        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch))
                result += ch;
            else if (ch == '(')
                st.push(ch);
            else if (ch == ')') {
                while (!st.isEmpty()
                        && st.peek() != '(') {
                    result += st.peek();
                    st.pop();
                }

                st.pop();
            } else {
                while (!st.isEmpty()
                        && Prec(ch) <= Prec(st.peek())) {

                    result += st.peek();
                    st.pop();
                }
                st.push(ch);
            }
        }

        while (!st.isEmpty()) {
            if (st.peek() == '(')
                return "Invalid Expression";
            result += st.peek();
            st.pop();
        }

        return result;
    }

    public static int Prec(char C) {
        if (C == '-' || C == '+')
            return 1;
        else if (C == '*' || C == '/')
            return 2;
        else if (C == '^')
            return 3;
        return 0;
    }
}
