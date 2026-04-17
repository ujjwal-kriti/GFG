class Solution {
    public int cutRod(int[] price) {
    //     int n=price.length;
    //     // code here
    //     return helper(price,0,n);
        
    // }
    // public int helper(int[] price, int i, int length){
        
    //     if (i==price.length) return 0;
    //     if(length==0) return 0;
    //     int take=0;
    //     if(i+1<=length){
    //         take=price[i]+helper(price,i,length-(i+1));
    //     }
    //     int nottake=helper(price,i+1,length);
    //     return Math.max(take,nottake);
    
    // using dp
    int n=price.length;
    int[][] dp=  new int[n+1][n+1];

    for(int i=1;i<=n;i++){
        for(int length=0;length<=n;length++){
            dp[i][length]=dp[i-1][length];
        
            if(i<=length){
                dp[i][length]=Math.max(dp[i][length],price[i-1]+dp[i][length-i]);
            }
        }
    }
    return dp[n][n];
    }
}