// User function Template for Java

class Solution {
    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
        // code here
        return helper(0,arr,N,K);
    }
    static boolean helper(int index,int [] arr,int N,int K){
        
        if(K==0) return  true;
        if(index==N) return false;
        //pick this elmnt
        if(arr[index]<=K){
            if(helper(index+1,arr,N,K-arr[index])){
                return true;
            }
        }
        //don not pick this elmnt
        return helper(index+1,arr,N,K);
    }
}
