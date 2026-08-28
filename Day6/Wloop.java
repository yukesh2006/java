package Day6;

public class Wloop {
	    public static void main(String[] args) {
	        int[] number = {10, 20, 30, 40, 50};
	        int windowSize = 3;
	        int sum = 0;
	        for (int i = 0; i < windowSize; i++) {
	            sum += number[i];
	        }
	        System.out.println("Sum = " + sum);
            int start = 0;
	        int end = windowSize;
	        while (end < number.length) {
	            sum = sum - number[start];
	            sum = sum + number[end];
	            System.out.println("Sum = " + sum);
	            start++;
	            end++;
	        }
	    }
	}
