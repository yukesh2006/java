package com.day4;

public class Sum_of_salary {
	public static void main(String[] args) {
		int[] a= {10000, 15000, 12000, 18000, 20000};
		int total=0;
		for (int i=0;i<a.length;i++) {
			total+=a[i];
		}
		System.out.println("The total: "+total);
	} 
		
	
}
