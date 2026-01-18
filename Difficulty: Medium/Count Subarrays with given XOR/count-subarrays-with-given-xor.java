class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here------------better approach-----------
    //   int n=arr.length;
    //   int count=0;
    //   for(int i=0;i<n;i++){
    //         int xor=0;
    //       for(int j=i;j<n;j++){
    //           xor^=arr[j];
           
    //       if(xor==k)count++;
    //       }
    //     }
    //     return count;
    
    //optimal approach
    
    int xor=0;
    int count=0;
    HashMap<Integer,Integer>map=new HashMap<>();
    map.put(0,1);
    for(int i=0;i<arr.length;i++){
        xor^=arr[i];//update prefix xor
        int x=xor^k;//required previous xor
        count+=map.getOrDefault(x,0);
        map.put(xor,map.getOrDefault(xor,0)+1);
    }
    return count;
    }
}