class Solution {

     public static Boolean isSubsetSum(int arr[], int sum) {
        // code here----------------reursion--------
    //     return  helper(arr,arr.length,sum);
    // }
    // public static  boolean helper(int arr[],int i,int sum){
    //     if(sum==0) return true;
    //     if(i==0) return false;
    //     if(arr[i-1]<=sum){
    //         return helper(arr,i-1,sum) || helper(arr,i-1,sum-arr[i-1]);
    //     }
    //     return helper(arr,i-1,sum);
    
    //--------------memoization--------------------
    int n =arr.length;
        int[][] dp=new int[n+1][sum+1];
            for(int i=0;i<=n;i++){
                for(int j=0;j<=sum;j++){
                    dp[i][j]=-1;
                }
            }
        return helper(arr,arr.length,sum,dp);
    }
    static boolean helper(int []arr,int i,int sum, int[][]dp){
        if(sum==0) return true;
        if(i==0) return false;
        if(dp[i][sum]!=-1){
            return dp[i][sum]==1;
        }
        boolean result;
        if(arr[i-1]<=sum){
            result=helper(arr,i-1,sum,dp)|| helper(arr,i-1,sum-arr[i-1],dp);
        }else{
            result=helper(arr,i-1,sum,dp);
        }
        if(result == true){
            dp[i][sum] = 1;
        } else {
            dp[i][sum] = 0;
        }
        return result;
    }
}