package com.observer;

import java.util.Iterator;
import java.util.Vector;

public class AbstractSubject implements Subject {
	private Vector<Observer> vector = new Vector<Observer>();
	@Override
	public void add(Observer o) {
		vector.add(o);
	}

	@Override
	public void del(Observer o) {
		vector.remove(o);
	}

	@Override
	public void notifyObservers() {
		Iterator i = vector.iterator();
		while(i.hasNext()){
			Observer o = (Observer)i.next();
			o.update();
		}
	}

	@Override
	public void operation() {
	}
}
