package backtrackingLIVEAndDoubts;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsequenceProblems {

    public static void main(String[] args) {

//        int a[] = {8, 1, 3, 7, 2, 1, 5};
//        int sum = 12;
//        int a[] = {4, 6, 4, 4};
        int a[] = {1, 1, 1, 1};
        int sum = 2;
        Arrays.sort(a);
//        ArrayList<ArrayList<Integer>> ans = subsequences(a);

        ArrayList<ArrayList<Integer>> ans = combinationSum(a, sum);

        for(ArrayList<Integer> list: ans) {
            System.out.println(list);
        }
    }

    public static ArrayList<ArrayList<Integer>> combinationSum(int a[], int sum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        helperCombinationSum(a, ans, 0, sum, new ArrayList<>());

        return ans;
    }

    private static void helperCombinationSum(int[] a, ArrayList<ArrayList<Integer>> ans,
                                             int index, int sum, ArrayList<Integer> cur) {

        if(sum == 0) {
            ArrayList<Integer> curCopy = new ArrayList<>(cur);
            ans.add(curCopy);
            return;
        }

        for(int i = index; i<a.length; i++) {
            if(a[i] > sum) return;
            if(i > index && a[i] == a[i-1]) continue;

            cur.add(a[i]);
            helperCombinationSum(a, ans, i+1, sum-a[i], cur);
            cur.remove(cur.size()-1); // backtracking
        }

    }


    static ArrayList<ArrayList<Integer>> subsequences(int a[]) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        helperSubsequence(a, ans, 0, new ArrayList<>());

        return ans;
    }

    static void helperSubsequence(int a[], ArrayList<ArrayList<Integer>> ans,
                                  int index, ArrayList<Integer> cur) {

        ArrayList<Integer> curCopy = new ArrayList<>(cur);
        ans.add(curCopy);

        for(int i = index; i<a.length; i++) {

            if(i > index && a[i] == a[i-1]) continue;

            cur.add(a[i]);
            helperSubsequence(a, ans, i+1, cur);
            cur.remove(cur.size()-1); //backtrack
        }

    }


}










