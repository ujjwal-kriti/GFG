class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return new ArrayList<>(Arrays.asList(min,max));
    }
}
