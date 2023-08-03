package com.practice.compare;

import java.time.LocalDate;
import java.util.*;

/**
 * @author Prasenjit Kumar Das
 */
public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(1, "prasen", LocalDate.of(2020, 9, 4));
        Student s2 = new Student(5, "rohan", LocalDate.of(2019, 5, 4));
        Student s3 = new Student(2, "mayank", LocalDate.of(1995, 3, 4));
        Student s4 = new Student(1, "john", LocalDate.of(1998, 12, 4));

//        List<Student> list = new ArrayList<>();
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);

        Set<Student> list = new HashSet<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println(list.size());
        s1.id = 3;
        System.out.println(list.size());
        //Collections.sort(list, new MyComparator());
        //System.out.println(list);
    }
}
