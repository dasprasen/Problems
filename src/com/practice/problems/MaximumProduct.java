package com.practice.problems;

import java.util.Arrays;

/**
 * @author Prasenjit Kumar Das
 */
public class MaximumProduct {
    public static void main(String[] args) {
        int[] arr = {-10, 3, 7, 5, -8, 2};
        Arrays.sort(arr);
        int maxProduct1 = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3] * arr[arr.length - 4];
        int maxProduct2 = arr[0] * arr[1] * arr[arr.length - 2] * arr[arr.length - 1];
        int maxProduct = Math.max(maxProduct1, maxProduct2);
        System.out.println(maxProduct);

    }
}
