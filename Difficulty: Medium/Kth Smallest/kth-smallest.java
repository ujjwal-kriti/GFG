class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        
        //took o(logn) time complexity
            // Arrays.sort(arr);
            // return arr[k-1];
        //-------------------------reduce tc--------
        Queue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int count=0;
        while(!pq.isEmpty()){
               int val=pq.poll();
               count++;
            if(count==k){
                return val;
            }
        }
        return -1;
    }
}
