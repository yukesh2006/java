package day13;

public class Attendance {
	    public static int countOccurrences(int[] ids, int searchId) {
	        int count = 0;
	        for (int id : ids) {
	            if (id == searchId) {
	                count++;
	            }
	        }
	        return count;
	    }
	    public static void main(String[] args) {
	        int[] attendanceData = {101, 102, 101, 103, 101};
	        int searchId = 101;
	        int occurrences = countOccurrences(attendanceData, searchId);
	        System.out.println("Employee ID " + searchId + " appears " + occurrences + " times in attendance data.");
	    }
	}

