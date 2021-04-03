package com.data_structure;

public class MainDynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DynamicArray<Integer> da = new DynamicArray<Integer>();
//		da.put(4);
//		System.out.println("Size = "+da.getLength());
//		da.put(8);
//		System.out.println("Size = "+da.getLength());
//		da.put(13);
//		System.out.println("Size = "+da.getLength());
//		da.put(11);
//		System.out.println("Size = "+da.getLength());
//		da.put(9);
//		System.out.println("Size = "+da.getLength());
		
		DynamicArray<Student> daStd = new DynamicArray<Student>();
		daStd.put(new Student(1003, "Salima Fortas"));
		System.out.println("Size = "+daStd.getLength());
		System.out.println("ID : "+daStd.getItem(0).getId()+"\t Name : "+daStd.getItem(0).getName());
	}

}
