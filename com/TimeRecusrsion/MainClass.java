package recursionLIVEAndDoubts;

public class MainClass {
    public static void main(String[] args) {

        double a = 7;
        int b = 7;
        int m = 30;

//        System.out.println(power(a, b));
//        System.out.println(fastPower(a, b, m));

        System.out.println(matrixPaths(2, 2));
    }

    static double fastPower(double a, int b, int m) {
        if(b == 0) return 1;

        if(b < 0) return fastPower(1/a, Math.abs(b), m);

        if(b % 2 == 0) {
            return fastPower((a%m*a%m)%m , b/2, m);
        } else {
            return (a % m * fastPower(a, b-1, m) % m) % m;
        }
    }

    static double fastPower(double a, int b) {
        if(b == 0) return 1;

        if(b < 0) return fastPower(1/a, Math.abs(b));

        if(b % 2 == 0) {
            return fastPower(a*a , b/2);
        } else {
            return (a * fastPower(a, b-1));
        }
    }

    static double power(double a, double b) {
        if(b == 0) return 1;

        return a * power(a, b-1);
    }

    static int matrixPaths(int n, int m) {
        if(n == 1 || m == 1) return 1;

        return matrixPaths(n-1, m) + matrixPaths(n, m-1);
    }



}
