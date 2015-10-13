package com.decorator;

public class Decorator implements TargetInterface{
	private TargetInterface t;
	public Decorator(Target t) {
		super();
		this.t = t;
	}
	public void method1(){
		System.out.println("decorator method begin:");
		t.method1();
		System.out.println("decorator method end.");
	}
}
