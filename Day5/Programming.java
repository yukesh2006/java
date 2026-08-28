package Day5;
import java.util.Scanner;
public class Programming {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a word: ");
	        String str = sc.nextLine();

	        for (int i = 0; i < str.length(); i++) {

	            for (int j = i + 1; j < str.length(); j++) {

	                if (str.charAt(i) == str.charAt(j)) {
	                    System.out.println("Duplicate character: " + str.charAt(i));
	                    break;
	                }
	            }
	        }

	        sc.close();
	    }
	}
	
