package Homework;

import java.util.Scanner;

public class Employee_details02 {

    String name;
    int age;
    String designation;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee_details emp = new Employee_details();

        int choice;

        do {
            System.out.println("\n1) Create");
            System.out.println("2) Display");
            System.out.println("3) Raise Sal");
            System.out.println("4) Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1:

                System.out.print("Do you want to create employee? (Y/N): ");
                String yn = sc.nextLine();

                if (yn.equalsIgnoreCase("Y")) {

                    // Name
                    System.out.print("Enter name (2 space allowed): ");
                    emp.name = sc.nextLine();

                    // Age
                    do {
                        System.out.print("Enter age (18 to 60): ");
                        emp.age = sc.nextInt();

                        if (emp.age < 18 || emp.age > 60) {
                            System.out.println("Invalid age! Enter age between 18 and 60.");
                        }

                    } while (emp.age < 18 || emp.age > 60);

                    sc.nextLine();

                    // Designation
                    System.out.print("Enter Designation (PMT): ");
                    emp.designation = sc.nextLine();

                    System.out.println("Employee created successfully!");

                } else if (yn.equalsIgnoreCase("N")) {

                    System.out.println("Returning to main menu...");

                } else {

                    System.out.println("Please enter Y or N.");

                }

                break;

            case 2:

                System.out.println("\n--- Employee Details ---");

                System.out.println("Name: " + emp.name);
                System.out.println("Age: " + emp.age);
                System.out.println("Designation: " + emp.designation);

                break;

            case 3:

                System.out.println("Raise Salary");

                break;

            case 4:

                System.out.println("Exit");

                break;

            default:

                System.out.println("Invalid choice!");

            }

        } while (choice != 4);

        sc.close();
    }
}