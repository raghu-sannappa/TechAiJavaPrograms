package com.techai.javaproject.OneDArrays;

public class SecondLargestElement {
	
	public static void findSecondLargest(int [] arr) {
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
		System.out.println("Second Largest Element in the array is:"+arr[length-2]);
	}
	public static void main(String[] args) {
		int [] arr = {2,3,1,6,4,7,9};
		findSecondLargest(arr);

	}

}
