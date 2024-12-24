package com.techai.javaproject.OneDArrays;

//WAJP to print even numbers in the given array
public class EvenNumbersInArray {

	public static void printEvenNumbers(int [] arr) {
		System.out.print("Even Numbers in the given array is:");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print("["+arr[i]+"]");
			}
		}
	}
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8};
		printEvenNumbers(arr);
	}

}
