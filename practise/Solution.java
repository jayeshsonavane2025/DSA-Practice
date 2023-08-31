package practise;

import java.util.*;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        //You can code here
        List<List<Integer>> ans=new ArrayList<>();
        permute(nums,0,nums.length-1,ans);

        Collections.sort(ans,  new LexicographicalListComparator());

        return ans;


    }
    private static void permute(int[] arr, int l, int r,  List<List<Integer>> ans) {
        if(l==r){
            List<Integer> list=new ArrayList<>();

            for (int i = 0; i <arr.length; i++) {
                list.add(arr[i]);

            }
            ans.add(list);
        }
        else{
            for (int i = l; i <=r ; i++) {
                swap(arr,i,l);
                permute(arr,l+1,r,ans);
                swap(arr,i,l);


            }
        }


    }

    private static void swap(int[] arr, int l, int r) {
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }

}

class LexicographicalListComparator implements Comparator<List<Integer>> {
    @Override
    public int compare(List<Integer> list1, List<Integer> list2) {
        int size = Math.min(list1.size(), list2.size());
        for (int i = 0; i < size; i++) {
            int cmp = list1.get(i).compareTo(list2.get(i));
            if (cmp != 0) {
                return cmp;
            }
        }
        return Integer.compare(list1.size(), list2.size());
    }
}