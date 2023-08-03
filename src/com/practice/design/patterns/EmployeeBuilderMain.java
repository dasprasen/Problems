package com.practice.design.patterns;

/**
 * @author Prasenjit Kumar Das
 */
public class EmployeeBuilderMain {
    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder().setEmpId(1).setEmpName("ram").build();
        System.out.println(employee.getEmpId()+" "+employee.getEmpName());

        Employee employee1 = new Employee.EmployeeBuilder().setEmpId(2).setAddress("bangalore").build();
        System.out.println(employee1.getEmpId()+" "+employee1.getAddress());


    }
}
