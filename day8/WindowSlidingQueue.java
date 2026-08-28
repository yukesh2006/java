package day8;

import java.util.Queue;
import java.util.LinkedList;

public class WindowSlidingQueue {

    public static void main(String[] args) {

        int[] numbers = {2, 3, 4, 5, 6};
        int windowSize = 3;

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < numbers.length; i++) {

            q.add(numbers[i]);

            if (q.size() == windowSize) {

                int greater = 0;

                for (int x : q) {
                    if (x > greater)
                        greater = x;
                }

                System.out.println("Greater value: " + greater);

                q.remove();
            }
        }
    }
}