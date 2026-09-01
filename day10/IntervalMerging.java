package day10;
import java.util.*;
public class IntervalMerging {
	
	
	    public static void main(String[] args) {
	        int[][] intervals = {
	            {1, 3},
	            {2, 6},
	            {8, 10},
	            {15, 18}
	        };
	        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

	       
	        List<int[]> merged = new ArrayList<>();

	       
	        merged.add(intervals[0]);

	        
	        for (int i = 1; i < intervals.length; i++) {

	            int[] last = merged.get(merged.size() - 1);
	            int[] current = intervals[i];

	            
	            if (current[0] <= last[1]) {

	               
	                last[1] = Math.max(last[1], current[1]);

	            } else {

	               
	                merged.add(current);
	            }
	        }

	       
	        System.out.println("Merged Intervals:");

	        for (int[] interval : merged) {
	            System.out.println(
	                "[" + interval[0] + ", " + interval[1] + "]"
	            );
	        }
	    }
	}