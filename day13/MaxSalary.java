package day13;

public class MaxSalary {
	public static void main(String[] args) {
		int[] salary= {25000,40000,30000,50000};
		char[] Names= {'A','B','C','D'};
		 int max = salary[0];
	        char c = '[0];

	        for (int i = 1; i < salary.length; i++) {
	            if (salary[i] > max) {
	                max = salary[i];
	                c = Names[i];
	            }
	        }

	        System.out.println("Employee with highest salary: " + c);
	        System.out.println("Salary: " + max);	}
}
