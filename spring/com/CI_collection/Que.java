package com.CI_collection;

import java.util.Iterator;
import java.util.List;

public class Que {

	private int id;
	private String que;
	private List<Answer> ans;
	
	public Que(int id, String que, List<Answer> ans) {
		super();
		this.id = id;
		this.que = que;
		this.ans = ans;
	}	
	public void display() {
		System.out.println(id+" "+que);
		
		System.out.println("Answers Are : ");
		Iterator <Answer> itr=ans.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}	
	}	
}
