package com.techai.javaprograms.Basics;

public class FindLargestOfThreeNumbers {

	
	public static void main(String[] args) {
		int a=50,b=20,c=30,d=100;
		int res = findLargest(a,b,c,d);
		System.out.println("Largest of 3 numbers is: "+res);
		

	}
	
	public static int findLargest(int x,int y,int z,int t) {
		if(x>y && x>z && x>t) {
			return x;
		}else if(y>x && y>z && y>t) {
			return y;
		}else if(z>x && z>y && z>t) {
			return z;
		}
		else{
			return t;
		}
	}

}
