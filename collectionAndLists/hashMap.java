package collectionAndLists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        List<List<String>> list=new ArrayList<>();
        list=List.of(List.of("krishna","mohan"),List.of("Ram","JanakiVallbh"));
        Map<Integer,String> map=new HashMap<>();

        System.out.println(list);

        Map<Integer,String> map1=new HashMap<>();

        map.put(1,"Krishna");
        map.put(4,"Radhe");
        map.put(3,"Radha Raman");
        map.put(6,"RadhRaman");

        System.out.println(map.isEmpty());
        System.out.println(map.containsValue("Krishna"));
        System.out.println(map.containsKey(1));

        map1.putAll(map);
        System.out.println(map1);

        System.out.println(map);

    }
}
