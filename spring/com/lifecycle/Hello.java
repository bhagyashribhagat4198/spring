package com.lifecycle;

public class Hello 
{
private String msg;

public void getMsg() {
	System.out.println("Message : "+msg);
}

public void setMsg(String msg) {
	this.msg = msg;
}
public void init() 
{
	System.out.println("Bean is initialized");
}
public void destroy()
{
	System.out.println("Bean is destroy");
}
}
