package Day6;
import java.util.Scanner;
public class StringBuild {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a word: ");
	        String word = input.nextLine();
	        StringBuilder text = new StringBuilder(word);
	        text.append(" Java");
	        System.out.println(" adding : " + text);
	        text.insert(0, "Hello ");
	        System.out.println("After adding: " + text);
	        text.replace(0, 5, "Hi");
	        System.out.println("After update: " + text);
	        input.close();
	    }
	}