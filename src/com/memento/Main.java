package com.memento;
/**
 * ClassName: Main 
 * @Description:备忘录模式（Memento）：
 * 主要目的是保存一个对象的某个状态，以便在适当的时候恢复对象，个人觉得叫备份模式更形象些，
 * Original类是原始类，里面有需要保存的属性value及创建一个备忘录类，用来保存value值。
 * Memento类是备忘录类，Storage类是存储备忘录的类，持有Memento类的实例，该模式很好理解。 
 * @author Panyk
 * @date 2015年10月15日
 */
public class Main {
	public static void main(String[] args) {
		//创建原始类
		Original o = new Original("egg");
		//创建备忘录
		Storage s = new Storage(o.createMemento());
		//修改原始类值
		System.out.println("原始值="+o.getValue());
		o.setValue("new value");
		System.out.println("更新值="+o.getValue());
		//恢复原始值
		o.restoreMemento(s.getMemento());
		System.out.println("恢复值=" + o.getValue());
	}
}
