class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int ans=arr[n-1]-arr[0];
        int small=arr[0]+k;
        int large=arr[n-1]-k;
        for(int i=0;i<n-1;i++){
            int mini=Math.min(small,arr[i+1]-k);
            int maxi=Math.max(large,arr[i]+k);
            if(mini<0) continue;
                ans=Math.min(ans,maxi-mini);
            
        }
        return ans;
    }
}
