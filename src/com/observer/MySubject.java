package com.observer;

public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		super.operation();
		System.out.println("被观察者变化：");
		this.notifyObservers();
	}
}