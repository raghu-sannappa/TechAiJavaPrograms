package com.techai.javaproject.OneDArrays;

public class Employee {
	int id;
	String name;
	
	
	public Employee(int id,String name){
		this.id= id;
		this.name=name;
	}
	
	public void display() {
		System.out.println("Employee id:"+id);
		System.out.println("Employee name:"+name);
	}

}
