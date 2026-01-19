class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
       ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
       for(int i=0;i<V;i++){//capital v means total number of verices
           adj.add(new ArrayList<>());
       }
       //One vertex value from one edge
       for(int i=0;i<edges.length;i++){
           int u=edges[i][0];
           int v=edges[i][1];
           adj.get(u).add(v);
           adj.get(v).add(u);
       }
           //visited array
           boolean[] visited=new boolean[V];
           //check comonent
           for(int i=0;i<V;i++){
               if(!visited[i]){
                   if(dfs(i,-1,adj,visited))return true;
               }
           }
       
       return false;
    }
    private boolean dfs (int node,int parent,ArrayList<ArrayList<Integer>>adj,boolean[] visited){
        visited[node]=true;
        for(int neigh:adj.get(node)){
            if(!visited[neigh]){
                if(dfs(neigh,node,adj,visited))return true;
            }else if(neigh!=parent){
                return true;
            }
        }
            return false;    
    }
    
}