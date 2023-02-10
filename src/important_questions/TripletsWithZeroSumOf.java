package important_questions;
import  java.util.*;
public class TripletsWithZeroSumOf {
    public static void main(String[] args) {
        int[]arr = {-3,1,4,-5,-4,2,3};
        int n = arr.length;
        findtriplets(arr,n);
    }
    public  static  void findtriplets(int[]arr, int n){
        boolean found = false;

        for (int i = 0; i < n - 1; i++) {
            // Find all pairs with sum equals to
            // "-arr[i]"
            HashSet<Integer> s = new HashSet<Integer>();
            for (int j = i + 1; j < n; j++) {
                int x = -(arr[i] + arr[j]);
                if (s.contains(x)) {
                    System.out.printf("%d %d %d\n", x,
                            arr[i], arr[j]);
                    found = true;
                }
                else {
                    s.add(arr[j]);
                }
            }
        }

        if (found == false) {
            System.out.printf(" No Triplet Found\n");
        }

    }
}
