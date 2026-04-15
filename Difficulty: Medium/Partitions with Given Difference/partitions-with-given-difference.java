    class Solution {
        public int countPartitions(int[] arr, int diff) {
            // code here
            int totalsum=0;
            for(int num:arr){
                totalsum+=num;
            }
            if(totalsum<diff || (totalsum+ diff)%2!=0){
                return 0;
            }
            int target=(totalsum+diff)/2;
            int n=arr.length;
            int[][] dp=new int[n+1][target+1];
            for(int i=0;i<=n;i++){
                dp[i][0]=1;
            }
            for(int i=1;i<=n;i++){
                for(int j=0;j<=target;j++){
                    //not take
                    dp[i][j]=dp[i-1][j];
                    if(arr[i-1]<=j){
                        dp[i][j]+=dp[i-1][j-arr[i-1]];
                    }
                }
            }
            return dp[n][target];
            
        }
        
    }
