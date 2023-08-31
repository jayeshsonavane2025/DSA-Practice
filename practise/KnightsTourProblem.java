package practise;
public class KnightsTourProblem {
    public static void main(String[] args) {
        knightTour(5,5);

    }


    public static int[][] knightTour(int n, int m) {
        //You can code here
        int[][]a=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                a[i][j]=-1;

            }

        }
        a[0][0]=0;

        int[] movesX = new int[]{2, 1, -1, -2, -2, -1, 1, 2};
        int[] movesY = new int[]{1, 2, 2, 1, -1, -2, -2, -1};
        knightTourHelper(a,n,m,movesX,movesY,0,0,1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.println(a[i][j]+" ");

            }

        }

        return a;
    }

    private static boolean knightTourHelper(int[][] a, int n, int m, int[] movesX, int[] movesY, int currX, int currY, int step) {
        if(step==n*n){
            return true;
        }
        else{
            for (int i = 0; i < 8; i++) {

                int nextX=currX+movesX[i];
                int nextY=currY+movesY[i];
                if(isValid(a,n,m,nextX,nextY)){
                    a[nextX][nextY]=step;
                    boolean isPossibleNex=knightTourHelper(a,n,m,movesX,movesY,nextX,nextY,step+1);
                    if(isPossibleNex){
                        return true;
                    }
                    a[nextX][nextY]=-1;

                }



            }
            return false;
        }

    }

    private static boolean isValid(int[][] a, int n, int m, int currX, int currY) {
        return currX>=0 && currY>=0 && currY<m && currX<n && a[currX][currY]==-1;
    }

}



//public class KnightsTourProblem {
//    public static void main(String[] args) {
//        int v=5;
//        int[][]a=knightsTours(v);
//        for (int i = 0; i < v; i++) {
//            for (int j = 0; j < v; j++) {
//                System.out.print(a[i][j]+" ");
//
//            }
//            System.out.println();
//
//        }
//    }
//
//    private static int[][] knightsTours(int n) {
//        int[][]a=new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j]=-1;
//            }
//        }
//        a[0][0]=0;
//        int[] movesX = new int[]{2, 1, -1, -2, -2, -1, 1, 2};
//        int[] movesY = new int[]{1, 2, 2, 1, -1, -2, -2, -1};
//        knightsTourHelper(n, a, movesX, movesY, 0, 0, 1);
//        return a;
//
//
//
//    }
//    static boolean knightsTourHelper(int n, int[][] a, int[] movesX, int[] movesY, int curX, int curY, int step) {
//        if (step == n * n) {
//            return true;
//        } else {
//            for(int i = 0; i < 8; ++i) {
//                int nextX = curX + movesX[i];
//                int nextY = curY + movesY[i];
//                if (isValid(n, a, nextX, nextY)) {
//                    a[nextX][nextY] = step;
//                    boolean isTourCompletedByGoingThere = knightsTourHelper(n, a, movesX, movesY, nextX, nextY, step + 1);
//                    if (isTourCompletedByGoingThere) {
//                        return true;
//                    }
//
//                    a[nextX][nextY] = -1;
//                }
//            }
//
//            return false;
//        }
//    }
//
//    static boolean isValid(int n, int[][] a, int x, int y) {
//        return x >= 0 && y >= 0 && x < n && y < n && a[x][y] == -1;
//    }
//}
