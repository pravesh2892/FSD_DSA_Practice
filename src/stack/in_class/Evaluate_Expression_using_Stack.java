package stack.in_class;
import  java.util.*;
import  java.io.*;
public class Evaluate_Expression_using_Stack {
    public static void main (String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] str = br.readLine().trim().split(" ");
        System.out.println(evaluatePostfix(str));

    }
    public static int evaluatePostfix(String[] str)
    {

        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<str.length;i++)
        {
            String c=str[i];
            int num = 0;
            boolean bl = true;
            try{
                num = Integer.parseInt(c);
            }
            catch(Exception e){
                bl = false;
            }

            if(bl==true){
                stack.push(num);
                continue;
            }
            else{
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch(c)
                {
                    case "+":
                        stack.push(val2+val1);
                        break;

                    case "-":
                        stack.push(val2- val1);
                        break;

                    case "/":
                        stack.push(val2/val1);
                        break;

                    case "*":
                        stack.push(val2*val1);
                        break;
                }
            }
        }

        return stack.pop();
    }
}
