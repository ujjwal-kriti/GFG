
   
class Solution {

     public ArrayList<Integer> topoSort(int V, int[][] edges) {
         
         //---------------------------------uisng stack +dfs toposort-------------

    //     // Step 1: Create adjacency list
    //     ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    //     for (int i = 0; i < V; i++) {
    //         adj.add(new ArrayList<>());
    //     }

    //     // Step 2: Add edges in adjacency list
    //     for (int i = 0; i < edges.length; i++) {
    //         int u = edges[i][0];
    //         int v = edges[i][1];
    //         adj.get(u).add(v);
    //     }

    //     // Step 3: Visited array + Stack
    //     int[] vis = new int[V];
    //     Stack<Integer> st = new Stack<>();

    //     // Step 4: DFS call for all nodes
    //     for (int i = 0; i < V; i++) {
    //         if (vis[i] == 0) {
    //             dfs(i, vis, st, adj);
    //         }
    //     }

    //     // Step 5: Pop stack to get Topological Order
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     while (!st.isEmpty()) {
    //         ans.add(st.pop());
    //     }

    //     return ans;
    // }

    // // DFS function
    // private void dfs(int node, int[] vis, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj) {

    //     vis[node] = 1; // mark visited

    //     // visit all neighbours
    //     for (int neighbour : adj.get(node)) {
    //         if (vis[neighbour] == 0) {
    //             dfs(neighbour, vis, st, adj);
    //         }
    //     }

    //     // push node after visiting all neighbours
    //     st.push(node);
    
    
    
    //----------------------------using bfs+queue-(kahn's algorithm)-----------------------------
    
    //create adjacency list
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
         // This will store the topological order
          ArrayList<Integer> topo = new ArrayList<>();
          //bfs
          while(!q.isEmpty()){
              int node=q.poll();
              topo.add(node);
              //reduce indegree of all its neighbour
               for (int neighbor : adj.get(node)) {
                indegree[neighbor]--;

                // If indegree becomes 0, add to queue
                if (indegree[neighbor] == 0) {
                    q.add(neighbor);
                }
            }
          }
          return topo;
    }
}
