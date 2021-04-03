package com.dsa.search;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 1000000;
		int []numbers = new int[size];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
		}
		int tries = 0;
		int search = 1111;
		for (int i = 0; i < numbers.length; i++) {
			tries++;
			if (numbers[i] == search) {
				System.out.println("Number is Found");
				System.out.println("Number Tries : "+tries+" try.");
				break;
			}
		}
		
	}

}
