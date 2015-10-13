package com.proxy;

public class Target implements TargetInterface {
	@Override
	public void method1() {
		System.out.println("被代理类的方法：method1。");
	}
}