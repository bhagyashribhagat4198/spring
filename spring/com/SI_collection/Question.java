package com.SI_collection;

import java.util.Iterator;
import java.util.List;

public class Question
{
	private int id;
	private String que;
	private List<String> answer;
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
	public List<String> getAnswer() {
		return answer;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}
	public void show() {
		System.out.println(id+" "+que);
		System.out.println("Answers are: ");
		Iterator<String> itr=answer.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
