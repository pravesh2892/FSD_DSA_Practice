package stack.in_class;
import java.util.*;
public class Greater_is_better {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i=0; i<length; i++){
            arr[i] = sc.nextInt();
        }

        int[] left = new int[length];
        int[] right = new int[length];

        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        Arrays.fill(left,-1);
        Arrays.fill(right,-1);

        for(int i=0; i<length; i++){

            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                right[st.peek()]=i+1;
                st.pop();
            }
            st.push(i);
        }

        for(int i=length-1; i>=0; i--){

            while(!st2.isEmpty() && arr[st2.peek()]<arr[i]){
                left[st2.peek()]=i+1;
                st2.pop();
            }
            st2.push(i);
        }
        for(int i=0; i<left.length; i++){
            System.out.print(left[i]+right[i]+" ");
        }
    }
}
