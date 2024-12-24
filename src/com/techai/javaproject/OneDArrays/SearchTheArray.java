package com.techai.javaproject.OneDArrays;

import java.util.Scanner;
public class SearchTheArray {
	
	static Scanner sc = new Scanner(System.in);
	public static boolean searchArray(int [] arr) {
		System.out.println("Enter the number to search");
		int num = sc.nextInt();
		
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				found= true;
				break;
			}
		}
		return found;
	}
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		if(searchArray(arr)) {
			System.out.println("Number found in the array");
		}else {
			System.out.println("Number not found in the array");
		}

	}

}
