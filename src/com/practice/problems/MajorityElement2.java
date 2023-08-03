package com.practice.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Prasenjit Kumar Das
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 */
public class MajorityElement2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(7);
        a.add(4);
        a.add(4);
        a.add(9);
        a.add(7);
        ArrayList<Integer> res = majorityElementII(a);
        System.out.println(res);
    }

    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr)
    {
        // Write your code here.
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        ArrayList<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > arr.size()/3) {
                res.add(entry.getKey());
            }
        }
        return res;
    }
}
