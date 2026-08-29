package day9;

import java.util.ArrayList;

public class lexicalSearch {
	public static void main(String[] args) {
		String[] names= {
				"Yukesh",
				"Vikash",
				"Yashwanth",
				"Vikas",
				"Romu"
		};
		String search="Y";
		//Find names containing "Y";
		ArrayList<String> result=new ArrayList<>();
		for(String name: names) {
			if(name.contains(search)) {
				result.add(name);
			}
		}
		//Sort alphabetically;
		//Display result;
		System.out.println("Search result:");
		for(String name : result) {
			System.out.println(name);
		}
	}
}
