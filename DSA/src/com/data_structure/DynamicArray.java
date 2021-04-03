package com.data_structure;

import java.util.Arrays;

public class DynamicArray<T> {
	Object[] data;
	private int size;
	

	public DynamicArray() {
		size = 0;
		data = new Object[1];
	}
	
 	public int getSize() {
		return size;
	}
 	
 	public int getLength() {
		// TODO Auto-generated method stub
 		return data.length;
	}

	public void setSize(int size) {
		this.size = size;
	}
 	
 	@SuppressWarnings("unchecked")
	public T getItem(int index) {
		// TODO Auto-generated method stub
 		return (T)data[index];
	}
 	
 	public void put(Object element) {
		// TODO Auto-generated method stub
 		ensureCapacity(size+1);
 		data[size++] = element; 
	}

 	public void ensureCapacity(int minCapacity) {
		// TODO Auto-generated method stub
 		int oldCapacity = data.length;
 		if (minCapacity>oldCapacity) {
			int newCapacity = oldCapacity*2;
			if (newCapacity<minCapacity) {//delete
				newCapacity = minCapacity;
			}
	 		data = Arrays.copyOf(data,  newCapacity);
		}
	}
}
