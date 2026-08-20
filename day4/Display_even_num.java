package com.day4;

public class Display_even_num {
	public static void main(String[] args) {
		int num=20;
		//int remainder=num%2;
		//System.out.println("Remainder: "+remainder);
		for(int i=0;i<num;i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
	}
}
