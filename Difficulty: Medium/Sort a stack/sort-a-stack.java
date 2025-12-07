class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        if(st.empty()) return;
        
        //pop elmnt
        int top=st.pop();
        //sort
        sortStack(st);
        //insert poped elment
        insertSorted(st,top);
    }
    private void insertSorted(Stack<Integer>st,int x){
        // if x is greater than top push
        if(st.isEmpty() || st.peek()<=x){
            st.push(x);
            return;
        }
        // if x is smaller tham top  remoeve top and recurese
        int top=st.pop();
        insertSorted(st,x);
        //repush removed elmnt
        st.push(top);
        
    }
}