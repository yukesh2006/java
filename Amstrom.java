package day2;

public class Amstrom {
    public static void main(String[] args) {
        int n = 153, sum = 0, temp = n;

        while (n > 0) {
            int d = n % 10;
            sum += d * d * d;
            n /= 10;
        }

        if (sum == temp)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
