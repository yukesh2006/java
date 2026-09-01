package day10;

import java.util.PriorityQueue;

public class Median {

    public static void main(String[] args) {

        int[] number = {10, 20, 30, 40, 50};
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int n : number) {
            minHeap.add(n);
        }

        int n = number.length;
        int median;

        // Remove elements until middle element
        for (int i = 0; i < n / 2; i++) {
            minHeap.poll();
        }

        median = minHeap.peek();
       
        System.out.println("Median: " + median);
    }
}