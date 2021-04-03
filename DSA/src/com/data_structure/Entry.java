package com.data_structure;

public class Entry<T> {

	private int key;
	private T value;
	Entry<T> next;
	public Entry(int key, T value) {
		this.setKey(key);
		this.setValue(value);
		this.next = null;
	}
	public Entry() {
		// TODO Auto-generated constructor stub
		this.next = null;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}

}
