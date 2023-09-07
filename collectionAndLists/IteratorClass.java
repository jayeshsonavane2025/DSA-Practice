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
        List<String> subslist=new ArrayList<>();

        try{
              subslist=list.subList(1,9);
        }catch ( IndexOutOfBoundsException e){
            System.out.println("Array index exceed");
        }

        for (String sub:subslist) {
            System.out.println(sub);
        }
        System.out.println("RadhaMadhav");

    }
}
