package com.practice.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Prasenjit Kumar Das
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 2, 1, 1, 1, 2, 2};
        System.out.println(findMajority(arr, arr.length));
    }

    public static int findMajority(int[] nums, int n) {
        // Write your code here.
        int maxEle = nums[0], count=1;
        for(int i=1;i<nums.length;i++) {
            if(count == 0) {
                count++;
                maxEle = nums[i];
            } else if(maxEle == nums[i]) {
                count++;
            } else
                count--;
        }
        return maxEle;
    }
}
