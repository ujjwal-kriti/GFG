import java.util.*;

class Solution {

    public ArrayList<String> ratInMaze(int[][] maze) {

        ArrayList<String> res = new ArrayList<>();
        int n = maze.length;

        if (maze[0][0] == 0) {
            return res;
        }

        boolean[][] visited = new boolean[n][n];

        backtrack(0, 0, n - 1, n - 1, visited, maze, res, "");

        return res;
    }

    static void backtrack(int r, int c,
                          int dr, int dc,
                          boolean[][] visited,
                          int[][] maze,
                          ArrayList<String> res,
                          String path) {

        // Invalid cell
        if (r < 0 || r > dr || c < 0 || c > dc ||
            maze[r][c] == 0 || visited[r][c]) {
            return;
        }

        // Destination reached
        if (r == dr && c == dc) {
            res.add(path);
            return;
        }

        visited[r][c] = true;

        // D L R U (lexicographical order)
        backtrack(r + 1, c, dr, dc, visited, maze, res, path + "D");
        backtrack(r, c - 1, dr, dc, visited, maze, res, path + "L");
        backtrack(r, c + 1, dr, dc, visited, maze, res, path + "R");
        backtrack(r - 1, c, dr, dc, visited, maze, res, path + "U");

        visited[r][c] = false; // backtrack
    }
}