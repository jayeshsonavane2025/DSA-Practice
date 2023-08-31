package com.backtrack;
import java.util.*;


public class Solution {
    public static void main(String[] args) {
        int[][]arr = {{1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}};
        ArrayList<String> list=new ArrayList<>();
        System.out.println(findPath(arr,4,list));
    }

    public static ArrayList < String > findPath(int[][] arr, int n,ArrayList<String>list) {
        //You can code here

        boolean[][] vis=new boolean[n][n];
        vis[0][0]=true;

         ratInAMaze(arr,vis,list,0,0,n,"");
         return list;

    }

    private static void ratInAMaze(int[][] arr, boolean[][] vis, List<String> list, int i, int j, int n, String s) {
      if(i==n-1 && j==n-1){
          list.add(s);
          //System.out.println(s);
          return;

      }
        if (isValid(arr, vis, i + 1, j, n)) {
            vis[i + 1][j] = true;
            ratInAMaze(arr, vis, list, i + 1, j, n, s + "D");
            vis[i + 1][j] = false;
        }

        if (isValid(arr, vis, i, j - 1, n)) {
            vis[i][j - 1] = true;
            ratInAMaze(arr, vis, list, i, j - 1, n, s + "L");
            vis[i][j - 1] = false;
        }

        if (isValid(arr, vis, i, j + 1, n)) {
            vis[i][j + 1] = true;
            ratInAMaze(arr, vis, list, i, j + 1, n, s + "R");
            vis[i][j + 1] = false;
        }

        if (isValid(arr, vis, i - 1, j, n)) {
            vis[i - 1][j] = true;
            ratInAMaze(arr, vis, list, i - 1, j, n, s + "U");
            vis[i - 1][j] = false;
        }

    }
    static boolean isValid(int[][] mat, boolean[][] vis, int i, int j, int n){
        if(i>=0 && i<n && j>= 0 && j<n && vis[i][j]!=true && mat[i][j]==1)
            return true;
        return false;

    }
}