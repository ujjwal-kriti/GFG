class Solution {
    public static int digitalRoot(int n) {
        // code here
        if(n<10)return n;
        int sum=SumOfDigits(n);
        return digitalRoot(sum);
        
    }
       public static int SumOfDigits(int n){
           if(n==0)return 0;
           return(n%10)+SumOfDigits(n/10);
       }
    
}