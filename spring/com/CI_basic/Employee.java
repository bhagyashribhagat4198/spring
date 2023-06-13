package com.CI_basic;

public class Employee 
{
	private int id;
	private String name;

	Employee(int id)
	{
		this.id=id;	
	}
	Employee(String name)
	{
		this.name=name;
	}
	Employee(int id , String name)
	{
		this.id=id;
		this.name=name;
	}
	public void employee_info()
	{
		System.out.println(id+" "+name);
	}
}
