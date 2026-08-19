package Homework;

import java.util.Scanner;

public class Employee_details {

    String name;
    int age;
    String designation;
    double salary;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee_details emp = new Employee_details();

        int choice;

        do {
            System.out.println("\n1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:
                System.out.print("Enter the name: ");
                emp.name = sc.next();

                System.out.print("Enter the age: ");
                emp.age = sc.nextInt();

                System.out.print("Enter the designation (PMT): ");
                emp.designation = sc.next();

                System.out.print("Enter the salary: ");
                emp.salary = sc.nextDouble();

                System.out.println("Employee created successfully!");
                break;

            case 2:
                System.out.println("\n--- Employee Details ---");
                System.out.println("Name: " + emp.name);
                System.out.println("Age: " + emp.age);
                System.out.println("Designation: " + emp.designation);
                System.out.println("Salary: " + emp.salary);
                break;

            case 3:
                System.out.print("Enter salary raise amount: ");
                double raise = sc.nextDouble();

                emp.salary = emp.salary + raise;

                System.out.println("Salary raised successfully!");
                System.out.println("New Salary: " + emp.salary);
                break;

            case 4:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}