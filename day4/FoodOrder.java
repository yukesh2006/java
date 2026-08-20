package com.day4;
import java.util.Scanner;
public class FoodOrder {
	int a;
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
//		 Calculator cal=new Calculator();
		 int choice;
		 do {
			 System.out.println("Enter the number:-");
			 choice = sc.nextInt();
			 
			 switch (choice) {
			 case 1:
				 System.out.println("1.Pizza");
				 break;
			 case 2:
				 System.out.println("2.Burger");
				 break;
			 case 3:
				 System.out.println("3.Pasta");
				 break;
			 default:
				 System.out.println("Exit");
				 break;
			 }
		 }while (choice !=3);
		 sc.close();
	}
}
