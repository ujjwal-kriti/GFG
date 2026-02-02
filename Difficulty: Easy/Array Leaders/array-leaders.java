class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer>leaders=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            boolean isleaders=true;
        
        for(int j=i+1;j<n;j++){
            if(arr[j]>arr[i]){
                 isleaders=false;
                break;
            }
        }
        if(isleaders){
            leaders.add(arr[i]);
        }
    }
        return leaders;
    
    }
}
