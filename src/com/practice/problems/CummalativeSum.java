package com.practice.problems;

/**
 * @author Prasenjit Kumar Das
 */
public class CummalativeSum {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, 5, 7, 9};
        int[] res = getCumulativeSum(arr);
        for(int i : res) {
            System.out.println(i);
        }
    }
    public static int[] getCumulativeSum (int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        res[0] = arr[0];
        for(int i=1;i<n;i++) {
            int sum = 0;
            for(int j=0;j<=i;j++) {
                sum += arr[j];
            }
            res[i] = sum;
        }
        return res;
    }
}
