package com.day4;

import java.util.ArrayList;

public class ArrayList0 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		System.out.println("Initial size of ArrayList before adding elements: "+list.size());
		System.out.println("ArrayList is empty before adding elements: "+list.isEmpty());
		System.out.println("Contents of arrayList before values: \n"+list);
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		list.add("H");
		list.add("I");
		list.add(null);
		System.out.println("Size of arraylist after adding elements: "+list.size());
		System.out.println("arraylist is empty after adding values: "+list.isEmpty());
		System.out.println("Content of arraylist after adding values: \n"+list);
		boolean b1=list.contains("B");
			System.out.println("values B is present :"+b1);
		boolean b2=list.contains("E");
			System.out.println("values B is present :"+b2);
			list.remove("H");
		
		System.out.println("size of array after deletion: "+list.size());
		System.out.println("contents of array after deletion: "+list);
		list.clear();
		System.out.println("size of array after clearing: "+list.size());
		System.out.println("contents of array after clearing: "+list);
	}
}
