package com.techai.javaprograms.numberpatterns;

/* 4 4 4 4
 * 3 3 3 3 
 * 2 2 2 2
 * 1 1 1 1 */
public class SimpleNumberPattern6 {

	public static void main(String[] args) {
		int n=4,num=4;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(num +" ");
			}
			System.out.println();
			num--;
		}

	}

}
