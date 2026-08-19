package day2;

interface Atm{
	abstract void depot();
}
interface Atm1{
	abstract void min();

}
public class Demo2 implements Atm,Atm1{
	public void depot() {
		System.out.println("Depot");
	}
	public void min() {
		System.out.println("min");
	}
	public static void main(String[] args) {
		Demo2 v=new Demo2();
		v.depot();
		v.min();
	}
}
