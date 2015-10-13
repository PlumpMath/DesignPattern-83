package com.objectAdapter;

public class Adapter implements Target {
	private Adaptee adaptee;
	public Adapter(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	@Override
	public void method1() {
		adaptee.method1();
	}
	@Override
	public void method2() {
		System.out.println("适配器类中实现被适配对象没有的方法：method2。");
	}
}