package com.autowiring;

public class A {

	B b;
	
	A(){
		System.out.println("A is created ");
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}	
	void show() {
		System.out.println("A class method");
	}
	void display() {
		show();
		b.show();
	}
}
