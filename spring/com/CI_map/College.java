package com.CI_map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class College {

	private int id;
	private String name;
	private Map<String , String> branches;
	
	public College(int id, String name, Map<String, String> branches) {
		super();
		this.id = id;
		this.name = name;
		this.branches = branches;
	}	
	public void show() {
		System.out.println(id+" "+name);
		System.out.println("Branches are :");
		Set<Entry<String,String>> m=branches.entrySet();	
		Iterator<Entry<String,String>> itr=m.iterator();	
		while(itr.hasNext()) {		
		Entry<String,String> e=	itr.next();
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}
	
}
