package com.practice.problems;

/**
 * @author Prasenjit Kumar Das
 */
public class TotalDecodingMessages {
    static long num=1000000007;
    public static void main(String[] args) {
        String s = "1411511110191111101011871111111111111511374411510811111311124711511116468111611111116111111111117";
        Long[] memo = new Long[s.length() + 1];
        System.out.println(numDecodings(s, 0, memo));
    }

    private static long numDecodings(String s, int index, Long[] memo) {
        if (index == s.length()) {
            return 1;
        }
        if (s.charAt(index) == '0') {
            return 0;
        }
        if (memo[index] != null) {
            return memo[index];
        }
        long way1 = numDecodings(s, index + 1, memo);
        long way2 = 0;
        if (index < s.length() - 1 && Long.parseLong(s.substring(index, index + 2)) <= 26) {
            way2 = numDecodings(s, index + 2, memo);
        }
        memo[index] = (way1 + way2)%num;
        return memo[index];
    }

}
