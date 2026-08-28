package Day7;

public class BackTracing1 {
	    static String correctpassword = "123";
	    static void trypassword(String password) {
	        System.out.println("Trying: " + password);
	        if (password.equals(correctpassword)) {
	            System.out.println("Password found: " + password);
	            return;
	        }
	        if (password.length() == 3) {
	            System.out.println("Wrong password. Go back and try another");
	            return;
	        }
	        for (char i = '1'; i <= '3'; i++) {
	            trypassword(password + i);
	        }
	    }
	    public static void main(String[] args) {
	        trypassword("");
	}
}
