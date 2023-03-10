package dsa2_practice.string;
import java.util.*;
public class remove_character_morethan_one_occurance {
    public static void main(String[] args) {
        String str="newton";
        char[]arr = str.toCharArray();
        HashMap<Character, Integer>map = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);// n-2, e-1,w-1,t-1,0-1,
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                char ch = entry.getKey();
                System.out.print(ch+" ");


            }
        }


    }
}
