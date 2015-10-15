package com.state;

public class State {
	private String value;
	public void method1(){
		System.out.println("method 1¡£");
	}
	public void method2(){
		System.out.println("method 2¡£");
	}

	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
