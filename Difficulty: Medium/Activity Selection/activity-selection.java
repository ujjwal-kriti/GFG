class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int n=start.length;
        int[][] activities=new int[n][2];
        for(int i=0;i<n;i++){
            activities[i][0]=start[i];
            activities[i][1]=finish[i];
            
        }
        //sort
    Arrays.sort(activities,(a,b) -> a[1]-b[1]);
    int  lastfinish=activities[0][1];
    int count=1;
    for(int i=1;i<n;i++){
        if(activities[i][0]>lastfinish){
            count++;
            lastfinish=activities[i][1];
        }
        
    }
    return count;
    }
}
//sort in finishing tiime  m
