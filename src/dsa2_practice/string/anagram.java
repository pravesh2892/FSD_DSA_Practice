package dsa2_practice.string;
import  java.util.*;
import java.io.*;
public class anagram {
    public static void main(String[] args) {
        String str1="pravesh";
        String str2="veshpra";
        if(isAnagram(str1, str2)){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }

// Check by Sorting
// public static boolean isAnagram(String string1, String string2) {
//     if (string1.length() != string2.length()) {
//         return false;
//     }
//     char[] a1 = string1.toCharArray();
//     char[] a2 = string2.toCharArray();
//     Arrays.sort(a1);
//     Arrays.sort(a2);
//     return Arrays.equals(a1, a2);
// }

    //Check by Counting
    private static int CHARACTER_RANGE= 256;

// public static boolean isAnagram(String string1, String string2) {
//     if (string1.length() != string2.length()) {
//         return false;
//     }
//     int count[] = new int[CHARACTER_RANGE];
//     for (int i = 0; i < string1.length(); i++) {
//         count[string1.charAt(i)]++;
//         count[string2.charAt(i)]--;
//     }
//     for (int i = 0; i < CHARACTER_RANGE; i++) {
//         if (count[i] != 0) {
//             return false;
//         }
//     }
//     return true;
// }


// using hashmap

    public static boolean isAnagram(String str1, String str2){
        HashMap<Character, Integer> countStr1 = new HashMap<>();
        HashMap<Character, Integer> countstr2 = new HashMap<>();
        if (str1.length() != str2.length()){
            return false;
        }
        // count frequencies of characters
        for (int i=0; i < str1.length(); i++){
            countStr1.put(str1.charAt(i), countStr1.getOrDefault(str1.charAt(i),0) + 1);
            countstr2.put(str2.charAt(i), countstr2.getOrDefault(str2.charAt(i),0) + 1);
        }


        // compare to map
        for (Map.Entry<Character, Integer> entry : countstr2.entrySet()){
            if (entry.getValue() != countStr1.get(entry.getKey())){
                return false;
            }
        }
        return true;
    }
}


