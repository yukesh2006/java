package day13;

public class missing {
	    public static int findMissing(int[] arr) {
	        int n = arr.length;
	        int expectedSum = n * (n + 1) / 2;
	        int actualSum = 0;
	        for (int x : arr) {
	            actualSum += x;
	        }
	        return expectedSum - actualSum;
	    }
	    public static void main(String[] args) {
	        int[] arr = {3, 0, 1};
	        int missing = findMissing(arr);
	        System.out.println("Missing number: " + missing);
	    }
}
//Find the largest number
//input [40000,250000,30000,50000]
