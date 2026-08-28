package Day6;

public class Student {
	    public static void main(String[] args) {
	        String[] students = {"A", "B", "C", "D"};
	        int[][] marks = {
	            {70, 80, 75, 90, 85},  
	            {60, 72, 68, 70, 75}, 
	            {88, 92, 90, 85, 95},  
	            {76, 80, 78, 82, 79}   
	        };
	        int highestTotal = 0;
	        String studentOfYear = "";
	        for (int i = 0; i < students.length; i++) {
	            int total = 0;
	            for (int j = 0; j < 5; j++) {
	                total = total + marks[i][j];
	            }
	            System.out.println(students[i] + " total marks = " + total);
	            if (total > highestTotal) {
	                highestTotal = total;
	                studentOfYear = students[i];
	            }
	        }
	        System.out.println("Student of the Year = " + studentOfYear);
	        System.out.println("Highest total marks = " + highestTotal);
	    }
	}


