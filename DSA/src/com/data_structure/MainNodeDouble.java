package com.data_structure;

public class MainNodeDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeDouble<Integer> node = new NodeDouble<Integer>(10, null, null);
		QueueLinkedList<Integer> queueNodeDouble = new QueueLinkedList<Integer>(node);
		queueNodeDouble.addNodeDouble(new NodeDouble<Integer>(12,  null,  null));
		queueNodeDouble.addNodeDouble(new NodeDouble<Integer>(14,  null,  null));
		queueNodeDouble.addNodeDouble(new NodeDouble<Integer>(16,  null,  null));
		queueNodeDouble.addNodeDouble(new NodeDouble<Integer>(18,  null,  null));
		
		System.out.println("Remove : "+queueNodeDouble.removeNodeDouble());
		System.out.println("Remove : "+queueNodeDouble.removeNodeDouble());
		System.out.println("Remove : "+queueNodeDouble.removeNodeDouble());
		System.out.println("Remove : "+queueNodeDouble.removeNodeDouble());
		System.out.println("Remove : "+queueNodeDouble.removeNodeDouble());
	}

}
