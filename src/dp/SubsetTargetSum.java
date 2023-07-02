package dp;

public class SubsetTargetSum {
    public static boolean targetSum(int[] arr, int sum) {
        int n = arr.length;
        boolean[][]dp = new boolean[n+1][sum+10];
        for(int i=0; i<=n; i++){
            dp[i][0]= true;
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
