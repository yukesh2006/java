package com.day4;

public class Electricitybill {
		public static void main(String[] args) {
			int[] a= {10,15,12,20,18,14,16};
			int total=0;
			System.out.println("Day 1 → 10 units\r\n"
					+ "Day 2 → 15 units\r\n"
					+ "Day 3 → 12 units\r\n"
					+ "Day 4 → 20 units\r\n"
					+ "Day 5 → 18 units\r\n"
					+ "Day 6 → 14 units\r\n"
					+ "Day 7 → 16 units");
			for (int i=0;i<a.length;i++) {
				total+=a[i];
			}
			System.out.println("The total electricity bill for 7 days is: "+total);
		} 
			
		
	}


