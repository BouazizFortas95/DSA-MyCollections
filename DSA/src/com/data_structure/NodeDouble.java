package com.data_structure;

public class NodeDouble<T> {
	T value;
	NodeDouble<T> next;
	NodeDouble<T> prev;
	public NodeDouble(T value, NodeDouble<T> next, NodeDouble<T> prev) {
		// TODO Auto-generated constructor stub
		this.value = value;
		this.next = next;
		this.prev = prev;
	}
}
