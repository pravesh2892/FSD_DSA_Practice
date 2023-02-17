package Queues.post_class;
import java.util.*;
public class Generate_Binary_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generateBinaryNumbers(n);
    }
    public static void generateBinaryNumbers(int n){
        Queue<String> queue = new ArrayDeque<>();
        queue.add("1");
        int i=1;

        while(i++ <=n){
            queue.add(queue.peek() +'0');
            queue.add(queue.peek() +'1');

            System.out.print(queue.poll()+ ' ');
        }
    }
}
