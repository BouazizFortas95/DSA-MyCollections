package com.data_structure;

public class MainStackArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Stack Array
//		StackArray<Integer> stackArray = new StackArray<Integer>(5);
//		stackArray.push(11);
//		stackArray.push(15);
//		stackArray.push(13);
//		System.out.println("Top is : "+stackArray.top);
//		System.out.println("Pop Top Item : "+stackArray.pop());
//		System.out.println("Top is : "+stackArray.top);
//		
//		System.err.println("--------------------------------------");
		
		//Dynamic Stack Array
		StackDynamicArray<Integer> stackDynamicArray = new StackDynamicArray<Integer>(3);
		stackDynamicArray.push(11);
		stackDynamicArray.push(15);
		stackDynamicArray.push(13);
		System.out.println("Top is : "+stackDynamicArray.top);
		System.out.println("Size is : "+stackDynamicArray.arrayStack.length);
		System.out.println("Pushing..");
		stackDynamicArray.push(22);
		System.out.println("Top is : "+stackDynamicArray.top);
		System.out.println("Size is : "+stackDynamicArray.arrayStack.length);
		System.out.println("Pop Top Item : "+stackDynamicArray.pop());
		System.out.println("Top is : "+stackDynamicArray.top);
		System.out.println("Size is : "+stackDynamicArray.arrayStack.length);
	}

}
