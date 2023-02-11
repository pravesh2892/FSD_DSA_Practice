package Hashing.post_class;
import java.util.*;
public class Number_of_characters_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        HashSet<Character> set = new HashSet<Character>();
        for(int i=0; i<n; i++){
            set.add(str.charAt(i));
        }
        System.out.println(set.size());
    }
}
