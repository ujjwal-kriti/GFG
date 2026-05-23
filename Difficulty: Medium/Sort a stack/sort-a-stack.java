class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        Stack<Integer>temp=new Stack<>();
        while(!st.isEmpty()){
            int current=st.pop();
            while(!temp.isEmpty() && temp.peek()<current){
                st.push(temp.pop());
            }
            temp.push(current);
        }
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        
    }
}