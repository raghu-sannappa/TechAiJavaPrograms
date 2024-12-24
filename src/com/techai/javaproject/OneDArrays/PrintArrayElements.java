package com.techai.javaproject.OneDArrays;

//WAJP Print Elements of the given array
public class PrintArrayElements {

	public static void printArrayEle(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Element at index-"+i+" is:"+arr[i]);
		}
	}
	public static void main(String[] args) {
		int [] arr = {10,20,30};
		printArrayEle(arr);

	}

}
