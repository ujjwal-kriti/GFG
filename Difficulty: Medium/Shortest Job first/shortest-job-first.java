// User function Template for Java

class Solution {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int n=bt.length;
        int totalwaitingtime=0;
        int waitingtime=0;
        for(int i=0;i<n;i++){
            totalwaitingtime+=waitingtime;
            waitingtime+=bt[i];
        }
         return totalwaitingtime / n;
    }
}
