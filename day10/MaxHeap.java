package day10;

import java.util.PriorityQueue;
import java.util.Collections;

public class MaxHeap {

    public static void main(String[] args) {

        PriorityQueue<Integer> maxHeap =new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(30);
        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(5);

        System.out.println("Max Heap: " + maxHeap);

        System.out.println("Largest Element: " + maxHeap.peek());
    }
}