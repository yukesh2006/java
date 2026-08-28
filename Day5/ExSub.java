package Day5;
import java.util.Scanner;
public class ExSub {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a String: ");
	        String str = sc.nextLine();

	        System.out.print("Enter starting index: ");
	        int start = sc.nextInt();

	        System.out.print("Enter ending index: ");
	        int end = sc.nextInt();

	        String result = str.substring(start, end);

	        System.out.println("Substring: " + result);
	    }
}
