class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        int n=nums.length;
        
        int[][] dp=new int [n+1][target+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<=target;j++){
                if(nums[i-1]<=j){
                    int take=dp[i-1][j-nums[i-1]];
                    int not_take=dp[i-1][j];
                    dp[i][j]=take+not_take;
                    
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][target];
    }
}