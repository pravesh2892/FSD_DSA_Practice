package dp;

public class GridProblem {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(countWays(n, m));
    }
    public static int countWays(int n , int m){
        if(n==1 || m==1){
            return 1;
        }
        return countWays(n-1, m)+ countWays(n, m-1);
    }
}
