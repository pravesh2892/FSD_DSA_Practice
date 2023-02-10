package important_questions;
import java.util.*;
public class MergeElementsOfTwoSortedArray {
    public static void main(String[] args) {
        int[]arr1 = { 1, 5, 9, 10, 15, 20 };
        int[]arr2 = { 2, 3, 8, 13 };
        merge(arr1, arr1.length, arr2,  arr2.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    static void merge(int[]arr1, int n, int[]arr2, int m){
        int i = 0;
        int temp = 0;
        while (arr1[n - 1] > arr2[0]) {
            if (arr1[i] > arr2[0]) {

                // Swap arr1[i] with first element
                // of arr2 and sorting the updated
                // arr2(arr1 is already sorted)
                // swap(arr1[i],arr2[0]);
                temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
                Arrays.sort(arr2);
            }
            i++;
        }

    }
}
