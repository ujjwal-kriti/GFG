class Solution {
    public int longCommSubstr(String s1, String s2) {
        // code here
        int[][] dp=new int[s1.length()][s2.length()];
        int longest=0;
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    if(i==0||j==0){
                        dp[i][j]=1;
                    }else
                    {
                        dp[i][j]=dp[i-1][j-1]+1;
                        
                    }
                    
                    longest=Math.max(longest,dp[i][j]);
                }
            }
        }
        return longest;
    }
}