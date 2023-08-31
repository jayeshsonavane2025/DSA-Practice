package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class checkToArrayEqual {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8};
        int[] b={8,7,6,5,4,3,2,1};
        boolean flag=checkToArrayEqualHashMap(a,b);
        if(flag)
            System.out.println("Arrays are equal");
        else
            System.out.println("Arrays not equal");
    }
    public static boolean checkToArrayEqualHashMap(int[] a,int[] b){
        if(a.length!= b.length)
            return false;
        //creating hashmap;
        HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> map2=new HashMap<Integer,Integer>();

        // get(Object key) :will return value associated with key
        for(int i:a){
            if(map1.get(i) != null ){
                map1.put(i,map1.get(i)+1);

            }
            else {
                map1.put(i,1);
            }
        }
        for(int i:a){
            if(map2.get(i) != null ){
                map2.put(i,map2.get(i)+1);

            }
            else {
                map2.put(i,1);
            }
        }
        //interating hashmap

        for(Map.Entry<Integer,Integer> i:map1.entrySet()){
             if(map2.get(i.getKey()) != i.getValue())
                 return false;

        }

        //alternating logic

//        for (Map.Entry<Long, Integer> entry : map1.entrySet()) {
//            if (!map2.containsKey(entry.getKey()) || map2.get(entry.getKey()) != entry.getValue()) {
//                return false;
//            }
//        }

        return true;


    }
}
