package com.techai.javaprogramms.alphabetspatterns;

/* 1 A 1 A 
 * 2 B 2 B
 * 3 C 3 C
 * 4 D 4 D */
public class SimpleAlphabetNumberPattern2 {

	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++) {
			int num=i+1; // Start the number based on the row index
			char ch = (char) ('A' + i); // Start the character based on the row index
			for(int j=0;j<n;j++) {
				if(j%2==0) {
					System.out.print(num +" ");
				}else {
					System.out.print(ch +" ");
				}
			}
			System.out.println();
		}
	}

}
