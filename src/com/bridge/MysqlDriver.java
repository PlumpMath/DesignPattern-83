package com.bridge;

public class MysqlDriver implements DriverInterface {
	@Override
	public void connect() {
		System.out.println("mysql connect.");
	}
}
