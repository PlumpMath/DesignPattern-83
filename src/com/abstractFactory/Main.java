package com.abstractFactory;

public class Main {
	public static void main(String[] args) {
		SamsungFactory fac = new SamsungFactory();
		Mobile samsung = fac.build();
		samsung.runFunc();
	}
}