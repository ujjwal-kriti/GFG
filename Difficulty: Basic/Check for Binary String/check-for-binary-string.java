class Solution {
    boolean isBinary(String s) {
        // Your code here
        int n=s.length();
        for(int i=0;i<n;i++){
            if((s.charAt(i)!='0' && s.charAt(i)!='1' )){
                return false;
            }
        }
        return true;
    }
}