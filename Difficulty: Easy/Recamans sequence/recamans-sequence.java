// User function Template for Java

class Solution {
    static ArrayList<Integer> recamanSequence(int n) {
        // code here
        
        ArrayList<Integer>seq=new ArrayList<>();
        seq.add(0);
        generate(seq,1,n);
        return seq;
        
        
    }
    static void generate(ArrayList<Integer>seq,int index,int n){
        if(index==n) return;//base case
        int prev=seq.get(index-1);
        int back=prev-index;
        if(back>0 && !seq.contains(back)){
            seq.add (back);
        }else{
            seq.add(prev+index);
        }
        //recursive call for next index
        generate(seq,index+1,n);
    }
}