package com.practice.problems;

import java.util.Arrays;

/**
 * @author Prasenjit Kumar Das
 */
public class NextGreaterElement {
    public static long[] nextLargerElement(long[] arr, int n)
    {
        // Your code here
        long[] res = new long[n];
        int k=0;
        long num=0;
        for(int i=0;i<n;i++) {
            num = -1;
            for(int j=i+1;j<n;j++) {
                if(arr[i] < arr[j]) {
                    num = arr[j];
                    break;
                }
            }
            res[k++] = num;
        }
        return res;
    }

    public static void main(String[] args) {
        long[] arr = new long[] {6, 8, 0, 1, 3};
        int n = arr.length;
        long[] res = nextLargerElement(arr, n);
        Arrays.stream(res).forEach(System.out::println);
    }
}
