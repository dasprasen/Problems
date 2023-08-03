package com.recursion;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Prasenjit Kumar Das
 */
public class PrintFirstSubsequencesSumtoK {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3));
        int sum = 2, n= list.size();
        ArrayList<Integer> result = new ArrayList<>();
        printSubsequences(0, result, 0, sum, list, n);
    }

    private static boolean printSubsequences(int i, ArrayList<Integer> result, int s, int sum, ArrayList<Integer> list, int n) {
        if(i==n){
            if(s == sum) {
                System.out.println(result);
                return true;
            } else {
                return false;
            }
        }
        result.add(list.get(i));
        s += list.get(i);
        if(printSubsequences(i+1, result, s, sum, list, n)) {
            return true;
        }

        s -= list.get(i);
        result.remove(list.get(i));
        if(printSubsequences(i+1, result, s, sum, list, n)) {
            return true;
        }
        return false;
    }
}
