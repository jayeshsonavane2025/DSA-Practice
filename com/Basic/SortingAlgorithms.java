package com.Basic;// Source code is decompiled from a .class file using FernFlower decompiler.
//package basicArrayAndSortingAlgorithms;

public class SortingAlgorithms {
    public SortingAlgorithms() {
    }

    public static void main(String[] args) {
        int[] a = new int[] { 9, 5, 3, 1, 2 };
        insertionSort(a);
        int[] var2 = a;
        int var3 = a.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            int e = var2[var4];
            System.out.print("" + e + " ");
        }

    }

    static void insertionSort(int[] a) {
        int n = a.length;

        for (int i = 1; i < n; ++i) {
            int last = a[i];

            int swapIndex;
            for (swapIndex = i - 1; swapIndex >= 0 && a[swapIndex] > last; --swapIndex) {
            }

            for (int j = i; j > swapIndex + 1; --j) {
                a[j] = a[j - 1];
            }

            a[swapIndex + 1] = last;
        }

    }

    static void selectionSort(int[] a) {
        int n = a.length;

        for (int i = 0; i < n - 1; ++i) {
            int min = i;

            int j;
            for (j = i + 1; j < n; ++j) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            j = a[min];
            a[min] = a[i];
            a[i] = j;
        }

    }

    static void bubbleSort(int[] a) {
        int n = a.length;

        for (int i = 0; i < n - 1; ++i) {
            boolean didISwap = false;

            for (int j = 0; j < n - i - 1; ++j) {
                if (a[j + 1] < a[j]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    didISwap = true;
                }
            }

            if (!didISwap) {
                break;
            }
        }

    }
}

