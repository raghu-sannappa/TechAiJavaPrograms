package com.techai.javaprograms.Basics;
import java.util.Scanner;
//WAJP to check given character is alphabet of not.
public class AlphabetOrNot {

	public static void checkAlphabetOrNot(char ch) {
		int res = ch;
		System.out.println(res);
		if(res >=65 && res<=90) {
			System.out.println("Given character is Uppercase Alphabet");
		}else if(res >=97 && res <=122) {
			System.out.println("Given charcater is LowerCase Alphabet");
		}else if(res>=48 && res<=57) {
			System.out.println("Given chacracter is Number.");
		}else {
			System.out.println("Given chacrater is special charcter..");
		}
		
		
	}
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the character..");
		char ch = '6';
		
		checkAlphabetOrNot(ch);

	}

}
