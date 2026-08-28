package day8;

public class reversal_linkedlist {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        // Reverse
        Node previous = null;
        Node current = first;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        // Display reversed list
        current = previous;

        System.out.println("Reverse Linked List:");

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}