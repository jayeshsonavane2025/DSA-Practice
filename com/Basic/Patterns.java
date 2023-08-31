package loopsPattern;

public class Patterns {

    public static void main(String[] args) {

        int n = 5;
        int m = 6;

        /*// pattern 1
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*// Pattern 2
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*// Pattern 3
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

        /*//Pattern 4 and 5, to make 4, remove space
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        for(int i = 0; i<n; i++) {
            for(int j = 1; j<n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j = 0; j<=2*i-1; j++) {
                if(j == 2*i-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = n-2; i>=0; i--) {
            for(int j = 1; j<n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j = 0; j<=2*i-1; j++) {
                if(j == 2*i-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }




    }

}


//  *1
// **2
//***3














