package day8;
public class WindowSlidindstack {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6};
        int windowSize = 3;
        for (int i = 0; i <= numbers.length - windowSize; i++) {
            int greater = numbers[i];
            for (int j = i; j < i + windowSize; j++) {
                if (numbers[j] > greater) {
                    greater = numbers[j];
                }
            }
            System.out.println("Greater value: " + greater);
        }
    }
}