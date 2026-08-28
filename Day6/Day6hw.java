package Day6;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {

    String name;
    String designation;
    int age;
    double salary;

    Employee(String name, int age, double salary, String designation) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
        System.out.println("----------------------");
    }
}

public class Day6hw {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Employee Management =====");
            System.out.println("1. Enter Employee");
            System.out.println("2. Display Employee");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter name: ");
                String name = sc.next();

                System.out.print("Enter age: ");
                int age = sc.nextInt();

                System.out.print("Enter salary: ");
                double salary = sc.nextDouble();

                System.out.print("Enter designation: ");
                String designation = sc.next();

                Employee emp =
                        new Employee(name, age, salary, designation);

                employees.add(emp);

                System.out.println("Employee added successfully!");

            } else if (choice == 2) {

                if (employees.isEmpty()) {

                    System.out.println("No employees available.");

                } else {

                    for (Employee e : employees) {
                        e.display();
                    }
                }

            } else if (choice == 3) {

                System.out.print("Enter employee name: ");
                String name = sc.next();

                boolean found = false;

                for (Employee e : employees) {

                    if (e.name.equalsIgnoreCase(name)) {

                        System.out.print("Enter percentage (1-10): ");
                        double p = sc.nextDouble();

                        if (p >= 1 && p <= 10) {

                            e.salary = e.salary + (e.salary * p / 100);

                            System.out.println(
                                    "New Salary: " + e.salary
                            );

                        } else {

                            System.out.println(
                                    "Percentage must be between 1 and 10."
                            );
                        }

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Employee not found.");
                }

            } else if (choice == 4) {

                System.out.println("Thank you!");
                sc.close();
                break;

            } else {

                System.out.println("Invalid choice.");
            }
        }
    }
}