class Solution:
    def dfs(self, adj):

        n = len(adj)
        visited = [False] * n

        stack = [0]
        ans = []

        while stack:

            node = stack.pop()

            if visited[node]:
                continue

            visited[node] = True
            ans.append(node)

            for nei in reversed(adj[node]):
                if not visited[nei]:
                    stack.append(nei)

        return ans