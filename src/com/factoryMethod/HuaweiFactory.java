package com.factoryMethod;

public class HuaweiFactory implements MobileFactory {
	@Override
	public Mobile build() {
		return new Huawei();
	}
}