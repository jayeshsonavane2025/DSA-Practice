package collectionAndLists;

import java.util.ArrayList;
import java.util.List;

public class LinkedListLearn {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(10);

        list.add(20);
        list.add(30);
        list.add(10);
        list.add(20);

        System.out.println(list.get(0));

        list.set(0,0);
        list.set(0,10);

        System.out.println(list.get(0));

        list.add(2,2);

        list.remove(0);

        System.out.println(list);

        System.out.println(list.indexOf(30));

        System.out.println(list.indexOf(300));

        System.out.println(list.lastIndexOf(20));


    }
}
