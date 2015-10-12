package com.factoryMethod;

public class Main {
	public static void main(String[] args) {
		MobileFactory mf = new MobileFactory();
		Mobile samsung = mf.samsunBuild();
		Mobile huawei = mf.huaweiBuild();
		samsung.runFunc();
		huawei.runFunc();
	}
}