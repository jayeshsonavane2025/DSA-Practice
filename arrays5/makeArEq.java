package arrays5;


import  java.util.*;
public class makeArEq {





        public static void main(String[] args) {
            int[][] a = new int[][]{{4, 4, 10, 12, 18, 110, 1000}};
            int k = 2;
            System.out.println(makeMatrixEqual(a, k));
        }

        static int makeMatrixEqual(int[][] a, int k) {
            int n = a.length;
            if (n == 0) {
                return 0;
            } else {
                int m = a[0].length;
                int total = n * m;
                int[] b = new int[total];

                int median;
                int i;
                for(median = 0; median < n; ++median) {
                    for(i = 0; i < m; ++i) {
                        b[median * m + i] = a[median][i];
                    }
                }

                Arrays.sort(b);
                median = b[total / 2];

                for(i = 0; i < total; ++i) {
                    System.out.println("" + i + " " + b[i] + " " + makeMatrixEqualHelper(b, b[i], k));
                }

                return makeMatrixEqualHelper(b, median, k);
            }
        }

        static int makeMatrixEqualHelper(int[] b, int m, int k) {
            int count = 0;

            for(int i = 0; i < b.length; ++i) {
                count += Math.abs(b[i] - m) / k;
            }

            return count;
        }
    }

}
