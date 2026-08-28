package Day6;

public class FixSlidingWindows {

    public static void main(String[] args) {
        int[] number = {10, 20, 30, 40, 50};
        int windowSize = 3;
        int sum = 0;
        for (int i = 0; i < windowSize; i++) {
            sum = sum + number[i];
        }
        System.out.println("Sum = " + sum);
        int start = 0 ;
        for (int end = windowSize; end < number.length; end++) {
            sum = sum - number[start];
            sum = sum + number[end];
            start++;
            System.out.println("Sum = " + sum);
        }
    }
}