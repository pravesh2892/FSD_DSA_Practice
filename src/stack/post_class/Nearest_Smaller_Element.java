package stack.post_class;
import  java.util.*;
public class Nearest_Smaller_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        smallerElments(arr);
    }
    public static void smallerElments(int[]arr){

        Stack<Integer> stack = new Stack<>();
        int[] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int x=-1;
            while(!stack.isEmpty() && stack.peek()>arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                x=stack.peek();
            }
            temp[i]=x;
            stack.push(arr[i]);
        }

        for(int i=0; i<temp.length; i++){
            System.out.print(temp[i]+" ");
        }
    }
}
