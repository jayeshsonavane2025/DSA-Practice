package collectionFrameworkLIVE;

import java.util.*;

public class LearnMaps {
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();

        map.put("us", "United States");
        map.put("in", "India");
        map.put("en", "India");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for(Map.Entry<String, String> entry: entries) {
            System.out.println(entry.getKey() +", "+entry.getValue());
        }

        Set<String> keys = map.keySet();

        for(String key: keys) {
            System.out.println("key "+key);
        }

//        ArrayList<String> keys = new ArrayList<>(map.keySet());
//
//        Collection<String> values = map.values();
//
//        System.out.println(values);

//        System.out.println(keys);


//        map.remove("us", "USA");
//
//        System.out.println(map.containsKey("pn"));
//        System.out.println("contains value: "+ map.containsValue("Indian"));
//
//        System.out.println(map);
//
//        System.out.println(map.get("pn"));
//        System.out.println(map.getOrDefault("pn", "Others"));

    }
}
