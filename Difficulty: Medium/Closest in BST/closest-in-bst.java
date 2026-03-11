/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    // Function to find the least absolute difference between any node
    // value of the BST and the given integer.
    static int minDiff(Node root, int K) {
        // Write your code here
        int min=Integer.MAX_VALUE;
        Node current=root;
        while(current!=null){
            int diff=Math.abs(current.data-K);
            min=Math.min(min,diff);
            if(K<current.data){
                current=current.left;
            }else if(K>current.data){
                current=current.right;
            }
            else{
                return 0;
                
            }
        }
        return min;
    }
}