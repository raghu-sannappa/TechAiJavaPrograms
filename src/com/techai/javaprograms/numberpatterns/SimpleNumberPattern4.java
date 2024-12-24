package com.techai.javaprograms.numberpatterns;

/* 1 1 1 1 
 * 2 2 2 2 
 * 3 3 3 3 
 * 4 4 4 4 */
public class SimpleNumberPattern4 {

	public static void main(String[] args) {
		int n=4,num=1;
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				System.out.print(num +" ");
			}
			System.out.println();
			num++;
		}

	}

}
