package com.practice.problems;

import java.util.*;

/**
 * @author Prasenjit Kumar Das
 */
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = new int[] {100, 4, 200, 1, 3, 2, 4};
        Set<Integer> set = new HashSet<>();
        for(int i : nums) {
            set.add(i);
        }
        int longestStreak = 0;
        for(int num : nums) {
            if(!set.contains(num-1)) {
                int currentNum = num;
                int currentStreak = 1;
                while(set.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        System.out.println(longestStreak);
    }
}
