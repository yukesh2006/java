package day3;

public class exception2 {
	public static void main(String[] args) {
		try {
			System.out.println("Yukesh");
			System.out.println(10/2);
		}catch(NullPointerException ne){			
			System.out.println("u r getting ne" +ne);
		}finally {
			System.out.println("finally blockis always executed");
		}
		System.out.println("Rest of the code");
	}
}
