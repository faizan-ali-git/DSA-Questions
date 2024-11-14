package com.example.dataStructures;

public class MyBinaryTree {

	Node root;

	public MyBinaryTree() {
		this.root = null;
	}

	private static class Node {
		int data;
		Node left;
		Node right;
	}

	public void insert(int val) {
		Node node = new Node();
		node.data = val;
		if (root == null) {
			root = node;
		} else {
			Node temp = root;
			while (temp != null) {
				if (temp.data > val) {
					temp=temp.left;
				} else if(temp.data!=0 && temp.data < val) {
					temp=temp.right;
				}
			}
		}
	}
}
