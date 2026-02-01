import java.util.*;

class Solution {

    // Topological sort using DFS
    private void topoSort(int node, ArrayList<ArrayList<int[]>> adj,
                          boolean[] vis, Stack<Integer> st) {

        vis[node] = true;

        for (int[] it : adj.get(node)) {
            int v = it[0];
            if (!vis[v]) {
                topoSort(v, adj, vis, st);
            }
        }

        st.push(node);
    }

    public int[] shortestPath(int V, int E, int[][] edges) {

        // adjacency list: u -> (v, wt)
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.get(u).add(new int[]{v, wt});
        }

        // Step 1: Topological sort
        boolean[] vis = new boolean[V];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                topoSort(i, adj, vis, st);
            }
        }

        // Step 2: Distance array
        int[] dist = new int[V];
        Arrays.fill(dist, (int)1e9);
        dist[0] = 0;

        // Step 3: Relax edges in topo order
        while (!st.isEmpty()) {
            int node = st.pop();

            if (dist[node] != (int)1e9) {
                for (int[] it : adj.get(node)) {
                    int v = it[0];
                    int wt = it[1];

                    if (dist[node] + wt < dist[v]) {
                        dist[v] = dist[node] + wt;
                    }
                }
            }
        }

        // Step 4: unreachable nodes → -1
        for (int i = 0; i < V; i++) {
            if (dist[i] == (int)1e9) dist[i] = -1;
        }

        return dist;
    }
}
