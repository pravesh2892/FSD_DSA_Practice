package dsa2_practice.Hashing;
import java.util.*;
public class find_the_largest_subarray_with_zero_sum {
    public static void main(String[] args) {
        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
        System.out.println("Length of the longest 0 sum subarray is " + maxLen(arr));
    }
  public   static int maxLen(int[]arr){
      HashMap<Integer, Integer>map = new HashMap<>();
      int sum=0;
      int max_length=0;
      for (int i = 0; i < arr.length; i++) {
          // Add current element to sum
          sum += arr[i];

          if (sum == 0)
              max_length = i + 1;

          // Look this sum in hash table
          Integer prev_i = map.get(sum);

          // If this sum is seen before, then update
          // max_len if required
          if (prev_i != null)
              max_length = Math.max(max_length, i - prev_i);
          else // Else put this sum in hash table
              map.put(sum, i);
      }

      return max_length;

    }
}
