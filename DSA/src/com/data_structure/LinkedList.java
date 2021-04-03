package com.data_structure;

public class LinkedList<T> {
	private Node<T> head;
	
	public LinkedList(Node<T> head) {
		// TODO Auto-generated constructor stub
		this.head = head;
	}
	
	public void addNodeAHead(Node<T> newNode) {
		// TODO Auto-generated method stub
		newNode.next = head;
		head = newNode;
	}
	
	public void deleteFirstNode() {
		// TODO Auto-generated method stub
		head = head.next;
	}

	public void display() {
		// TODO Auto-generated method stub
		Node<T> node = head;
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}
}
