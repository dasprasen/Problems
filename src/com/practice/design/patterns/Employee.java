package com.practice.design.patterns;

/**
 * @author Prasenjit Kumar Das
 */
public class Employee {
    private final int empId;
    private final String empName;
    private final String address;
    private final String phone;
    private final double salary;

    private Employee(EmployeeBuilder employeeBuilder) {
        this.empId = employeeBuilder.empId;
        this.empName = employeeBuilder.empName;
        this.address = employeeBuilder.address;
        this.phone = employeeBuilder.phone;
        this.salary = employeeBuilder.salary;
    }

    public static class EmployeeBuilder {
        private int empId;
        private String empName;
        private String address;
        private String phone;
        private double salary;

        public String getEmployeeName() {
            return empName;
        }

        public EmployeeBuilder setEmpId(int empId) {
            this.empId = empId;
            return this;
        }

        public EmployeeBuilder setEmpName(String empName) {
            this.empName = empName;
            return this;
        }

        public EmployeeBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public EmployeeBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public EmployeeBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }

    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }
}
