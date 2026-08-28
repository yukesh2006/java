package Day7;

public class tailRecursion1 {
	    static void withdraw(int balance) {
	        if (balance == 0) {
	            System.out.println("Withdraw completed !");
	            return;
	        }
	        System.out.println("Withdraw: ₹2000");
	        balance = balance - 2000;
	        withdraw(balance);
	    }
	    public static void main(String[] args) {
	        withdraw(10000);

	    }
	}
