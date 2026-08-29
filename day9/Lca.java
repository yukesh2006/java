package day9;

public class Lca {
	static class Node{
		int data;
		Node left, right;
		Node(int data){
			this.data=data;
		}
	}
	static Node findLCA(Node root, int n1, int n2 ) {
		//Both values are smaller ->go left;
		if(n1<root.data && n2<root.data) {
			return findLCA(root.left, n1, n2);
		}
		//Both values greater->go right;
		if(n1>root.data && n2>root.data) {
			return findLCA(root.right, n1, n2);
		}
		//values are on different sides
		//current node is the LCA;
		return root;
	}
	public static void main(String[] args) {
		Node root=new Node(10);
		root.left=new Node(5);
		root.right=new Node(15);
		root.left.left=new Node(2);
		root.left.right=new Node(7);
		root.right.left=new Node(12);
		root.right.right=new Node(20);
		//Find LCA of 2 and 7
		Node result = findLCA(root, 2, 7);
        System.out.println("LCA = " + result.data);
		
	}
}
