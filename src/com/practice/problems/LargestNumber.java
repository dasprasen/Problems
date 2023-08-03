package com.practice.problems;

/**
 * @author Prasenjit Kumar Das
 */
public class LargestNumber {
    public static void main(String[] args) {
        int num1 = 40;
        int num2 = 50;
        int num3 = 20;
        int result = maxOfThree(num1, num2, num3);
        System.out.println(result);
    }

    private static int maxOfThree(int num1, int num2, int num3) {
        int greatest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        return greatest;
    }
}
