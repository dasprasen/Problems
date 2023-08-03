package com.practice.problems;

/**
 * @author Prasenjit Kumar Das
 */
public class ModularExponentiation {
    public static void main(String[] args) {
        System.out.println(modularExponentiation(4, 3, 10));
    }

    public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.
        long ans = 1;
        long num = (int) x;
        while(n > 0){
            if((n&1) == 1){
                ans = (ans * num) % m;
            }
            num = (num * num) % m;
            n = n >> 1;
        }
        return (int) ans;
    }
}
