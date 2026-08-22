package com.example.demo;

import java.util.Scanner;

public class Student {



    public void details() {
        System.out.println("Student details");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student count");
        int count = sc.nextInt();

        for (int i = count; i >= 0; i--) {
            System.out.println(i);

        System.out.println(" Enter your roll no:");
        int rollno = sc.nextInt();
        System.out.println(" Enter your name");
        String name = sc.next();

        boolean pass = true;

        System.out.println("mark 1");
        int mark1 = sc.nextInt();

        if (mark1 < 35) {
            pass = false;
        }

        System.out.println("mark 2");
        int mark2 = sc.nextInt();

        if (mark2 < 35) {
            pass = false;
        }
        System.out.println("mark 3");
        int mark3 = sc.nextInt();
        if (mark3 < 35) {
            pass = false;
        }
        System.out.println("mark 4");
        int mark4 = sc.nextInt();
        if (mark4 < 35) {
            pass = false;
        }
        System.out.println("mark 5");
        int mark5 = sc.nextInt();

        if (mark5 < 35) {
            pass = false;
        }
        System.out.println("Total");
        int total = mark1 + mark2 + mark3 + mark4 + mark5;
        int avg = total / 5;

        if (avg >= 80 && avg <= 100 && pass) {
            System.out.println("First class");
        } else if (avg >= 35 && avg <= 80 && pass) {
            System.out.println("Second class");
        } else if (avg >= 35 && !pass) {
            System.out.println("Fail-Try to get more marks ");
        }
      }
    }
}
