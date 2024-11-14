package com.example.dataStructures;

public class MyLinkedList {
	
	int size=0;
	Node Head =null;
	public static class Node{
		int value;
		Node next;
	}
	
	public void insertStart(int val) {
		if(Head == null) {
			Node node = new Node();
			node.value= val;
			node.next= null;
			Head = node;
		} else {
			Node node = new Node();
			node.value= val;
			node.next= Head;
			Head = node;
		}
		size++;

	}
	public void display() {
		if(Head == null) {
			System.out.println("Linked List is empty");
		}
		else {
			System.out.print("Head -> ");
			Node temp= Head;
			while(temp!=null) {
				
				System.out.print(temp.value + " ->");
				temp= temp.next;
			}
			System.out.print(" null");
		}
	}

}
