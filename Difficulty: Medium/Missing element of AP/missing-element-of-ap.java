// User function Template for Java

class Solution {
    public int findMissing(int[] arr) {
        // code here
        int n=arr.length;
        int d=Math.abs(arr[1]-arr[0]);
        for(int i=0;i<n-1;i++){
            d=Math.min(d,Math.abs(arr[i+1]-arr[i]));
        }
        if(arr[1]<arr[0]){
            d=-d;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i+1]-arr[i]!=d){
                return arr[i]+d;
            }
        }
        return arr[n-1]+d;
     
    }
}
