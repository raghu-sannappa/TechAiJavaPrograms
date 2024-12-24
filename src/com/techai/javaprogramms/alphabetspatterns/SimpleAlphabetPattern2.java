package com.techai.javaprogramms.alphabetspatterns;

/* A A A A 
 * B B B B
 * C C C C 
 * D D D D */
public class SimpleAlphabetPattern2 {

	public static void main(String[] args) {
		int n=4;
		char ch = 'A';
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++) {
				System.out.print(ch +" ");
			}
			System.out.println();
			ch++;
		}
	}

}
