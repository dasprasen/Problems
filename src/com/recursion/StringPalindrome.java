package com.recursion;

import java.util.Stack;

/**
 * @author Prasenjit Kumar Das
 */
public class StringPalindrome {
    public static void main(String[] args) {
        String s = "madam";
        boolean status = palindrome(s, 0);
        if(status) {
            System.out.println("Palindrome...");
        } else {
            System.out.println("Not Palindrome...");
        }
    }

    private static boolean palindrome(String s, int i) {
        if(i>=s.length()/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }
        return palindrome(s, i+1);
    }
}
