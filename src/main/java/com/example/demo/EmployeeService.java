package com.example.demo;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService {

    //step1 - ask user to enter employee count
    //step2 - create a for loop to iterate employee count
    //step3 - create a new employee object
    //step4 - ask user to enter employee id, name and salary
    //step5 - set employee id, name and sal ary to employee object
    //step6 - add employee object to employee list

  public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter employee Count");
      int empCount = sc.nextInt();

      ArrayList<Employee> empList = new ArrayList<>();

      for(int i = 0; i < empCount;  i++) {

          System.out.println("Enter employee Id");
          int epmId = sc.nextInt();
          System.out.println("employee name");
          String empName =sc.next();
          System.out.println("Enter employee salary");
          double salary =sc.nextDouble();

          Employee emp = new Employee();

          emp.setEmpId(epmId);
          emp.setEmployeeName(empName);
          emp.setSalary(salary);

          empList.add(emp);
      }

      for(Employee empp:empList) {
          System.out.println( empp.toString());
      }


  }





}
