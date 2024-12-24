package com.techai.javaproject.OneDArrays;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp1= new Employee(101,"Raghu");
		Employee emp2= new Employee(102,"Manju");
		Employee emp3= new Employee(103,"Ram");
		
		Employee [] emp = {emp1,emp2,emp3};
		for(int i=0;i<=emp.length-1;i++) {
			System.out.println(emp[i]);
		}
		
		
		
	}

}
