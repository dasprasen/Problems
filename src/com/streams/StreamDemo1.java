package com.streams;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Prasenjit Kumar Das
 */
public class StreamDemo1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6,7,8,9);
        List<Integer> evenList = new ArrayList<>();

        //without stream
        for(Integer i : list) {
            if(i%2 == 0) {
                evenList.add(i);
            }
        }
        System.out.println(list);
        System.out.println("Without Stream: " + evenList);

        //with stream
        List<Integer> newEvenList = list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.println("With Stream: " + newEvenList);


        List<String> names = Arrays.asList("Apple", "Annie", "Gopal", "Prasen");
        List<String> newNames = names.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);

        Optional<HashMap<String, Employee>> optionalHashMap = Optional.empty();
        HashMap<String, Employee> employeeHashMap = null;
        optionalHashMap = Optional.ofNullable(employeeHashMap);
        System.out.println(optionalHashMap);
    }
}
