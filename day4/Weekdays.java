package com.day4;
import java.util.Scanner;
public class Weekdays {
	int a;
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 Calculator cal=new Calculator();
		 int choice;
		 do {
			 System.out.println("Enter the week day in number:-");
			 choice = sc.nextInt();
			 
			 switch (choice) {
			 case 1:
				 System.out.println("1.Sunday");
				 break;
			 case 2:
				 System.out.println("2.Monday");
				 break;
			 case 3:
				 System.out.println("3.Tuesday");
				 break;
			 case 4:
				 System.out.println("4.Wednesday");
				 break;
			 case 5:
				 System.out.println("5.Thursday");
				 break;
			 case 6:
				 System.out.println("6.Friday");
				 break;
			 case 7:
				 System.out.println("7.Saturday");
				 break;
			 default:
				 System.out.println("Exit");
				 break;
			 }
		 }while (choice !=7);
		 sc.close();
	}
}
