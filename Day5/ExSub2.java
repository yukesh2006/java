package Day5;
import java.util.Scanner;
public class ExSub2 {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        for (int i = 0; i < str.length(); i++) {

	            for (int j = i + 1; j <= str.length(); j++) {

	                System.out.println(str.substring(i, j));
	            }
	        }

	        sc.close();
	    }
}
