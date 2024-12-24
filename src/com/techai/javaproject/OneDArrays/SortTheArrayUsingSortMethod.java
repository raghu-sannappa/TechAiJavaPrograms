package com.techai.javaproject.OneDArrays;

import java.util.Arrays;

public class SortTheArrayUsingSortMethod {

	public static void sortTheArray(int [] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int [] arr = {50,40,10,20,30};
		sortTheArray(arr);

	}

}
