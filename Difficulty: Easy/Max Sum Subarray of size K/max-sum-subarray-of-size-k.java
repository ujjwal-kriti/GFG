class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        
        int n=arr.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int maxsum=sum;
        int left=0,right=k-1;
        while(right<n-1){
            sum=sum-arr[left];
            left++;
            right++;
            sum=sum+arr[right];
            maxsum=Math.max(maxsum,sum);
        }
       return maxsum;
    }
}