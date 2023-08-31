package com.TimeRecusrsion;




public class BigONotations {
    public BigONotations() {
    }

    public static void main(String[] args) {
        int[] a = new int[]{3, 7, 1, 7, 23, 5};
        printAllPairsInAnArray(a);
    }

    static void printAllPairsInAnArray(int[] a) {
        int n = a.length;

        for(int i = 0; i < n; ++i) {
            for(int j = i + 1; j < n; ++j) {
                System.out.println(a[i] + " " + a[j]);
            }
        }

    }

    static int getFirstNumber(int[] a) {
        return a[0];
    }

    static boolean checkIfNumberIsPresent(int[] a, int key) {
        int[] var2 = a;
        int var3 = a.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int element = var2[var4];
            if (element == key) {
                return true;
            }
        }

        return false;
    }
}
