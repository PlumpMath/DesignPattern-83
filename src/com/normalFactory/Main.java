package com.normalFactory;

public class Main {
	public static void main(String[] args) {
		MobileFactory mf = new MobileFactory();
		Mobile samsung = mf.build("Samsung");
		Mobile huawei = mf.build("Huawei");
		samsung.runFunc();
		huawei.runFunc();
	}
}