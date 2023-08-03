package com.practice.problems;

import java.util.*;

/**
 * @author Prasenjit Kumar Das
 */
public class FrequencySort {
    public static String frequencySort(String s) {
        StringBuilder ans = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        List<Character> chars = new ArrayList(map.keySet());
        Collections.sort(chars, (a, b) -> (map.get(b) - map.get(a)));
        for (Object c : chars) {
            for (int i = 0; i < map.get(c); i++) {
                ans.append(c);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "Aabb";
        System.out.println(frequencySort(s));
    }
}
