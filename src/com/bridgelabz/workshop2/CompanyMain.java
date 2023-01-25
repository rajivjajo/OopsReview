package com.bridgelabz.workshop2;

import java.util.Scanner;

public class CompanyMain {
    static void option(Company employeeDetails) {
        Scanner scanner = new Scanner(System.in);
        int chooseOption;
        do {
            System.out.println("1. Add of employee \n2.Display Details\n3.Add amazon emp\n4.Add google emp  ");
            chooseOption = scanner.nextInt();

            switch (chooseOption) {
                case 1:
                    System.out.println("add Employee details");
                    employeeDetails.addEmployee();
                    break;
                case 2:
                    System.out.println("to display detail of employee press 2");
                    employeeDetails.displayEmployee();

                case 3:
                    System.out.println("add employee in Amazon");
                    employeeDetails.amazon();
                    break;
                case 4:
                    System.out.println("add employee in Google");
                    employeeDetails.google();
                    break;
            }
        }
        while (chooseOption != 4);

    }

    public static void main(String[] args) {
        System.out.println("Welcome to multiple companies Database!");
        Company company = new Company();
        option(company);

    }
}
