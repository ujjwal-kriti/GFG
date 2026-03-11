class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
      int n=arr.length;
      ArrayList<Integer>res=new ArrayList<>();
      for(int i=0;i<n;i++){
          boolean leader=true;
          for(int j=i+1;j<n;j++){
              
              if(arr[j]>arr[i]){
                  leader=false;
                  break;
              }
          }
          if(leader){
              res.add(arr[i]);
          }
      }
      return res;
    }
}
