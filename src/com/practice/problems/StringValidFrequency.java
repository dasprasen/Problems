package com.practice.problems;

/**
 * @author Prasenjit Kumar Das
 */
public class StringValidFrequency {

    private static final int alpha = 26;

    public static void main(String[] args) {
        String s = "aba";
        if(isStringValid(s)) {
            System.out.println("Valid String..");
        } else {
            System.out.println("Invalid String");
        }
    }

    private static boolean isStringValid(String s) {
        int freq[] = new int[alpha];
        int n=s.length();
        for(int i=0;i<n;i++) {
            freq[getCharIndex(s.charAt(i))]++;
        }
        if(isFreqSame(freq, alpha)) {
            return true;
        }

        for(char c='a';c<='z';c++) {
            int index = getCharIndex(c);
            if(freq[index] > 0){
                freq[index]--;
                if(isFreqSame(freq, alpha)) {
                    return true;
                }
                freq[index]++;
            }
        }
        return false;
    }

    private static boolean isFreqSame(int freq[], int length) {
        int occurrence=0, i;
        for(i=0;i<length;i++) {
            if(freq[i] > 0) {
                occurrence = freq[i];
                break;
            }
        }

        for(int j=i+1;j<length;j++) {
            if(freq[j] > 0 && freq[j] != occurrence) {
                return false;
            }
        }
        return true;
    }

    private static int getCharIndex(char c) {
        return c - 'a';
    }
}
