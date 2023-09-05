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

        System.out.println(list.get(0));

        list.add(2,2);

        System.out.println(list);
    }
}
