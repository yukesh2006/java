package com.day4;
import java.util.Scanner;
public class Calculator {
	int a=10,b=20;
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 Calculator cal=new Calculator();
		 int choice;
		 do {
			 System.out.println("\n 1.ADDITION:");
			 System.out.println("2.SUBTRACTION:");
			 System.out.println("3.MULTIPLICATION:");
			 System.out.println("4.DIVISION:");
			 System.out.println("Enter the choice:-");
			 choice = sc.nextInt();
			 
			 switch (choice) {
			 case 1:
				 System.out.println("Enter two numbers:-"+(cal.a+cal.b));
				 break;
			 case 2:
				 System.out.println("Enter two numbers:-"+(cal.a-cal.b));
				 break;
			 case 3:
				 System.out.println("Enter two numbers:-"+(cal.a*cal.b));
				 break;
			 case 4:
				 System.out.println("Enter two numbers:-"+(cal.a/cal.b));
				 break;
			 default:
				 System.out.println("Exit");
				 break;
			 }
		 }while (choice !=4);
		 sc.close();
	}
}
