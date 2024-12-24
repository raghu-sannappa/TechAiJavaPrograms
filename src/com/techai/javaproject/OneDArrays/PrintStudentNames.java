package com.techai.javaproject.OneDArrays;
import java.util.Scanner;

//WAJP to read 5 student names from user and print it.
public class PrintStudentNames {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		String []studentName = new String[5]; 
		int length= studentName.length;
		
		for(int i=0;i<length;i++) {
			System.out.println("Enter the student name:");
			String names=sc.nextLine();
			studentName[i]=names;
			
		}
		System.out.println("Five Student Names Entered By User is-");
		System.err.println("=====================================");
		for(int i=0;i<length;i++) {
			System.out.println(studentName[i]);
		}
		

	}

}
