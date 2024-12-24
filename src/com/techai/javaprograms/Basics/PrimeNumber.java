package com.techai.javaprograms.Basics;

public class PrimeNumber {

	public static int isPrime(int num) {
		int count =0,first=1;
		while(first<=num) {
			if(num%first==0) {
				count++;
			}
			first++;
		}
		return count;
		
	}
	public static void main(String[] args) {
		int num =4;
		int res = isPrime(num);
		if(res==2) {
			System.out.println("Given number is prime.");
		}else {
			System.out.println("Given number is not prime.");
		}

	}

}
