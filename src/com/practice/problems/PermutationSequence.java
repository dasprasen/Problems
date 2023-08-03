package com.practice.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Prasenjit Kumar Das
 */
public class PermutationSequence {
    public static void main(String[] args) {
        String res = getPermutation(3, 3);
        System.out.println(res);
    }

    public static String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> nums = new ArrayList();
        for(int i=1; i<n; i++){
            nums.add(i);
            fact *= i;
        }
        nums.add(n);
        String res = "";
        k--;
        while(true){
            res += nums.get(k/fact);
            nums.remove(k/fact);
            if(nums.size()==0){
                break;
            }
            k = k%fact;
            fact = fact/nums.size();
        }
        return res;
    }
}
