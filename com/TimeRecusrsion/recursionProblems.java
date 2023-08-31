package com.TimeRecusrsion;

public class recursionProblems {
    public recursionProblems() {
    }

    public static void main(String[] args) {
        System.out.println(josephus(6, 4));
    }

    static int josephus(int n, int k) {
        return n == 1 ? 0 : (josephus(n - 1, k) + k) % n;
    }

    static int nCr(int n, int r) {
        return n != r && r != 0 ? nCr(n - 1, r - 1) + nCr(n - 1, r) : 1;
    }
}
