package com.visitor;

public class MyVisitor implements Visitor {
	@Override
	public void visitor(Subject sub) {
		System.out.println("visit the " + sub.getSubject());
	}
}
