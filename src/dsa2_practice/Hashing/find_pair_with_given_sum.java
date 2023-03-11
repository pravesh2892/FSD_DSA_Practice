package dsa2_practice.Hashing;
import java.util.*;

public class find_pair_with_given_sum {
    public static void main(String[] args) {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int n = 16;
        if(Findpairs(A, n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    static boolean Findpairs(int[]arr, int sum){
        HashSet<Integer>set = new HashSet<>();
        for (int i=0; i<arr.length; i++){
            int temp = sum-arr[i];
            if(set.contains(temp)){
               return true;
            }
            set.add(arr[i]);
        }
      return false;
    }
}
