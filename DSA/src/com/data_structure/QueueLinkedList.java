package com.data_structure;

public class QueueLinkedList<T> {
	NodeDouble<T> rear, front;
	
	public QueueLinkedList(NodeDouble<T> head) {
		this.rear = head;
		this.front = head;
	}
	
	public void addNodeDouble(NodeDouble<T> newNodeDouble) {
		// TODO Auto-generated method stub
		rear.next = newNodeDouble;
		newNodeDouble.next = null;
		newNodeDouble.prev = rear;
		rear = newNodeDouble;
	} 
	
	public T removeNodeDouble() {
		// TODO Auto-generated method stub
		if(front.next == null) {
			System.err.println("Sorry your Queue is Empty !!");
			return null;
		}else {
			T value = front.value;
			front = front.next;
			front.prev = null;
			return value;
		}
	}
	

}
