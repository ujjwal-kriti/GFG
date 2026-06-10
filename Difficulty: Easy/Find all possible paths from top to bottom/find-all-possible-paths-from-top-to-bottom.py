class Solution:
    def findAllPossiblePaths(self, n, m, mat):
        ans = []

        def backtrack(r, c, path):
            path.append(mat[r][c])

            if r == n - 1 and c == m - 1:
                ans.append(path[:])  # copy path
                path.pop()
                return

            # Down
            if r + 1 < n:
                backtrack(r + 1, c, path)

            # Right
            if c + 1 < m:
                backtrack(r, c + 1, path)

            path.pop()  # backtrack

        backtrack(0, 0, [])
        return ans