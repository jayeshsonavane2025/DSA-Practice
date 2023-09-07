package collectionAndLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorClass {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Radhe");
        list.add("Barsana");
        list.add("Vrindavan");
        list.add("kishori");
        list.add("BrajDham");
        System.out.println(list);
        Iterator<String> s=list.iterator();

        while(s.hasNext()){
            System.out.println(s.next());
        }
    }
}
