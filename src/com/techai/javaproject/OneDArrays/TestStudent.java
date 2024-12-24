package com.techai.javaproject.OneDArrays;


import java.util.Scanner;
public class TestStudent {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
			System.out.println("Enter the Number of Students-");
			int n = sc.nextInt();
			sc.nextLine(); // Consume newline
			
			// Array to store StudentData objects
			StudentData[]students = new StudentData[n];
			readStudentDetails(sc,students);
			printDetails(students);
			
	}
	
	public static void readStudentDetails(Scanner sc,StudentData[] students) {
		 for (int i = 0; i < students.length; i++) {
	            System.out.println("Enter details for Student " + (i + 1) + ":");
	            
	            System.out.print("Enter Student ID: ");
	            int id = sc.nextInt();
	            sc.nextLine(); // Consume newline
	            
	            System.out.print("Enter Student Name: ");
	            String name = sc.nextLine();
	            
	            System.out.print("Enter Student Age: ");
	            int age = sc.nextInt();
	            sc.nextLine(); // Consume newline
	            
	            // Create and store StudentData object
	            students[i] = new StudentData(id, name, age);
	        }
		 
		 
	}
	
	public static void printDetails(StudentData[] students) {
		for(int i=0;i<students.length;i++) {
			 if(students[i].name.equalsIgnoreCase("sheela")) {
				 System.out.println(students[i]);
			 }
		 }
	}
	
	

}
