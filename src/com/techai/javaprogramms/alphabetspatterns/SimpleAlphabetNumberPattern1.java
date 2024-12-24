package com.techai.javaprogramms.alphabetspatterns;

/* 1 2 3 4 
 * A B C D
 * 1 2 3 4
 * A B C D */
public class SimpleAlphabetNumberPattern1 {

	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++) {
			int num =1;
			char ch ='A';
			for(int j=0;j<n;j++) {
				if(i%2==0) {
					System.out.print(num++ +" ");
				}else {
					System.out.print(ch++ +" ");
				}
			}
			System.out.println();
		}

	}

}
