package com.data_structure;

public class MainLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Student> linkedList = new LinkedList<Student>(new Node<Student>(new Student(1004, "Abd Elbaset Fortas"), null));
		linkedList.addNodeAHead(new Node<Student>(new Student(1005, "Saif Elislam Fortas"), null));
		linkedList.addNodeAHead(new Node<Student>(new Student(1000, "Bouaziz Fortas"), null));
		linkedList.display();
		System.err.println("\nAfter Delete First Node : ");
		linkedList.deleteFirstNode();
		linkedList.display();
	}

}
