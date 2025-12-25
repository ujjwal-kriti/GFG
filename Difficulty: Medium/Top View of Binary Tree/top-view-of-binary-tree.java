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
  
        // code here
        static class pair{
            Node node;
            int line;
            pair(Node node,int line){
                this.node=node;
                this.line=line;
            }
        }
      public ArrayList<Integer> topView(Node root) {
          
          ArrayList<Integer>result=new ArrayList<>();
          if(root==null) return result;
          
          Queue<pair>queue=new LinkedList<>();
        TreeMap<Integer,Integer>map=new TreeMap<>();
        //(key = line, value = node.data)
        queue.offer(new pair(root,0));
        
        while(!queue.isEmpty()){
            pair curr=queue.poll();
            Node node=curr.node;
            int line=curr.line;
            if(!map.containsKey(line)){
                map.put(line,node.data);
            }
            if(node.left!=null){
                queue.offer(new pair(node.left,line-1));
            }
            if(node.right!=null){
                queue.offer(new pair(node.right,line+1));
            }
        }
                for(int val:map.values()){
                    result.add(val);
                }           
    
    return result;
      }
}