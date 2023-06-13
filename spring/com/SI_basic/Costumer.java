package com.SI_basic;

public class Costumer {

	private int id;
	private String name;
	private Product product;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}	
	public void show() {
		System.out.println(id+" "+name);
		System.out.println(product);
	}
}
