package day8;

public class Merge_linkedlist {
	static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        a.next = new Node(20);
        a.next.next = new Node(30);
        Node b = new Node(40);
        b.next = new Node(50);
        b.next.next = new Node(60);
        Node current = a;
        while (current.next != null) {
            current = current.next;
        }
        current.next = b;
        current = a;
        System.out.println("Merged Linked List:");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
