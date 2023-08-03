package com.practice.problems;

/**
 * @author Prasenjit Kumar Das
 */
public class FindReplace {
    public static void main(String[] args) {
        String s = "peterjppeter";
        String to_find = "peter";
        String to_replace = "sam";
        String resultantString = replaceWithFind(s, to_find, to_replace);
        System.out.println(resultantString);
    }

    private static String replaceWithFind(String s, String to_find, String to_replace) {
        String temp = "";
        String replacedString = "";
        int remainingString = 0;
        for (int i = 0; i <= s.length() - to_find.length(); i++) {
            temp = s.substring(i, i + 1);

            if (s.substring(i, i + to_find.length()).equals(to_find)) {
                temp = to_replace;
                i += to_find.length() - 1;

            }
            remainingString = i;
            replacedString += temp;

        }
        replacedString += s.substring(remainingString + 1, s.length());

        return replacedString;
    }
}
