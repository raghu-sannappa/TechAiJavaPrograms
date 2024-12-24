package com.techai.javaproject.OneDArrays;

//PrintDuplicate Elements in the array.
public class PrintDuplicatesElements {

	public static void printDuplicates(int [] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
	int [] arr = {1,2,3,2,3,7,7,8,9,4};
	printDuplicates(arr);

	}

}
