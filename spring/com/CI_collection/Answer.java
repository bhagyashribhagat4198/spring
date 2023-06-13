package com.CI_collection;

public class Answer {

	private int id;
	private String ans;
	private String postedby;
	
	
	public Answer(int id, String ans, String postedby) {
		super();
		this.id = id;
		this.ans = ans;
		this.postedby = postedby;
	}
	@Override
	public String toString() {
		return id + " " + ans + " " + postedby;
	}
		
}
