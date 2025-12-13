class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        Arrays.sort(arr);
       int n=arr.length;
       ArrayList<Integer>result=new ArrayList<>();
       result.add(arr[0]);
       result.add(arr[n-1]);
       return result;
    }
}
