
   
class Solution {

    public ArrayList<Integer> topoSort(int V, int[][] edges) {

        // Step 1: Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Step 2: Add edges in adjacency list
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
        }

        // Step 3: Visited array + Stack
        int[] vis = new int[V];
        Stack<Integer> st = new Stack<>();

        // Step 4: DFS call for all nodes
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                dfs(i, vis, st, adj);
            }
        }

        // Step 5: Pop stack to get Topological Order
        ArrayList<Integer> ans = new ArrayList<>();
        while (!st.isEmpty()) {
            ans.add(st.pop());
        }

        return ans;
    }

    // DFS function
    private void dfs(int node, int[] vis, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj) {

        vis[node] = 1; // mark visited

        // visit all neighbours
        for (int neighbour : adj.get(node)) {
            if (vis[neighbour] == 0) {
                dfs(neighbour, vis, st, adj);
            }
        }

        // push node after visiting all neighbours
        st.push(node);
    }
}
