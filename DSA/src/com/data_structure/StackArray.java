package com.data_structure;

public class StackArray<T> {

	int size, top;
	Object[] arrayStack;

	public StackArray(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		this.arrayStack = new Object[this.size];
		this.top = -1;
	}

	public void push(Object newItem) {
		// TODO Auto-generated method stub
		if (isFull()) {
			System.err.println("Stack is Full!!");
			return;
		}
		top = top + 1;
		arrayStack[top] = newItem;
	}

	@SuppressWarnings("unchecked")
	public T pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.err.println("Stack is Empty!!");
			return null ;
		}
		T item = (T) arrayStack[top];
		top = top - 1;
		return item;
	}

	private Boolean isFull() {
		// TODO Auto-generated method stub
		return (top == size - 1);
	}

	private Boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == -1);
	}

}
