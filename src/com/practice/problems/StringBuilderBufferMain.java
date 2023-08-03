package com.practice.problems;

/**
 * @author Prasenjit Kumar Das
 */
public class StringBuilderBufferMain {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3="apple";
        String s4="apple";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);

        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);
        //System.out.println(s3 == null);
        //System.out.println(null.equals(s3));



    }
}
