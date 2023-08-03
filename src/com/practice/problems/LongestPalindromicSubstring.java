package com.practice.problems;

import java.util.Arrays;

/**
 * @author Prasenjit Kumar Das
 * Given a string s, return the longest palindromic substring in s.
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 */
public class LongestPalindromicSubstring {

    public static String longestPalin(String s1){
        // code here
        String s2 = new StringBuilder(s1).reverse().toString();
        int m= s1.length(), n=s2.length();
        int max = 0;
        int endIndex = m;
        int[][] dp = new int[m+1][n+1];
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=n; j++) {
                if (s1.charAt(i-1)==s2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];

                    if (dp[i][j] > max) {
                        max = dp[i][j];
                        endIndex = i;
                    }
                }
            }
        }

        return s1.substring(endIndex - max, endIndex);

//        int len=dp[m][n];
//        int i=n;
//        int j=m;
//
//        int index = len-1;
//        String str="";
//        for(int k=1; k<=len;k++){
//            str +="$";
//        }
//        StringBuilder ss= new StringBuilder(s1);
//        StringBuilder str2=new StringBuilder(str);
//        while(i>0 && j>0) {
//            if(ss.charAt(i-1) == s2.charAt(j-1)) {
//                str2.setCharAt(index,s2.charAt(i-1));
//                index--;
//                i--;
//                j--;
//            } else if(ss.charAt(i-1) > s2.charAt(j-1)) {
//                i--;
//            } else {
//                j--;
//            }
//        }
//        return str2.toString();
    }

    public static void main(String[] args) {
        String s = "zzzzzzzzzzzzzzzzzzzzzzwwwwwwwwwwwwwwwwwyyyyyyyyyyyyyyyyyyydddddddddddddddddddddddddddddddddddddddddd";
        String res = longestPalin(s);
        System.out.println(res);
    }
}
