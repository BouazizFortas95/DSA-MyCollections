package com.data_structure;

public class SimpleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// One Dimension Array
		int[] num = new int[5];
		num[0] = 11;
		num[1] = 14;
		num[2] = 12;
		num[3] = 15;
		num[4] = 10;
		for (int i = 0; i < num.length; i++) {
			System.out.println("Number[" + i + "] = " + num[i]);
		}

		// Array Of Objects
		Student[] std = new Student[3];
		std[0] = new Student(1000, "Bouaziz Fortas");
		std[1] = new Student(1001, "Muhamed Fortas");
		std[2] = new Student(1002, "Wafa Fortas");
		
		for (int i = 0; i < std.length; i++) {
			System.out.println("Student[" + i + "] = {ID : " + std[i].getId()+", Name : "+std[i].getName()+"}");
		}
		
		// One Dimension Array
		int[][] arr_2d = new int[3][3];
		arr_2d[0][0] = 11;
		arr_2d[0][1] = 12;
		arr_2d[0][2] = 12;
		arr_2d[1][0] = 21;
		arr_2d[1][1] = 22;
		arr_2d[1][2] = 23;
		arr_2d[2][0] = 31;
		arr_2d[2][1] = 32;
		arr_2d[2][2] = 33;
		for (int i = 0; i < arr_2d.length; i++) {
			for (int j = 0; j < arr_2d.length; j++) {
				System.out.print(arr_2d[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
