package com.techai.javaproject.OneDArrays;

public class SumOfSmallestAndLargest {
	
	public static int findSmallest(int [] arr) {
		int small = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small){
				small=arr[i];
			}
		}
		return small;
	}
		public static int findLargest(int [] arr) {
			int large = arr[0];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>large) {
					large=arr[i];
				}
			}
			return large;
		}
	
	public static void main(String[] args) {
	int [] arr = {20,40,30,20,50};
	int Min = findSmallest(arr);
	int Max = findLargest(arr);
	int res = Min+Max;
	System.out.println("Sum Of Smallest and Largest is:"+res);
	}

}
