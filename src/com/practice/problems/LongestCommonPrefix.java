package com.practice.problems;

import java.util.Arrays;

/**
 * @author Prasenjit Kumar Das
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        int n=4;
        String[] arr = new String[] {"geeksforgeeks", "geeks", "geek", "geezer"};
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length - 1];
        int c=0;
        while (c < first.length()) {
            if(first.charAt(c) == last.charAt(c))
                c++;
            else
                break;
        }
        if(c == 0)
            System.out.println("-1");
        else
            System.out.println(first.substring(0, c));
    }
}
