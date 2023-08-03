package com.streams;

import java.util.List;

/**
 * @author Prasenjit Kumar Das
 */
public class Employee {
    private String name;
    private String address;
    private Double salary;
    private List<String> projects;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", projects=" + projects +
                '}';
    }

    public Employee() {
    }

    public Employee(String name, String address, Double salary, List<String> projects) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.projects = projects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
