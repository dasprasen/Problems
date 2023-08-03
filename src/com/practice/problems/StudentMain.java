package com.practice.problems;

/**
 * @author Prasenjit Kumar Das
 */
public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(1, "ram","Bangalore");
        Student s2 = new Student(2, "raman","vellore");
        Student s3 = new Student(1, "tom", "jaipur");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
