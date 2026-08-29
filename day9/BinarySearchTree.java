package day9;

public class BinarySearchTree {

	static class Node{

		int data;

		Node left;

		Node right;

		Node(int data){

			this.data=data;

		}

	}

	static Node insert(Node root, int data) {

		if (root==null) {

			return new Node(data);

		}

		if (data < root.data) {

			root.left=insert(root.left, data);

		}else {

			root.right=insert(root.right, data);

		}

		return root;

	}

	static void inorder(Node root) {

		if (root==null) {

			return;

		}

		inorder(root.left);

		System.out.println(root.data+"");

		inorder(root.right);

	}

	public static void main(String[] args) {

		Node root=null;

		root=insert(root, 4);

		root=insert(root, 2);

		root=insert(root, 6);

		root=insert(root, 1);

		root=insert(root, 3);

		root=insert(root, 5);

		root=insert(root, 7);

		inorder(root);

	}

}