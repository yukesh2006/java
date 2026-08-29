package day9;

import java.util.PriorityQueue;

class Patient {
	String name;
	int priority;
	Patient(String name, int priority ){
		this.name=name;
		this.priority=priority;
	}
}
public class priorityqueue{
	public static void main(String[] args) {
		//Smaller num=higher priority
		PriorityQueue<Patient>queue=
				new PriorityQueue<>(
						(p1,p2)->p1.priority-p2.priority
						);
		queue.add(new Patient("Yukesh",2));
		queue.add(new Patient("Vikash",3));
		queue.add(new Patient("Sakshi",8));
		queue.add(new Patient("Yashwanth",6));
		
		while(!queue.isEmpty()) {
			Patient p=queue.poll();
			System.out.println(
					p.name+"-patient"+p.priority
					);
		}
	}
}
