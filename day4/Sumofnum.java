package com.day4;
import java.util.Scanner;
public class Sumofnum {
		public static void main(String[] args) {
			int total=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int a=sc.nextInt();
			for (int i=0;i<a;i++) {
				total=total+i;
			}
			System.out.println("The total: "+total);
		} 
			
		
	}


