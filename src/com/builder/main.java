package com.builder;

import java.util.List;

public class main {
	public static void main(String[] args) {
		MobileBuilder mb = new MobileBuilder();
		List samsungs = mb.buildSamsungs(10);
		System.out.println("共生产了" + samsungs.size() + "个手机。");
	}
}