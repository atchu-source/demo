package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSample {
    public static void main(String[] args) {
        System.out.println("ArrayList");

        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Sedhu");
        nameList.add("Atchu");
        nameList.add("nithya");
        nameList.add("sathya");

        //For each loop syntax
        //for (DataType referenceName : listName)
        // {
        // code to execute
        // }

        for(String name : nameList) {

            System.out.println(name);
        }

        ArrayList<Integer> idList = new ArrayList<>();

        idList.add(1);

        idList.add(0);

        for(Integer id :idList){
            System.out.println(id);
        }
        System.out.println("ddsfgdg");

        ArrayList<Employee> employeList = new ArrayList<>();

        Employee emp = new Employee();

        emp.setEmpId(1);
        emp.setEmployeeName("sedhu");

        employeList.add(emp);

        Employee emp1 = new Employee();

        emp1.setEmpId(2);
        emp1.setEmployeeName("Atchu");

        employeList.add(emp1);

        for (Employee employee : employeList) {
            System.out.println(employee.toString());
        }
    }
}
