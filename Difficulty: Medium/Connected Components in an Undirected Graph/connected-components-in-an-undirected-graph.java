class Solution {
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
        //create empty adjacency list
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());//adj = [ [], [], [], ... ]  (V empty lists)
        }
        //fill adjancey list
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            //graph is undireced
            adj.get(u).add(v);
            adj.get(v).add(u);
            
        }
        //visited array
        boolean visited[]=new boolean[V];//capital v
        //this will store all components
        ArrayList<ArrayList<Integer>>result=new ArrayList<>();
        //traverse all vertices
        for(int i=0;i<V;i++){
            if(!visited[i]){
                ArrayList<Integer>component=new ArrayList<>();
                //[
                    //   [0,1,2],
                    //   [3,4]
                    // ] work of connenected compinene
                    dfs(i,adj,visited,component);
                    result.add(component);
            }
        }
        return result;
        
    }
    //dfs helper function
    private void dfs(int node,ArrayList<ArrayList<Integer>>adj,boolean[] visited,ArrayList<Integer>component){
        visited[node]=true;
        component.add(node);
        for(int neighbour:adj.get(node)){
            if(!visited[neighbour]){
                dfs(neighbour,adj,visited,component);
            }
        }
    }
}