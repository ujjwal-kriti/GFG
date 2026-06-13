class Solution:
    def bfs(self, adj):
        # code here
        n=len(adj)
        visited=[False]*n
        q=deque([0])
        visited[0]=True
        ans=[]
        while q:
            node=q.popleft()
            ans.append(node)
            for nei  in adj[node]:
                if not visited[nei]:
                    visited[nei]=True
                    q.append(nei)
        return ans