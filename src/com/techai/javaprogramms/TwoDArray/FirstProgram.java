package com.techai.javaprogramms.TwoDArray;

public class FirstProgram {

	public static void printArray(int [][] arr) {
		for(int i=0;i<arr.length;i++) {
			//arr[i].length because if content of array is uneven 
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int [][] arr  = {{10,20,30},{40,50},{70,80,90}};
		printArray(arr);

	}

}
