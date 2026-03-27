class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n=a.length;
        int m=b.length;
        for(int i=0;i<n;i++){
            if(a[i]>b[0]){
                //swap
                int temp=a[i];
                a[i]=b[0];
                b[0]=temp;
                
                //fix b
                int first=b[0];
                int k=1;
                while(k<m && b[k]<first){
                    b[k-1]=b[k];
                    k++;
                }
                b[k-1]=first;
            }
        }
    }
}
