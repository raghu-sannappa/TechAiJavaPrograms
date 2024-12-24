package com.techai.javaproject.OneDArrays;

//WAJP to count and print prime numbers in the array
public class CountPrimeNumbers {

	public static boolean countPrimeNumbers(int num) {
		
		int count=0;
		int first=1;
	
			while(first<=num) {
				if(num% first == 0) {
					count++;
				}
				first++;
			}
			//System.out.println(count);	
			if(count==2) {
				return true;
			}else {
				return false;
			}
	 }
	
		
	public static void main(String[] args) {
		
		int count2=0;
		int [] arr = {2,3,4,5,6,7,8,9};
		for(int i=0;i<arr.length;i++) {
			if(countPrimeNumbers(arr[i])) {
				count2++;
			}
		}
		System.out.println("Total Count of Prime Numbers in the array is:"+count2);
		
	}

}
