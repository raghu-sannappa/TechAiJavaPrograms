package com.techai.javaprograms.numberpatterns;

/* 4 3 2 1 
 * 4 3 2 1
 * 4 3 2 1 
 * 4 3 2 1 */
public class SimpleNumberPattern5 {

	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++) {
			int num=4;
			for(int j=0;j<n;j++) {
				System.out.print(num-- +"  ");
			}
			System.out.println();
		}

	}

}
