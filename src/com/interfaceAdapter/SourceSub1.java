package com.interfaceAdapter;

public class SourceSub1 extends Wrapper {
	@Override
	public void method1() {
		super.method1();
		System.out.println("只实现method1方法。");
	}
}