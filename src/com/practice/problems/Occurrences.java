package com.practice.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Prasenjit Kumar Das
 * Print the first occurrence of the character and count of repeated character by ignoring the case in the given string.
 */
public class Occurrences {

    private static int value;

    public static void main(String[] args) {

        System.out.println("value" + value);
        String s = "AgReEmrEnT";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++) {
            if(map.containsKey(Character.toLowerCase(s.charAt(i))) || map.containsKey(Character.toUpperCase(s.charAt(i)))) {
                if((Character.isLowerCase(s.charAt(i)) && map.containsKey(s.charAt(i))) || (Character.isUpperCase(s.charAt(i)) && map.containsKey(s.charAt(i)))) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                } else if(Character.isLowerCase(s.charAt(i))) {
                    map.put(Character.toUpperCase(s.charAt(i)), map.get(Character.toUpperCase(s.charAt(i))) + 1);
                } else {
                    map.put(Character.toLowerCase(s.charAt(i)), map.get(Character.toLowerCase(s.charAt(i))) + 1);
                }
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        StringBuilder result= new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }
        System.out.println(result);
    }
}
