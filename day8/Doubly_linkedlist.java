package day8;

public class Doubly_linkedlist {
	static class Node{
		int data;
		Node previous;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public static void main(String[] args) {
		Node first =new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		first.next=second;
		second.next=third;
		third.previous=first;
		Node current=first;
		System.out.println("Forward");
		while (current!=null) {
			System.out.println(current.data + " ");
			current=current.next;
		}
		current=third;
		System.out.println("\nBackward:");
		while (current!=null) {
			System.out.println(current.data + " ");
			current=current.previous;
		}
	}
}
