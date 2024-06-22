package collectionAndLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class CollectionList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(10);

        list.add(20);
        list.add(30);
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Size of list "+list.size());

        System.out.println(list);
        list.remove(2);

        list.remove(Integer.valueOf(20));
        list.remove(Integer.valueOf(20));

        System.out.println(list.contains(20));


        List<Integer> list2=new LinkedList<>();

        list2.add(100);
        list2.addAll(list);

        System.out.println(list2);

        list.retainAll(list2);

        System.out.println(list);


        Object[] arr=list.toArray();

        for(Object a:arr)
        {
            System.out.print(a+" ");
        }

        System.out.println();
        list.clear();
        System.out.println(list);


    }


}
