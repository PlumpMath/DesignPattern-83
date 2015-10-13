package com.decorator;

public class Target implements TargetInterface {
	@Override
	public void method1() {
		System.out.println("被装饰类的方法：method1。");
	}
}