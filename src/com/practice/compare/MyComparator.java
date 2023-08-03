package com.practice.compare;

import java.util.Comparator;

/**
 * @author Prasenjit Kumar Das
 */
public class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId() - o2.getId();
    }
}
