package com.CI_basic;

public class Teacher {

	private int id;
	private String name;
	private Address address;
	
	public Teacher(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void show_info() {
		System.out.println(id+" "+name);
		System.out.println(address.toString());
	}
}
