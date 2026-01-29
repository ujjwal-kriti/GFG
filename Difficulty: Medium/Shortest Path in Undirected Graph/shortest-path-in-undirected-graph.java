import java.util.*;

class Solution {
    public int[] shortestPath(int V, int[][] edges, int src) {

        // Step 1: Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Step 2: Add edges (undirected)
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // Step 3: Distance array
        int[] dist = new int[V];
        Arrays.fill(dist, -1);   // IMPORTANT
        
        // Step 4: BFS
        Queue<Integer> q = new LinkedList<>();
        dist[src] = 0;
        q.add(src);

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int neigh : adj.get(node)) {
                if (dist[neigh] == -1) {
                    dist[neigh] = dist[node] + 1;
                    q.add(neigh);
                }
            }
        }

        return dist;
    }
}
