    class Solution {
        public int countPartitions(int[] arr, int diff) {
            int n=arr.length;
            int sum=0;
            for(int num:arr){
                sum+=num;
            }
            if((diff + sum) % 2 != 0){
                return 0;
            }

            int target = (diff + sum) / 2;
            int[][] dp=new int[n+1][target+1];
          
                dp[0][0]=1;
            
            for(int i=1;i<=n;i++){
                for(int j=0;j<=target;j++){
                    if(arr[i-1]<=j){
                        int take=dp[i-1][j-arr[i-1]];
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
