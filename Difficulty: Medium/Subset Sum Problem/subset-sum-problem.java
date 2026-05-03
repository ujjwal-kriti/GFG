class Solution {

     public static Boolean isSubsetSum(int arr[], int sum) {
        // ----------------reursion---------------
    //     return  helper(arr,arr.length,sum);
    // }
    // public static  boolean helper(int arr[],int i,int sum){
    //     if(sum==0) return true;
    //     if(i==0) return false;
    //     if(arr[i-1]<=sum){
    //         return helper(arr,i-1,sum) || helper(arr,i-1,sum-arr[i-1]);
    //     }
    //     return helper(arr,i-1,sum);
    
        
    //---------------------------------tabulationmethod----------------
        
        int n=arr.length;
        boolean[][] dp=new boolean[n+1][sum+1];
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<=n;i++){
            for(int s=1;s<=sum;s++){
                dp[i][s]=dp[i-1][s];
                if(arr[i-1]<=s){
                    dp[i][s]=dp[i][s]||dp[i-1][s-arr[i-1]];
                }
            }
        }
        
        return dp[n][sum];
        
        
    }
}