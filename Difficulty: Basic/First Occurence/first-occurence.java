class Solution {
    int firstOccurence(String txt, String pat) {
        // code here
        int n=txt.length();
        int m=pat.length();
        //n-m means becz while making pairs alwys last elmnt eill be left
        for(int i=0;i<=n-m;i++){
            int j;//for pat
            for( j=0;j<m;j++){
                if(txt.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
            }
            if(j==m){
                return i;
            }
        }
        return -1;
    }
}