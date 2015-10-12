package com.abstractFactory;

public class HuaweiFactory implements MobileFactory {
	@Override
	public Mobile build() {
		return new Huawei();
	}
}