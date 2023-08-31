package com.Basic;// Source code is decompiled from a .class file using FernFlower decompiler.
//package basicArrayAndSortingAlgorithms;

public class BasicArrayProblems {
    public BasicArrayProblems() {
    }

    public static void main(String[] args) {
        int[] a = new int[] { 2, 5, 6, 8, 9, 1 };
        lastNumberInSortedPosition(a);
        int[] var2 = a;
        int var3 = a.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            int e = var2[var4];
            System.out.print("" + e + " ");
        }

    }

    static void lastNumberInSortedPosition(int[] a) {
        int n = a.length;
        int last = a[n - 1];

        int swapIndex;
        for (swapIndex = n - 2; swapIndex >= 0 && a[swapIndex] > last; --swapIndex) {
        }

        for (int i = n - 1; i >= swapIndex + 2; --i) {
            a[i] = a[i - 1];
        }

        a[swapIndex + 1] = last;
    }
}
