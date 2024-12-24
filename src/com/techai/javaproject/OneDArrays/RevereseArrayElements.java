package com.techai.javaproject.OneDArrays;

//WAJP to print array elements in reverese order
public class RevereseArrayElements {

	public static void printInReverseOrder(int [] arr) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(" "+arr[i]);
		}
	}
	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50};
		printInReverseOrder(arr);
	}

}
