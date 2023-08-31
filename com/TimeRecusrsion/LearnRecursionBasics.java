package com.TimeRecusrsion;

public class LearnRecursionBasics {
    public LearnRecursionBasics() {
    }

    public static void main(String[] args) {
        System.out.println(fibOfN(8));
    }

    static int sumOfN(int n) {
        return n == 1 ? 1 : sumOfN(n - 1) + n;
    }

    static int fibOfN(int n) {
        return n <= 1 ? n : fibOfN(n - 1) + fibOfN(n - 2);
    }

    static void fun(int n) {
        if (n > 0) {
            System.out.println(n);
            fun(n - 1);
        }

    }

    static void foo(int n) {
        if (n > 0) {
            foo(n - 1);
            System.out.println(n);
        }

    }

    static void bar(int n) {
        if (n > 0) {
            System.out.println(n);
            bar(n - 1);
            bar(n - 1);
        }

    }
}
