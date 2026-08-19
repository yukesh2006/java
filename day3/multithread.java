package day3;
interface yuki{
	abstract void run();
	abstract void go();
}
public class multithread implements Runnable{
	public void run() {
		for(int i=0;i<=3;i++) {
			System.out.println("Thread 1 ok"+i);
		}
	}
	public static void main(String[] args) {
		multithread bb=new multithread();
		Thread cc=new Thread(bb);
		cc.start();
		for(int i=0;i<=3;i++) {
			System.out.println("Thread 2 done"+i);
		}
	}
}
