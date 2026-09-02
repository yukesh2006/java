package day11;

public class Fibbnocci {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        System.out.print("The num is:"+a+"\nThe num is:"+ b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print("\nThe num is:"+c);
            a = b;
            b = c;
        }
    }
}