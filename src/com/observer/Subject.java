package com.observer;
//被观察对象的接口
public interface Subject {
	//add observer
	public void add(Observer o);
	public void del(Observer o);
	//通知所有观察者
	public void notifyObservers();
	//被观察对象的一些操作
	public void operation();
}
