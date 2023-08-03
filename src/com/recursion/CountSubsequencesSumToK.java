package com.recursion;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Prasenjit Kumar Das
 */
public class CountSubsequencesSumToK {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3));
        int sum = 2, n= list.size();
        System.out.println(printSubsequences(0, 0, sum, list, n));
    }

    private static int printSubsequences(int i, int s, int sum, ArrayList<Integer> list, int n) {
        if(i==n){
            if(s == sum) {
                return 1;
            }
            return 0;
        }
        s += list.get(i);
        int l = printSubsequences(i+1, s, sum, list, n);

        s -= list.get(i);
        int r = printSubsequences(i+1, s, sum, list, n);

        return l+r;
    }
}
