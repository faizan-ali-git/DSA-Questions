package com.example.dataStructures;

public class MyBinarySearchTree {

	Node root;

	public MyBinarySearchTree() {
		this.root = null;
	}

	private static class Node {
		int data;
		Node left;
		Node right;
	}

	public void insert(int value) {
		root = insertRec(value, root);
	}

	public Node insertRec(int val, Node root) {

		if (root == null) {
			Node node = new Node();
			node.data = val;
			root = node;
			return root;
		}

		if (root.data > val) {
			root.left = insertRec(val, root.left);
		} else if (root.data < val) {
			root.right = insertRec(val, root.right);

		}
		return root;
	}

	public void inOrder() {//required because we don't want to send the root at
		//calling time in main method
		displayInOrder(root);
	}

	public void displayInOrder(Node root) {
		if (root != null) {// forgot the terminal condition
		displayInOrder(root.left);
		System.out.println(root.data + "	");
		displayInOrder(root.right);
		}
	}
	public void preOrder() {//required because we don't want to send the root at
		//calling time in main method
		displayPreOrder(root);
	}
	
	public void displayPreOrder(Node root) {
		if (root != null) {// forgot the terminal condition
			System.out.println(root.data + "	");

			displayPreOrder(root.left);
			displayPreOrder(root.right);
		}
	}
	public boolean search(int val) {//required because we don't want to send the root at
		//calling time in main method
		return bstSearch(root,val);
	}
	
	public boolean bstSearch(Node root,int val) {
		
		
		if(root== null) {//forgot this condition, the algo is doing binary search
						// and if it's going to leaf and couldn't find the val then 
						//that means the value doesn't exists
			return false;
		}
		if(root.data == val) {
			return true;
		}
		if(root.data >val) {
			return bstSearch(root.left,val);
		}
		if(root.data <val) {
			return bstSearch(root.right,val);
		}
		return false;
	}
     public int countNodesInRange(int low, int high) {
    	 return countNodesInRangeUtil(root,low,high);
     }
	private int countNodesInRangeUtil(Node root, int low, int high) {
		if(root.data >high || root.data<low) {
			return 0;
		}
		if(root.data <high || root.data>low) {
			return 1;
		}
		return  countNodesInRangeUtil(root.left,low,high)
				+countNodesInRangeUtil(root.right,low,high);
	}

	public static void main(String[] args) {
		MyBinarySearchTree bst = new MyBinarySearchTree();
		bst.insert(10);
		bst.insert(5);
		bst.insert(1);
		bst.insert(50);
		bst.insert(40);
		bst.insert(100);

//		bst.inOrder();
//		System.out.println();
//		bst.preOrder();
//		System.out.println(bst.search(5));
		System.out.println(bst.countNodesInRange(5,50));

	}
}
