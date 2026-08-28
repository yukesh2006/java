package Day6;

public class logic {

		    public static void main(String[] args) {

		        int[] numbers = {2, 3, 1, 2, 4, 3};
		        int target = 7;
		        int minLength = numbers.length + 1;

		        for (int i = 0; i < numbers.length; i++) {

		            int sum = 0;

		            for (int j = i; j < numbers.length; j++) {

		                sum += numbers[j];

		                if (sum >= target) {

		                    int length = j - i + 1;

		                    if (length < minLength) {
		                        minLength = length;
		                    }
		                }
		            }
		        }

		        System.out.println("Smallest window length = " + minLength);
		    }
		}
