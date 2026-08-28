package Day5;
import java.util.Scanner;
public class Sub {
		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a string: ");
		        String str = sc.nextLine();

		        System.out.println(str.substring(0, 1));
		        System.out.println(str.substring(1, 2));
		        System.out.println(str.substring(2, 3));
		        System.out.println(str.substring(3, 4));

		        System.out.println(str.substring(0, 2));
		        System.out.println(str.substring(1, 3));
		        System.out.println(str.substring(2, 4));

		        System.out.println(str.substring(0, 3));
		        System.out.println(str.substring(1, 4));

		        sc.close();
		    }

}
