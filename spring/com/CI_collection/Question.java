package com.CI_collection;

import java.util.Iterator;
import java.util.List;

public class Question {

	private int id;
	private String que;
	private List<String> ans;
	public Question(int id, String que, List<String> ans) {
		super();
		this.id = id;
		this.que = que;
		this.ans = ans;
	}
	public void display_info() {	
		System.out.println(id+" "+que);
		System.out.println("Answers are : ");
		Iterator <String>  itr=ans.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}	
	}	
}
