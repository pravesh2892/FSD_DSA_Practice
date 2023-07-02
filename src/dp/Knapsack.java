package dp;

public class Knapsack {
    static int maxWeight(int w[], int v[], int W) {
        int n = v.length;
        int[][]dp = new int[n+1][W+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=W; j++){
                if(w[i-1]>j){
                    dp[i][j]= dp[i-1][j];
                }else{
                    dp[i][j]= Math.max(dp[i-1][j], v[i-1]+dp[i-1][j-w[i-1]]);
                }
            }
        }
        return dp[n][W];
    }
}
