package com.observer;
/**
 * ClassName: Main 
 * @Description:观察者模式（Observer）：
 * 当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化！对象之间是一种一对多的关系。
 * MySubject类就是我们的主对象，Observer1和Observer2是依赖于MySubject的对象，
 * 当MySubject变化时，Observer1和Observer2必然变化。AbstractSubject类中定义着需要监控的对象列表，
 * 可以对其进行修改：增加或删除被监控对象，且当MySubject变化时，负责通知在列表内存在的对象。 
 * @author Panyk
 * @date 2015年10月14日
 */
public class Main {
	public static void main(String[] args) {
		Subject s = new MySubject();
		s.add(new Observer1());
		s.add(new Observer2());
		s.operation();
	}
}
