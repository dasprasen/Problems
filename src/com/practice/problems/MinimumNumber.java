package com.practice.problems;

import java.util.Arrays;

import static java.lang.String.valueOf;

/**
 * @author Prasenjit Kumar Das
 */
public class MinimumNumber {
    public static void main(String[] args) {
        String s = "846903";
        String result = minimumNumber(s);
        System.out.println(result);
    }

    private static String minimumNumber(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String sortedStr = valueOf(c);
        if(c[0] != '0'){
            return valueOf(c);
        }
        int i = 1;
        while(i < c.length){
            if(c[i] != '0'){
                char temp = c[i];
                c[i] = c[0];
                c[0] = temp;
                //swap(s[i], s[0]);
                return valueOf(c);
            }
            i++;
        }
        return valueOf(c);
    }
}
