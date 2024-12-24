package com.techai.javaproject.OneDArrays;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int [] arr = {20,10,50,40,30};
		int [] arr1 = Arrays.copyOf(arr, arr.length);
		
	
		System.out.println("First Array:"+Arrays.toString(arr));
		System.out.println("Second Array:"+Arrays.toString(arr1));

	}

}
