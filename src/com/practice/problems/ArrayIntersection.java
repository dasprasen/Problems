package com.practice.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Prasenjit Kumar Das
 */
public class ArrayIntersection {
    public static void main(String[] args) {
        int[] A = new int[] {1, 3, 4, 5, 5, 6, 6, 7};
        int[] B = new int[] {2, 5, 6, 6, 7, 8};
        List<Integer> res = intersection(A, B);
        System.out.println(res);
    }

    public static List<Integer> intersection (int[] A, int[] B) {
        List<Integer> res = new ArrayList<>();
        int pointer1 = 0, pointer2 = 0;
        while(pointer1 < A.length && pointer2 < B.length) {
            if(A[pointer1] == B[pointer2]) {
                res.add(A[pointer1]);
                pointer1++;
                pointer2++;
            } else if(A[pointer1] < B[pointer2]) {
                pointer1++;
            } else {
                pointer2++;
            }
        }
        return res;
    }
}
