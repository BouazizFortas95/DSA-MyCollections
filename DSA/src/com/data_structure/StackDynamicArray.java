package com.data_structure;

import java.util.Arrays;

public class StackDynamicArray<T> {
	int size, top;
	Object[] arrayStack;
	public StackDynamicArray(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		this.arrayStack = new Object[this.size];
		this.top = -1;
	}

	public void push(Object newItem) {
		// TODO Auto-generated method stub
		/*if (isFull()) {
			System.err.println("Stack is Full!!");
			return;
		}*/
		ensureCapacity(top+2);
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

//	private Boolean isFull() {
//		// TODO Auto-generated method stub
//		return (top == size - 1);
//	}

	private Boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == -1);
	}
	
	public void ensureCapacity(int minCapacity) {
		// TODO Auto-generated method stub
 		int oldCapacity = arrayStack.length;
 		if (minCapacity>oldCapacity) {
			int newCapacity = oldCapacity*2;
			if (newCapacity<minCapacity) {//delete
				newCapacity = minCapacity;
			}
	 		arrayStack = Arrays.copyOf(arrayStack,  newCapacity);
		}
	}
}
