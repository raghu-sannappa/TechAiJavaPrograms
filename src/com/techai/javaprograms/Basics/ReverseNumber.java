package com.techai.javaprograms.Basics;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 12345;
		
		while(num!=0) {
			int last = num % 10;
			System.out.print(last);
			num= num/10;
		}


	}

}
