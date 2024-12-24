package com.techai.javaprogramms.TwoDArray;

public class SumOfAllElements {

	public static void findSum(int[][]arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum=sum+arr[i][j];
			}
		}
		System.out.println("Sum of All Elements in the Array:"+sum);
	}
	public static void main(String[] args) {
		int[][]arr = {{10,20,30},{40,50},{70,80,90}};
		findSum(arr);

	}

}
