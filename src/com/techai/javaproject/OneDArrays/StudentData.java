package com.techai.javaproject.OneDArrays;

import java.util.Objects;

public class StudentData {
	int id;
	String name;
	int age;
	
	public StudentData(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentData [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		
		StudentData other = (StudentData) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	
	
	
}
