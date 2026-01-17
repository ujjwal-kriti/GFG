// User function Template for Java

class Solution {
    static int exactlyK(int arr[], int k) {
        return atmost(arr,k)-atmost(arr,k-1);
    }
        // code here
        //-----------------------using brute force----------
    //   int count=0;
    //   int n=arr.length;
    //   for(int i=0;i<n;i++){
    //       HashMap<Integer,Integer>map=new HashMap<>();
    //       for(int j=i;j<n;j++){
    //           map.put(arr[j],map.getOrDefault(arr[j],0)+1);
    //           if(map.size()==k)count++;
    //           else if(map.size()>k) break;
    //       }
    //   }
    //   return count;
        static int atmost(int arr[],int k){
         
        if(k<0) return 0;
        int n=arr.length;
        int l=0,r=0;
        int count=0;
        Map<Integer,Integer>map=new HashMap<>();
        while(r<n){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            while(map.size()>k){
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0){
                    map.remove(arr[l]);
                }
                l++;
            }
            count=count+(r-l+1);
            r++;
        }
        return count;
    }
}
