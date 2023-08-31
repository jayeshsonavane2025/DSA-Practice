package com.backtrack;

public class RatInAMaze {
    public RatInAMaze() {
    }

    public static void main(String[] args) {
        int[][] mat = new int[][]{{1, 1, 1, 0}, {1, 0, 1, 1}, {1, 1, 1, 1}, {0, 1, 1, 1}};
        int n = mat.length;
        int m = mat[0].length;
        boolean[][] vis = new boolean[n][m];
        vis[0][0] = true;
        ratInAMaze(mat, vis, 0, 0, "", n, m);
    }

    static boolean isValid(int i, int j, int[][] mat, boolean[][] vis, int n, int m) {
        return i < n && i >= 0 && j < m && j >= 0 && mat[i][j] == 1 && !vis[i][j];
    }

    static void ratInAMaze(int[][] mat, boolean[][] vis, int i, int j, String path, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            System.out.println(path);
        } else {
            if (isValid(i + 1, j, mat, vis, n, m)) {
                vis[i + 1][j] = true;
                ratInAMaze(mat, vis, i + 1, j, path + "D", n, m);
                vis[i + 1][j] = false;
            }

            if (isValid(i, j - 1, mat, vis, n, m)) {
                vis[i][j - 1] = true;
                ratInAMaze(mat, vis, i, j - 1, path + "L", n, m);
                vis[i][j - 1] = false;
            }

            if (isValid(i, j + 1, mat, vis, n, m)) {
                vis[i][j + 1] = true;
                ratInAMaze(mat, vis, i, j + 1, path + "R", n, m);
                vis[i][j + 1] = false;
            }

            if (isValid(i - 1, j, mat, vis, n, m)) {
                vis[i - 1][j] = true;
                ratInAMaze(mat, vis, i - 1, j, path + "U", n, m);
                vis[i - 1][j] = false;
            }

        }
    }
}
