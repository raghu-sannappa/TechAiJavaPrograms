package com.techai.javaprogramms.alphabetspatterns;

/* D C B A 
 * D C B A
 * D C B A
 * D C B A */
public class SimpleAlphabetPattern3 {

	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++) {
			char ch = 'D';
			for(int j=0;j<n;j++) {
				System.out.print(ch-- +" ");
			}
			System.out.println();
		}

	}

}
