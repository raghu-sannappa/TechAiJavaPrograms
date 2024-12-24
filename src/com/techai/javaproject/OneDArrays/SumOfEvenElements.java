package com.techai.javaproject.OneDArrays;

public class SumOfEvenElements {

	public static int sumOfEvenEle(int [] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum = sum+arr[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		int res = sumOfEvenEle(arr);
		System.out.println("Sum of Even Elements in the array is:"+res);
	}

}
