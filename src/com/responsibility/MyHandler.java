package com.responsibility;

public class MyHandler extends AbstractHandler implements Handler{
	private String name;
	public MyHandler(String name) {
		super();
		this.name = name;
	}
	@Override
	public void operator() {
		System.out.println(name + " deal!");
		if(this.getHandler() != null){
			this.getHandler().operator();
		}
	}
}
