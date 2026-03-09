    class Solution {
        public static ArrayList<Integer> findUnion(int[] a, int[] b) {
            // code here
            int p=a.length;
            int q=b.length;
           HashMap<Integer,Integer>map=new HashMap<>();
           for(int i=0;i<p;i++){
               map.put(a[i],1);
           }
           for(int j=0;j<q;j++){
               map.put(b[j],1);
           }
           ArrayList<Integer>ans = new ArrayList<>();
           for(int key : map.keySet()){
            ans.add(key);
        }
        return ans;
        }
    }