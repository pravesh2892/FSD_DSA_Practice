package Hashing.post_class;
import java.util.*;
public class Longest_Unique_characters_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[]arr = new int[256];
        int left=0, right=0, max=0;
        while(left<str.length() && right<str.length()){
            if(arr[str.charAt(right)]==0){
                arr[str.charAt(right++)]=1;
            }else{
                max = Math.max(max, right-left);
                arr[str.charAt(left++)] = 0;
            }
        }

        System.out.println(Math.max(max, right-left));
    }
}
