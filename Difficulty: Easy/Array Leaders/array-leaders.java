class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer>list=new ArrayList<>();
        int maxright=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=maxright){
                list.add(arr[i]);
                maxright=arr[i];
            }
            
        }
        Collections.reverse(list);
        
         return list;
    
    }
}
