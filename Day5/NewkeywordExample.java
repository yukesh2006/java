package Day5;

public class NewkeywordExample {

	    public static void main(String[] args) {

	        String S1 = "Hello";
	        String S2 = "Hello";

	        String S3 = new String("Hello");
	        String S4 = new String("Hello");

	        System.out.println(S1 == S2);
	        System.out.println(S1.equals(S2));
	        System.out.println();
	        System.out.println(S1 == S3);
	        System.out.println(S1.equals(S3));
	        System.out.println();
	        System.out.println(S3 == S4);
	        System.out.println(S3.equals(S4));
	        
	    }
	}
