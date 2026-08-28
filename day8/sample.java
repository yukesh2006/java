package day8;

import java.util.Scanner;

public class sample {

    String name;
    int age;
    int salary;

    public sample(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void display() {
        System.out.println("\nName: \n" + name);
        System.out.println("Age: \n" + age);
        System.out.println("Salary: \n" + salary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter salary: ");
        int salary = sc.nextInt();

        sample person = new sample(name, age, salary);

        person.display();

        sc.close();
    }
}




//package Day8;
//
//import java.util.Scanner;
//
//public class Main2 {
//
//    String name;
//    int age;
//    int salary;
//
//    public Main2(String name, int age, int salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//    }
//
//    void display() {
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Salary: " + salary);
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter name: ");
//        String name = sc.nextLine();
//
//        System.out.print("Enter age: ");
//        int age = sc.nextInt();
//
//        System.out.print("Enter salary: ");
//        int salary = sc.nextInt();
//
//        Main2 person = new Main2(name, age, salary);
//
//        person.display();
//
//        sc.close();
//    }
//}