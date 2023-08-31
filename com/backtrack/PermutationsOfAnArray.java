package com.backtrack;

import java.util.ArrayList;
import java.util.Iterator;

public class PermutationsOfAnArray {
    public PermutationsOfAnArray() {
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3};
        ArrayList<int[]> ans = new ArrayList();
        permute(a, 0, a.length - 1, ans);
        System.out.println("printing the ans array");
        Iterator var3 = ans.iterator();

        while(var3.hasNext()) {
            int[] arr = (int[])var3.next();
            printArray(arr);
        }

    }

    static void permute(int[] a, int l, int r, ArrayList<int[]> ans) {
        if (l == r) {
            printArray(a);
            int[] b = new int[a.length];

            for(int i = 0; i < a.length; ++i) {
                b[i] = a[i];
            }

            ans.add(b);
        } else {
            for(int i = l; i <= r; ++i) {
                swap(a, i, l);
                permute(a, l + 1, r, ans);
                swap(a, i, l);
            }

        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void printArray(int[] a) {
        int[] var1 = a;
        int var2 = a.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int e = var1[var3];
            System.out.print(e);
        }

        System.out.println();
    }
}
