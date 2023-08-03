package com.practice.problems;

/**
 * @author Prasenjit Kumar Das
 */
public class ReverseWordsInAString {
    public static void main(String[] args) {
        String str = "   I am   a    star";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        //Write your code here
        String convertedStr = str.replaceAll("\\s+"," ").trim();
        String[] res = convertedStr.split(" ");
        String ans = "";
        int i;
        for(i=res.length-1;i>0;i--) {
            ans+= res[i] + " ";
        }
        ans += res[i];
        return ans;
    }
}
