package com.basic;

public class Student 
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void student_info() {
		System.out.println("Hello !! "+name);
	}
}
