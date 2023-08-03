package com.practice.problems;

import java.util.Date;

/**
 * @author Prasenjit Kumar Das
 */
public class PrintPalindromeSubstring {
    public static void main(String[] args) {
        String s = "aadbcc";
        System.out.println(longestPalinSubstring(s));
    }

    public static String longestPalinSubstring(String s1) {
        int n = s1.length();
        boolean dp[][] = new boolean[n][n];
        int maxLength = 1;
        int start = n-1;
        boolean flag = false;
        for (int i = 0; i < n; ++i)
            dp[i][i] = true;

        for (int i = 0; i < n - 1; ++i) {
            if (s1.charAt(i) == s1.charAt(i + 1)) {
                flag = true;
                dp[i][i + 1] = true;
                if(maxLength == 2) {
                    start = Math.min(start, i);
                } else {
                    maxLength = 2;
                    start = i;
                }
            }
        }

        if(!flag) {
            start=0;
        }

        for (int k = 3; k <= n; ++k) {
            for (int i = 0; i < n - k + 1; ++i) {
                int j = i + k - 1;
                if (dp[i + 1][j - 1] && s1.charAt(i) == s1.charAt(j)) {
                    dp[i][j] = true;
                    if (k > maxLength) {
                        maxLength = k;
                        start = i;
                    }
                }
            }
        }
        return s1.substring(start, start + maxLength);
    }
}
