package day10;
import java.util.Arrays;
import java.util.Collections;
public class GreedyAlgorithm {
	

	    public static void main(String[] args) {

	        int[] attendancePoints = {4, 10, 7};

	        
	        Arrays.sort(attendancePoints);

	        System.out.println(" Student has very little energy!");
	        System.out.println("So... choosing classes with maximum benefit first \n");

	        
	        for (int i = attendancePoints.length - 1; i >= 0; i--) {

	            System.out.println(
	                " Student attends class with "
	                + attendancePoints[i]
	                + " attendance points!"
	            );
	        }

	        System.out.println("\n Energy finished... Going back to sleep!");
	    }
	}