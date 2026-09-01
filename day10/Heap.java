package day10;

import java.util.PriorityQueue;

public class Heap {
	public static void main(String[] args) {
		int[] number= {10,5,20,8,15,30,25};
		int k=3;
		//Min Heap
		PriorityQueue<Integer>maxHeap=new PriorityQueue<>();
		for(int numbers : number) {
			maxHeap.add(numbers);
			//keep only k elements
			if(maxHeap.size()>k) {
				maxHeap.poll();
			}
		}
		System.out.println("Top"+k+"Largest numbers:");
		while(!maxHeap.isEmpty()) {
			System.out.println(maxHeap.poll());
		}
	}
}

