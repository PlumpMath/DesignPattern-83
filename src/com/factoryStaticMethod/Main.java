package com.factoryStaticMethod;

public class Main {
	public static void main(String[] args) {
		Mobile samsung = MobileFactory.samsunBuild();
		Mobile huawei = MobileFactory.huaweiBuild();
		samsung.runFunc();
		huawei.runFunc();
	}
}