package com.SI_collection;

public class Answer {

	private int id;
	private String ans;
	private String postedby;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public String getPostedby() {
		return postedby;
	}
	public void setPostedby(String postedby) {
		this.postedby = postedby;
	}
	@Override
	public String toString() {
		return id+" "+ans+" "+postedby;
	}
	
	
}
