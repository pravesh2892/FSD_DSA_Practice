import java.util.*;

public class Next_greater_elements {
    public static void main(String[] args) {
        int[] input = {1,2,7,6,25,13,12,19,10 };

        int[] result = findNextGreaterElements(input);
        System.out.println(Arrays.toString(result));
    }
    public static int[] findNextGreaterElements(int[] input){

        if (input == null) {
            return input;
        }

        int[] result = new int[input.length];
        Arrays.fill(result, -1);
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < input.length; i++)
        {


            while (!s.isEmpty() && input[s.peek()] < input[i]) {
                result[s.pop()] = input[i];
            }

            s.push(i);
        }

        return result;
    }
}
