class Solution {
    public int findSubarray(int[] arr) {
        // code here.
        // int count=0;
        // int n=arr.length;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=arr[j];
        //         if(sum==0){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        
        //------------------------prefixsum+hashmap---------------
        int sum=0;
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int num:arr){
            sum+=num;
        
        if(map.containsKey(sum)){
            //map.get(sum) means how many times a elment appered give that value
            count+=map.get(sum);
        }
        map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
        
        //-------------------------
    //       HashMap<Integer, Integer> map = new HashMap<>();

    // int sum = 0;
    // int count = 0;

    // map.put(0, 1);

    // for (int i = 0; i < arr.length; i++) {
    //     sum += arr[i];

    //     if (map.containsKey(sum)) {
    //         count += map.get(sum);
    //         map.put(sum, map.get(sum) + 1);
    //     } else {
    //         map.put(sum, 1);
//         }
//     }

//     return count;
// }
    }
}
