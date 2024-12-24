package com.techai.javaprogramms.alphabetspatterns;

/* A B C D
 * A B C D
 * A B C D
 * A B C D */
public class SimpleAlphabetPattern1 {

	public static void main(String[] args) {
		
		int n=4;
		
		for(int i=0;i<n;i++) {
			char ch ='A';
			for(int j=0;j<n;j++) {
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}

}
