package com.visitor;


public class MySubject implements Subject {
	@Override
	public void accept(Visitor v) {
		v.visitor(this);
	}
	@Override
	public String getSubject() {
		return "love";
	}
}
