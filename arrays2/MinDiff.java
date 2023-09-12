package arrays2;
import java.util.*;
public class MinDiff
{
    public List<List < Integer>> minimumAbsDifference(int[] arr)
    {
        //You can code here
        List<List<Integer>> list=new ArrayList<>();
        int minDiff=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            minDiff=Math.min(minDiff,arr[i]-arr[i-1]);
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==minDiff){
                List<Integer> temp=new ArrayList<>();
                temp.add(arr[i-1]);
                temp.add(arr[i]);
                list.add(temp);
            }
        }
        return list;
    }
}