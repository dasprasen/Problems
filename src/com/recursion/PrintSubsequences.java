package com.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Prasenjit Kumar Das
 */
public class PrintSubsequences {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2));
        ArrayList<Integer> result = new ArrayList<>();
        printSubsequence(0, list, result, list.size());
    }
    public static void printSubsequence(int index, List<Integer> list, List<Integer> result, int n) {
        if(index == n) {
            System.out.println(result);
            return;
        }
        result.add(list.get(index));
        printSubsequence(index+1, list, result, n);
        result.remove(list.get(index));
        printSubsequence(index+1, list, result, n);
    }
}
