package dp;

public class Permutation {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[]arr = str.toCharArray();
        Arrays.sort(arr);
        String sortedString = new String(arr);
        generatePermutations(sortedString, "");
    }
    public static void generatePermutations(String s, String current){
        if (s.length() == 0) {
            System.out.print(current + " ");
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String remaining = s.substring(0, i) + s.substring(i + 1);
            generatePermutations(remaining, current + ch);
        }
    }
}
