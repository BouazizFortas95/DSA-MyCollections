package com.data_structure;

public class HashTable<T> {
	@SuppressWarnings("rawtypes")
	Entry[] arrayHash;
	int size;
	public HashTable(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		arrayHash = new Entry[this.size];
		for (int i = 0; i < arrayHash.length; i++) {
			arrayHash[i] = new Entry<T>();
		}
	}
	public int generateHash(int key) {
		// TODO Auto-generated method stub
		return key%size;
	}

	@SuppressWarnings("unchecked")
	public void put(int key, T value) {
		// TODO Auto-generated method stub
		int index = generateHash(key);
		Entry<T> arrVal = arrayHash[index];
		Entry<T> newItem = new Entry<T>(key, value);
		newItem.next = arrVal.next;
		arrVal.next = newItem;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int key) {
		// TODO Auto-generated method stub
		T value = null;
		int index = generateHash(key);
		Entry<T> arrVal = arrayHash[index];
		while (arrVal != null) {
			if (arrVal.getKey() == key) {
				value = arrVal.getValue();
				break;
			}
			arrVal = arrVal.next;
		}
		return value;
	}

}
