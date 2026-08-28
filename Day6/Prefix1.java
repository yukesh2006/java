package Day6;

public class Prefix1 {
	    public static void main(String[] args) {
	        int[] expenses = {100, 200, 150, 300, 250};
	        int windowSize = 3;
	        for (int i = 0; i <= expenses.length - windowSize; i++) {
	            int sum = 0;
	            for (int j = i; j < i + windowSize; j++) {
	                sum = sum + expenses[j];
	            }
	            double average = (double) sum / windowSize;
	            System.out.println("Sum = " + sum);
	            System.out.println("Average = " + average);
	            System.out.println();
	        }
	    }
}
