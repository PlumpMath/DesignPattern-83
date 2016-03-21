package com.factoryMethod;

public class Main {
	public static void main(String[] args) {
		MobileFactory fac = new SamsungFactory();
		Mobile samsung = fac.build();
		samsung.runFunc();
	}
}