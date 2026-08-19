package day3;

public class mulltithread extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("method"+i);
		}
	}
	public static void main(String[] args) {
		mulltithread mm=new mulltithread();
		mm.start();
		for(int i=0;i<5;i++) {
			System.out.println("main method"+i);
		}
	}
	
}
