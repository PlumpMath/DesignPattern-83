package com.observer;

public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		super.operation();
		System.out.println("���۲��߱仯��");
		this.notifyObservers();
	}
}