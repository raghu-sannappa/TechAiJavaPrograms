package com.techai.javaproject.OneDArrays;

import java.util.Arrays;

public class SortTheArray {

	public static void sortArray(int [] arr) {
		int length = arr.length;
		int temp=0;
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("Sorted Elements Are:");
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		//Arrays.toString()- Will return String representation of array.
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int [] arr = {30,10,20,50,80};
		sortArray(arr);

	}

}
