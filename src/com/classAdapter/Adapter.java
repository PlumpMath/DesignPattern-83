package com.classAdapter;

public class Adapter extends Adaptee implements Target {
	@Override
	public void method2() {
		System.out.println("在适配器中实现被适配对象没有的方法：method2。");
	}
}
