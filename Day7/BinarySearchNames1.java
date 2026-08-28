package Day7;
public class BinarySearchNames1 {
		    public static void main(String[] args) {
		        String[] arr = {"aradya","gowda","ticket","ticket","ticket","toxic","uday","vinod","yash"};
		        String target = "ticket";
		        int first = -1;
		        int last = -1;
		        int start = 0;
		        int end = arr.length - 1;
		        while (start <= end) {
		            int mid = (start + end) / 2;
		            if (arr[mid] == target) {
		                first = mid;
		                end = mid - 1;
		            }
		            else if (target.compareTo(arr[mid]) > 0) {
		                start = mid + 1;
		            }
		            else {
		                end = mid - 1;
		            }
		        }
		        start = 0;
		        end = arr.length - 1;

		        while (start <= end) {

		            int mid = (start + end) / 2;

		            if (arr[mid] == target) {
		                last = mid;
		                start = mid + 1;
		            }
		            else if (target.compareTo(arr[mid]) > 0) {
		                start = mid + 1;
		            }
		            else {
		                end = mid - 1;
		            }
		        }
		        System.out.println("First = " + first);
		        System.out.println("Last = " + last);
		    }
	}

