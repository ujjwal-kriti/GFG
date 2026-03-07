/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
          class pair{
              Node node;
              int col;
              pair(Node node,int col){
                  this.node=node;
                  this.col=col;
              }
          }
          
      public ArrayList<Integer> bottomView(Node root) {
             // TreeMap is used because it keeps keys (columns) sorted automatically
        // key   -> column number
        // value -> node value visible from top
        TreeMap<Integer,Integer>map=new TreeMap<>();
        Queue<pair>q=new LinkedList<>();
        q.add(new  pair(root,0));
        while(!q.isEmpty()){
            pair p=q.poll();
            Node node=p.node;
            int col=p.col;
            map.put(col,node.data);
            //left child
            if(node.left!=null){
                q.add(new pair(node.left,col-1));
            }
            if(node.right!=null){
                q.add(new pair(node.right,col+1));
            }
            
        }
        return new ArrayList<>(map.values());
      }
}
