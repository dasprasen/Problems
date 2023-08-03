package com.practice.compare;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

/**
 * @author Prasenjit Kumar Das
 */
public class Student {
    public int id;
    private String name;
    private LocalDate dob;

    public Student() {
    }

    public Student(int id, String name, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if( o instanceof Student) {
            Student student = (Student) o;
            return student.id == id;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}
