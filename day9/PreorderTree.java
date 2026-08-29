package day9;
public class PreorderTree {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
		}
	}
	static void preorder(Node root) {
		if (root==null) {
			return;
		}
		//visiting root
		System.out.println(root.data+"");
		//visit left
		preorder(root.left);
		//visit right
		preorder(root.right);
	}
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		preorder(root);
	}
}
	

