package com.practice.problems;

import java.util.*;

/**
 * @author Prasenjit Kumar Das
 */
public class MissingAndRepeatingNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6, 4, 3, 5, 5, 1));
        int[] res = missingAndRepeating(list, list.size());
    }

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int sum = (n * (n+1)) / 2,  sumWithoutDuplicate=0;
        int repeatedNumber = 0;
        Set<Integer> set  = new HashSet<>();
        for(int i :arr) {
            if(!set.contains(i)) {
                sumWithoutDuplicate += i;
                set.add(i);
            } else {
                repeatedNumber = i;
            }
        }
        return new int[]{sum - sumWithoutDuplicate, repeatedNumber};
    }
}
