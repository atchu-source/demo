package com.example.demo;

public class Employee {

    private int empId;
    private String employeeName;
    private double salary;

    public int getEmpId() {
        return this.empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmployeeName(){
        return this.employeeName;
    }
    public void setEmployeeName(String employeeName ){
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", empId=" + empId +
                ", salary=" + salary +
                '}';
    }
}

