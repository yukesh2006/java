package day9;

class Node{
	int data;
	Node left, right;
	Node(int data){
		this.data=data;
	}
}
public class DiameterTree {
	static int diameter=0;
	static int height(Node root) {
		if(root==null)
			return 0;
		int leftHeight=height(root.left);
		int rightHeight=height(root.right);
		diameter=Math.max(diameter,leftHeight+rightHeight);
		return 1 + Math.max(leftHeight, rightHeight);
	}
	public static void main(String[] args) {
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(11);
		root.left.left=new Node(40);
		root.left.right=new Node(50);
		height(root);
		System.out.println("Diameter= "+diameter);
	}
}
