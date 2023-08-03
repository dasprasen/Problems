package com.practice.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Prasenjit Kumar Das
 */
public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = new int[] {42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442};
        List<Integer> res = getEvenDigitNumbers(arr);
    }

    public static List<Integer> getEvenDigitNumbers (int[] arr) {
        List<Integer> res = new ArrayList<>();
        for(Integer i : arr) {
            String s = i.toString();
            if(s.length() % 2 == 0) {
                res.add(i);
            }
        }
        return res;
    }
}
