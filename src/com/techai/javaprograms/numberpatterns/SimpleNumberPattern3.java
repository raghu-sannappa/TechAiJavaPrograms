package com.techai.javaprograms.numberpatterns;

/* 1 2 3 4 
 * 1 2 3 4
 * 1 2 3 4 
 * 1 2 3 4 */
public class SimpleNumberPattern3 {

	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++) {
			int num=1;
			for(int j=0;j<n;j++) {
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
	}

}
