package com.SI_map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int id;
	private String que;
	private Map<String , String> ans;
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
	public Map<String, String> getAns() {
		return ans;
	}
	public void setAns(Map<String, String> ans) {
		this.ans = ans;
	}
	public void show() {
		System.out.println(id+" "+que);
		System.out.println("answers Are :  ");
		Set<Entry <String,String>> e=ans.entrySet();
		Iterator<Entry<String,String>> itr=e.iterator();
		
		while(itr.hasNext()) {
			Entry <String ,String> a=itr.next();
			System.out.println("Answer is : "+a.getKey()+" Posted By : "+a.getValue());
		}
	}
}
