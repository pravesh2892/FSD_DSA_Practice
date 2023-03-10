package dsa2_practice.string;
import java.util.*;
public class longest_SubString {
    public static void main(String[] args) {

        String str = "abcabcbb";
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
