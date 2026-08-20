package com.day4;

public class Max_value {
		public static void main(String[] args) {
			int[] n= {78, 65, 89, 92, 71};
			int max=n[0];
			for(int i=0;i<n.length;i++) {
				if( max<n[i]) {
					max=n[i];
					System.out.println("The Maximum Marks is: "+max);
				}
			}
}}

