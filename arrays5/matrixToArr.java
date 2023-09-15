package arrays5;

public class matrixToArr {
    public static void main(String[] args) {
        int[][]a={{1,2,3,4},{5,6,7,8}};
        int n=a.length;
        int m=a[0].length;

        int[] arr=new int[n*m];
        int c=0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                arr[c++]=a[i][j];
            }

        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
