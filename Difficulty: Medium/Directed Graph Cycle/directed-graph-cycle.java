class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here-----------------uisng dfs-------------
    //     ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
    //   for(int i=0;i<V;i++){//capital v means total number of verices
    //       adj.add(new ArrayList<>());
    //   }
    //   //One vertex value from one edge
    //   for(int i=0;i<edges.length;i++){
    //       int u=edges[i][0];
    //       int v=edges[i][1];
    //       adj.get(u).add(v);
           
    //   }
    //       //visited array
    //       boolean[] visited=new boolean[V];
    //       boolean[] pathVis = new boolean[V]; // nodes in current DFS path
    //       //check comonent
    //       for(int i=0;i<V;i++){
    //           if(!visited[i]){
    //               if(dfs(i,-1,adj,visited))return true;
    //           }
    //       }
       
    //   return false;
    // }
    
    // private boolean dfs (int node,int parent,ArrayList<ArrayList<Integer>>adj,boolean[] visited,boolean[] pathvis){
    //     visited[node]=true;
    //     pathvis[node]=true;
        
    //     for(int neigh:adj.get(node)){
    //         if(!visited[neigh]){
    //             if(dfs(neigh,node,adj,visited,pathvis))return true;
    //             // if already in current path => cycle
    //         }else if(pathvis[neigh]){
    //             return true;
    //         }
            
    //     }
    //     pathvis[node]=false;
    //         return false;    
    
    //-------------------------------using bfs(kahns)--------------------
    ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        // Step 2: Create indegree array
        // indegree[i] = number of incoming edges to node i
        int [] indegree=new int[V];
        // Step 3: Fill adjacency list and indegree array
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);//Value is between 0 and V-1 small v u->v
            indegree[v]++;
        }
          // Step 4: Push all nodes with indegree 0 into queue
        // These nodes have no dependency
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<V;i++)//Means 👉 total number of vertices (nodes),Fixed number
        //Used in loops, array sizes
        {
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int count=0;
         
        
          //bfs
          while(!q.isEmpty()){
              int node=q.poll();
              
              count++;
              //reduce indegree of all its neighbour
               for (int neighbor : adj.get(node)) {
                indegree[neighbor]--;

                // If indegree becomes 0, add to queue
                if (indegree[neighbor] == 0) {
                    q.add(neighbor);
                }
            }
          }
          if(count==V)return false;
          return true;
    }
}