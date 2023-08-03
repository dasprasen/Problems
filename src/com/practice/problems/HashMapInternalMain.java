package com.practice.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Prasenjit Kumar Das
 */
public class HashMapInternalMain {
    public static void main(String[] args) {

        Map<String, String> map1 = new HashMap<>();
        map1.put("a","");
        System.out.println(map1.values().isEmpty());


        Map<String, Integer> map = new HashMap<>();
        map.put("apple",1);
        map.put("mango",2);
        map.put("guava",3);
        map.put("banana",4);
        map.put("orange",5);
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);
        map.put("f",1);
        map.put("g",2);
        map.put("h",3);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry entry = iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        int[] array = new int[]{2,4,1};
        System.out.println(Arrays.stream(array).findFirst());
        System.out.println(Arrays.stream(array).min());
        System.out.println(Arrays.stream(array).max());
        System.out.println(Arrays.stream(array).average());

//        Iterator<String> iterator = map.keySet().iterator();
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

//        for(Map.Entry<String, Integer> e : map.entrySet()){
//            System.out.println(e.getKey()+ " " +e.getValue());
//        }

        //map.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
