package com.practice.problems;

/**
 * @author Prasenjit Kumar Das
 */
public class LargestOddNumberInString {
    public static String largestOddNumber(String num) {
        return f(num, num.length());
    }
    public static String f(String num, int ind) {
        if(ind < 0) {
            return "";
        }
        if(ind>=1 && Long.parseLong(num.substring(0, ind)) % 2 == 1) {
            return num.substring(0, ind);
        }
        return f(num, ind-1);
    }
    public static void main(String[] args) {
        String num = "7542351161";
        System.out.println(largestOddNumber(num));
    }
}
