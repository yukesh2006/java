package Day7;
public class StackExample {
			static void methodA() {
			System.out.println("Inside methodA");
			methodB();
			System.out.println("Back to methodA");
		}
		static void methodB() {
			methodC();
			System.out.println("Insaide methodB");
		}
		static void methodC() {
			System.out.println("Insaide methodC");
		}
		public static void main(String[] args) {
			System.out.println("Insaid main");
			methodA();
			System.out.println("Back to main");
	}
	}