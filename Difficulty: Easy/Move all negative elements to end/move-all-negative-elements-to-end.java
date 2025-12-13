// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
        int n=arr.length;
        int [] temp=new int[n];
        int idx=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0)
            temp[idx++]=arr[i];
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0)
            temp[idx++]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
}