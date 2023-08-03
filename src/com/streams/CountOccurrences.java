package com.streams;

/**
 * @author Prasenjit Kumar Das
 * Given a string and a character, the task is to make a function which counts the occurrence of the given character in the string using Stream API.
 * Input: str = "geeksforgeeks", c = 'e'
 * Output: 4
 * 'e' appears four times in str.
 *
 * Input: str = "abccdefgaa", c = 'a'
 * Output: 3
 * 'a' appears three times in str.
 */
public class CountOccurrences {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        char c = 'e';
        System.out.println(count(str, c));
    }

    private static long count(String str, char c) {
        return str.chars().filter(ch -> ch == c).count();
    }
}
