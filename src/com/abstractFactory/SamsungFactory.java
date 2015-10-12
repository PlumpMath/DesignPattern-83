package com.abstractFactory;

public class SamsungFactory implements MobileFactory {
	@Override
	public Mobile build() {
		return new Samsung();
	}
}