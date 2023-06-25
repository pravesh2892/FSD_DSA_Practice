package dp;

public class TribonacciSeries {
    static int tri(int n){
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }

        int[]tribnacci =  new int[n+1];
        tribnacci[0]=0;
        tribnacci[1]=1;
        tribnacci[2]=1;

        for(int i=3; i<=n; i++){
            tribnacci[i]= tribnacci[i-1]+ tribnacci[i-2]+tribnacci[i-3];
        }

        return tribnacci[n];
    }
}
