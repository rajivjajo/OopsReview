package com.bridgelabz.workshop2;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    static ArrayList<Employee> employeeList = new ArrayList<>();

    static void amazon() {
        System.out.println("Employee of amazon !");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name");
        String name = scanner.next();
        System.out.println("enter employee age");
        int age = scanner.nextInt();
        System.out.println("Enter Employee phone number");
        Long phoneNum = scanner.nextLong();
        System.out.println("Enter the state");
        String state = scanner.next();
        System.out.println("Enter the department");
        String department = scanner.next();
        Employee employee1 = new Employee();
        employee1.setName(name);
        employee1.setAge(age);
        employee1.setPhoneNum(phoneNum);
        employee1.setState(state);
        employee1.setDepartment(department);
        Employee employee2 = new Employee();
        employee2.setName(name);
        employee2.setAge(age);
        employee2.setPhoneNum(phoneNum);
        employee2.setState(state);
        employee2.setDepartment(department);

    }

    static void google() {
        System.out.println("Employee of google !");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name");
        String name = scanner.next();
        System.out.println("enter employee age");
        int age = scanner.nextInt();
        System.out.println("Enter Employee phone number");
        Long phoneNum = scanner.nextLong();
        System.out.println("Enter the state");
        String state = scanner.next();
        System.out.println("Enter the department");
        String department = scanner.next();
        Employee employee3 = new Employee();
        employee3.setName(name);
        employee3.setAge(age);
        employee3.setPhoneNum(phoneNum);
        employee3.setState(state);
        employee3.setDepartment(department);
        Employee employee4 = new Employee();
        employee4.setName(name);
        employee4.setAge(age);
        employee4.setPhoneNum(phoneNum);
        employee4.setState(state);
        employee4.setDepartment(department);
    }

    public static void displayEmployee() {

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    void addEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Name : ");
        String name = scanner.next();
        System.out.println("Enter City : ");
        String city = scanner.next();
        System.out.println("Enter state : ");
        String state = scanner.next();
        System.out.println("Enter Dept : ");
        String department = scanner.next();
        System.out.println("Enter age : ");
        int age = scanner.nextInt();
        System.out.println("Enter phone number : ");
        Long phoneNum = scanner.nextLong();
        Employee employee = new Employee();
        employee.setName(name);
        employee.setCity(city);
        employee.setState(state);
        employee.setDepartment(department);
        employee.setAge(age);
        employee.setPhoneNum(phoneNum);
    }

}