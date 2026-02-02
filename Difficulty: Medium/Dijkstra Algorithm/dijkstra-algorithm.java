class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        
        // ----------------------------------------
        // Step 1: Create adjacency list
        // ----------------------------------------
        // Each index stores list of {neighbor, weight}
        // Example: adj[0] = [{1, 5}, {2, 3}]
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();

        // initialize empty list for each vertex
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // fill adjacency list from edges
        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            int w = e[2];

            // since graph is undirected
            adj.get(u).add(new int[]{v, w});
            adj.get(v).add(new int[]{u, w});
        }

        // ----------------------------------------
        // Step 2: Distance array
        // ----------------------------------------
        // dist[i] = shortest distance from src → i
        int[] dist = new int[V];

        // initialize all distances as infinity
        Arrays.fill(dist, Integer.MAX_VALUE);

        // distance of source from itself = 0
        dist[src] = 0;

        // ----------------------------------------
        // Step 3: Min Heap (Priority Queue)
        // ----------------------------------------
        // Stores {distance, node}
        // always gives the node with smallest distance first
        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) -> a[0] - b[0]);

        // push source node
        pq.add(new int[]{0, src});

        // ----------------------------------------
        // Step 4: Dijkstra algorithm
        // ----------------------------------------
        while (!pq.isEmpty()) {

            // get node with smallest distance
            int[] curr = pq.poll();
            int currDist = curr[0];
            int node = curr[1];

            // skip if we already found better path
            if (currDist > dist[node]) continue;

            // check all neighbors of this node
            for (int[] neighbor : adj.get(node)) {

                int nextNode = neighbor[0];
                int weight = neighbor[1];

                // relaxation step
                // if shorter path found → update
                if (dist[node] + weight < dist[nextNode]) {

                    dist[nextNode] = dist[node] + weight;

                    // push updated distance into heap
                    pq.add(new int[]{dist[nextNode], nextNode});
                }
            }
        }

        // ----------------------------------------
        // Step 5: return final distances
        // ----------------------------------------
        return dist;
    }
}
// index	meaning
// e[0]	starting node (u)
// e[1]	ending node (v)
// e[2]	weight (w)