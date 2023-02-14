package important_questions;
import java.util.*;
public class find_target_first_last_occurrence {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
        int target = 8, n= arr.length;
        System.out.println("First Occurrence = " + first(arr, target, n));
        System.out.println("Last Occurrence = " + last(arr, target, n));

    }
    public  static  int first(int[]arr, int target, int n){
        int low=0, high=n-1, temp=-1;
        while(low <=high){
            int mid = low +(high-low)/2;
            if(arr[mid]>target){
                high = mid-1;
            }else if(arr[mid]<target){
                low = mid+1;
            }else{
                temp = mid;
                high = mid-1;
            }
        }
        return temp;
    }
    public  static int last(int[]arr , int target, int n){
        int low=0, high=n-1, temp=-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target)
                high = mid - 1;
            else if (arr[mid] < target)
                low = mid + 1;
            else {
                temp = mid;
                low = mid + 1;
            }
        }
        return temp;
    }

}
