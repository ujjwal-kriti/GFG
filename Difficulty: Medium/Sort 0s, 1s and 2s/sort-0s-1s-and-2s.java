class Solution {
    public void sort012(int[] arr) {
        // code here
           int count0=0;
           int count1=0;
           int count2=0;
           
           for(int a:arr){
               if(a==0)count0++;
               else if(a==1)count1++;
               else{
                   count2++;
               }
           }
               int index=0;
               for(int i=0;i<count0;i++){
                   arr[index++]=0;
               }
               for(int i=0;i<count1;i++){
                   arr[index++]=1;
               }
               for(int i=0;i<count2;i++){
                   arr[index++]=2;
               }
           
        
    }
}