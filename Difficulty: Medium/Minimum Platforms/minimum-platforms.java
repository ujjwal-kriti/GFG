class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        int n=arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0;
        int j=0;
        int platform=0;
        int maxplatform=0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                platform++;
                i++;
            }else{
                platform--;
                j++;
            }
            maxplatform=Math.max(maxplatform,platform);
        }
        return maxplatform;
    }
}
