package com.techai.javaprograms.Basics;

import java.util.Scanner;
public class DingaWedsDinge {

	public static void checkDinagDingeWedding(int input) {
		
		if(input % 3==0 && input % 5==0) {
			System.out.println("Dinga Weds Dinge");
			
		}else if(input % 3==0) {
			System.out.println("Dinge");
		}else if(input % 5==0) {
			System.out.println("Dinga");
		}else {
			System.out.println("BreakUp");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number.");
		int input = sc.nextInt();
		checkDinagDingeWedding(input);
	}

}
