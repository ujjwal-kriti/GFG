class Solution {
    
    //--------------------uisng recursion------------
    
    // public int maximumPoints(int mat[][]) {
    //     // code here
    //     return solve(0,3,mat);
    // }
    // public int solve(int day,int last,int [][]mat){
    //     if(day==mat.length){
    //         return 0;
    //     }
    //     int max=0;
    //     for(int task=0;task<3;task++){
    //         if(task!=last){
    //             int points=mat[day][task]+solve(day+1,task,mat);
    //             max=Math.max(max,points);
    //         }
    //     }
    //     return max;
    // }
    
    //-----------------------------------memoization----------
      public int maximumPoints(int[][] mat) {

        int n = mat.length;
        int[][] dp = new int[n][4];

        for(int i=0;i<n;i++){
            for(int j=0;j<4;j++){
                dp[i][j] = -1;
            }
        }

        return solve(0,3,mat,dp);
    }
    int solve(int day,int last,int[][] mat,int[][] dp){

        if(day == mat.length)
            return 0;

        if(dp[day][last] != -1)
            return dp[day][last];

        int max = 0;

        for(int task=0; task<3; task++){

            if(task != last){

                int points = mat[day][task] + solve(day+1,task,mat,dp);

                max = Math.max(max,points);
            }
        }

        return dp[day][last] = max;
    }
}