package day2;
class hello {
	void property() {
		System.out.println("Property");
	}
	void marry() {
		System.out.println("Family Girl");
	}
}
public class Parents extends hello{
	void marry() {
		System.out.println("Campus Girl");
	}
	public static void main(String[] args) {
		Parents test = new Parents();
		test.marry();
		test.property();
	}
}

