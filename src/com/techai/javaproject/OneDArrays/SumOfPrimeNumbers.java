package com.techai.javaproject.OneDArrays;

public class SumOfPrimeNumbers {

	public static boolean sumOfPrimeNumber(int num) {
		int count=0;
		int first=1;
		
		while(first<=num) {
			if(num % first==0) {
				count++;
			}
			first++;
		}
		if(count==2) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		int [] arr = {2,3,4,5,6,7,8,9,11};
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			if(sumOfPrimeNumber(arr[i])) {
				sum = sum + arr[i];
			}
		}
		System.out.println("Sum of Prime Numbers is:"+sum);
	}

}
