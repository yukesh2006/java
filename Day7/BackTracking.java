package Day7;

public class BackTracking {
		static String correctpassword="123";
		static void trypassword(String password) {
			System.out.println("trying:"+password);
			if (password.equals(correctpassword)) {
				System.out.println("Pasword found:"+password);
				return;
			}
			System.out.println("Wrong password. go back and try another");
		}
		public static void main(String[] args) {
			trypassword("123");
			trypassword("321");
			trypassword("213");
			trypassword("231");
		}
	}
