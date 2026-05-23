class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty()){
            return;
        }
        int top=st.pop();
        reverseStack(st);
        insertAtBottom(st,top);
    }
    public static void insertAtBottom(Stack<Integer>st,int elmnt){
        if(st.isEmpty()){
            st.push(elmnt);
            return;
        }
        int top=st.pop();
        insertAtBottom(st,elmnt);
        st.push(top);
    }
}
