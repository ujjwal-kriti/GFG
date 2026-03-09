// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
        int idx=0;
      int n=arr.length;
      int[] temp=new int[n];
      for(int i=0;i<n;i++){
          if(arr[i]>=0){
              temp[idx]=arr[i];
              idx++;
          }
      }
       for(int i=0;i<n;i++){
          if(arr[i]<0){
              temp[idx]=arr[i];
              idx++;
          }
      }
       for(int i=0;i<n;i++){
         arr[i]=temp[i];
      }
    }
}