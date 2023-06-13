package com.SI_collection;

import java.util.Iterator;
import java.util.List;

public class Que 
{
	private int id;
	private String que;
	private List<Answer> ans;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	public List<Answer> getAns() {
		return ans;
	}
	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}
	public void show() {
		System.out.println(id+" "+que);
		System.out.println("answers are : ");
		Iterator <Answer> itr=ans.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
