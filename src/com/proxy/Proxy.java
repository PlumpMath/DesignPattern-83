package com.proxy;

public class Proxy implements TargetInterface {
	private Target t;
	public Proxy(){
		super();
		this.t = new Target();
	}
	@Override
	public void method1() {
		System.out.println("代理模式开始：");
		t.method1();
		System.out.println("代理模式结束。");
	}
}
