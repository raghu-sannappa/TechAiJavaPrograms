package com.techai.javaprogramms.alphabetspatterns;

/* D D D D 
 * C C C C 
 * B B B B
 * A A A A */
public class SimpleAlphabetPattern4 {

	public static void main(String[] args) {
		int n=4;
		char ch = 'D';
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(ch +" ");
			}
			System.out.println();
			ch--;
		}

	}

}
