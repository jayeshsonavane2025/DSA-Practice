package practise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PermuBackTrack {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3};
         ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        permute(arr,0,arr.length-1,ans);
       // Collections.sort(ans);
        System.out.println(ans);


    }
    private static void permute(int[] arr, int l, int r, ArrayList<ArrayList<Integer>> ans) {
        if(l==r){
            ArrayList<Integer> list=new ArrayList<>();

            for (int i = 0; i <arr.length; i++) {
                list.add(arr[i]);

            }
            ans.add(list);
        }
        else{
            for (int i = l; i <=r ; i++) {
                swap(arr,i,r);
                permute(arr,l+1,r,ans);
                swap(arr,i,r);


            }
        }


    }

    private static void swap(int[] arr, int l, int r) {
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }

    private static void printArray(int[] a) {
        for(int i:a){
            System.out.print(i);

        }
        System.out.println();
    }
}
