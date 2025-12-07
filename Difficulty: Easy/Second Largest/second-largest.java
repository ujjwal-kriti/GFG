class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int firstlargest=Integer.MIN_VALUE;;
        int seclargest=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>firstlargest){
                seclargest=firstlargest;
                firstlargest=num;
                //num is bewtenn first and second
            }else if(num>seclargest && num<firstlargest){
                seclargest=num;
            }
        }
        return seclargest;
    }
}