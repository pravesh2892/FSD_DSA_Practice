package important_questions;
import  java.util.*;
public class Shortest_Distance_to_a_Character {
    public static void main(String[] args) {
        String str = "loveleetcode";
        char ch ='c';
        ShortestDistancetoCharacter(str ,ch);
    }
    public  static  void ShortestDistancetoCharacter(String s , char c){

        int[] result = new int[s.length()];

        int lastC = -1;
        int lastNonC = 0;

        for(int i = 0; i<s.length(); i++)
            if(s.charAt(i) == c){
                while(lastNonC<=i)
                    result[lastNonC] = Math.min(result[lastNonC], i-lastNonC++);
                lastC = i;
            }else
                result[i] = lastC != -1 ? i-lastC : Integer.MAX_VALUE;
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }

    }
}
