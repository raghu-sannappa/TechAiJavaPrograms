package com.techai.javaproject.OneDArrays;

public class FindAverageArrayElements {

	public static void main(String[] args) {
		
		int sum = 0;
		double average = 0.0;
		int [] arr = {10,20,30,40,50};
		for(int i=0;i<arr.length;i++) {
			
			 sum= sum + arr[i];
			 
		}
		average = sum/arr.length;
		System.out.println("Avrage of all elements from array is:"+average);
	}

}
