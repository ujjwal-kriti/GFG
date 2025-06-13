int countDigits(int n) {
    // code here
     int count=0;
     if(n==0) return 1;
    for(int i=0;i<=n;i++){
        
         n=n/10;
        count++;
    }
   return count;
}