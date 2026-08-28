package Day6;

public class Stud {
		    public static void main(String[] args) {

		        int[] marks = {100, 200, 150, 300, 250};
		        int[] prefixSum = new int[marks.length];

		        prefixSum[0] = marks[0];

		        for (int i = 1; i < marks.length; i++) {
		            prefixSum[i] = prefixSum[i - 1] + marks[i];
		        }
		        int totalMarks = prefixSum[3];

		        System.out.println("totalmarks in 5 test = " + totalMarks);
		    }
		}


