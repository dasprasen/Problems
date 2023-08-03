package com.practice.problems;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Prasenjit Kumar Das
 */
public class UniqueElement {

    public static int findUnique(ArrayList<Integer> arr, int low, int high) {
        // Base case
        if (low >= high) {
            return -1;
        }

        // Find middle index
        int mid = low + (high - low) / 2;

        // If the element at mid is not equal to the element at mid-1 or mid+1, return the element at mid
        if ((mid == 0 || arr.get(mid) != arr.get(mid - 1)) && (mid == arr.size() - 1 || arr.get(mid) != arr.get(mid + 1))) {
            return arr.get(mid);
        }

        // If the element at mid is equal to the element at mid-1, recursively call findUnique(arr, low, mid-1)
        if (mid > 0 && arr.get(mid) == arr.get(mid - 1)) {
            return findUnique(arr, low, mid - 1);
        }

        // If the element at mid is equal to the element at mid+1, recursively call findUnique(arr, mid+1, high)
        return findUnique(arr, mid + 1, high);
    }

    public static void main(String[] args) {
        ArrayList<Integer>[] testCases = new ArrayList[]{
                new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 4, 4, 5, 5)),
                new ArrayList<>(Arrays.asList(2, 2, 4, 4, 5, 7, 7)),
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9))
        };

        for (ArrayList<Integer> arr : testCases) {
            int unique = findUnique(arr, 0, arr.size() - 1);
            System.out.println("Unique element in the array: " + unique);
        }
    }
}

