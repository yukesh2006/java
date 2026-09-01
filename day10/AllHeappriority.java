package day10;

import java.util.PriorityQueue;
import java.util.Collections;

public class AllHeappriority {

    public static void main(String[] args) {
        int[] number = {10, 5, 20, 8, 15, 3, 25};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int n : number) {
            minHeap.add(n);
        }
        System.out.println("Min Heap:");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
        PriorityQueue<Integer> maxHeap =new PriorityQueue<>(Collections.reverseOrder());
        for (int n : number) {
            maxHeap.add(n);
        }
        System.out.println("\nMax Heap:");
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
        int k = 3;
        PriorityQueue<Integer> kLargest = new PriorityQueue<>();
        for (int n : number) {
            kLargest.add(n);
            if (kLargest.size() > k) {
                kLargest.poll();
            }
        }
        System.out.println("\nTop " + k + " Largest:");
        while (!kLargest.isEmpty()) {
            System.out.println(kLargest.poll());
        }
        PriorityQueue<Integer> kSmallest =new PriorityQueue<>(Collections.reverseOrder());
        for (int n : number) {
            kSmallest.add(n);
            if (kSmallest.size() > k) {
                kSmallest.poll();
            }
        }
        System.out.println("\nTop " + k + " Smallest:");
        while (!kSmallest.isEmpty()) {
            System.out.println(kSmallest.poll());
        }
        PriorityQueue<Integer> medianHeap = new PriorityQueue<>();
        for (int n : number) {
            medianHeap.add(n);
        }
        int size = number.length;
        for (int i = 0; i < size / 2; i++) {
            medianHeap.poll();
        }
        if (size % 2 != 0) {
            // Odd number of elements
            System.out.println("\nMedian: " + medianHeap.peek());
        } else {
            // Even number of elements
            int a = medianHeap.poll();
            int b = medianHeap.peek();
            double median = (a + b) / 2.0;
            System.out.println("\nMedian: " + median);
        }
    }
}