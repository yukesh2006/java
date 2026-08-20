package Homework;

import java.util.Scanner;
public class Employee_details_03 {
	String name;
	byte age;
	String Designation;
	int Salary;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee_details_03 emp=new Employee_details_03();
		int choice = 0;
		char ch;
		do {
			System.out.println("\n1.Create user");
			System.out.println("2.Display user Details");
			System.out.println("3.Raise Salary");
			System.out.println("4.Exit");
			System.out.println("Enter the Your choice: ");
			choice=sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
				case 1:
					System.out.println("---------------------------------------");

					do{
						System.out.println("Enter the Name of Employee:");
					
					emp.name=sc.next();
					
					System.out.println("Enter the age of Employee:");
					emp.age=sc.nextByte();
					if(emp.age<18)
					System.out.println("Enter the Designation of Employee(P/M/T):");
					emp.Designation=sc.next();
					System.out.println("\n=====Employee Details Created Successfully====\n");
					sc.nextLine();
					System.out.println("Do you want to create again?(Y/N): ");
					ch=sc.nextLine().charAt(0);
					}while (ch =='Y'||ch =='y');
					System.out.println("---------------------------------------");
					break;
				case 2:
					System.out.println("---------------------------------------");
					System.out.println("###Details of Employee###");
					System.out.println("Name of Employee: "+emp.name);
					System.out.println("Age of Employee: "+emp.age);
					System.out.println("Designation of Employee: "+emp.Designation);
					String Designation=emp.Designation;
					if(emp.Designation.equals("P")) {
						emp.Salary=20000;
					}else if(emp.Designation.equals("M")) {
						emp.Salary=25000;
					}else if(emp.Designation.equals("T")){
						emp.Salary=15000;
					}
					System.out.println("Salary of Employee: "+emp.Salary);
					System.out.println("---------------------------------------");
					break;
				case 3:
					System.out.println("---------------------------------------");
					System.out.println("Enter the Salary to Raise:");
					int raise=sc.nextInt();
					emp.Salary= emp.Salary + raise;
					System.out.println("\n---Salary Raised Sucessfully---\n");
					System.out.println("The Total Salary is: "+emp.Salary);
					System.out.println("---------------------------------------");
					break;
				case 4:
					System.out.println("---------------------------------------");
					System.out.println("======EXIT======");
					System.out.println("---------------------------------------");
					break;	
			}
		}while(choice != 4);
			sc.close();
	}
}
