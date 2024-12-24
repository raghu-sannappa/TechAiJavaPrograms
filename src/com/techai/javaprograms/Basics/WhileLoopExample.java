package com.techai.javaprograms.Basics;

public class WhileLoopExample {

	public static void main(String[] args) {
		int num =1;
		while(num<=5) {
			if(num==4) {
				System.out.println("Dinag");
				
			}else if(num==5) {
				break;
			}
			System.out.println(num);
			num++;
		}
		System.out.println("---------------------");
		

	}

}
