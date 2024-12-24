package com.techai.javaproject.OneDArrays;

public class PrintEvenIndexElements {

	public static void printEvenIndexEle(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println("Even Index Array Elements Are:"+arr[i]);
				System.out.println("arr"+"["+i+"]"+":"+arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		int [] arr = {5,2,4,7,8,3,0,-10};
		printEvenIndexEle(arr);
	}

}
