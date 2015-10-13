package com.bridge;

public class OracleDriver implements DriverInterface {
	@Override
	public void connect() {
		System.out.println("oracle connect.");
	}
}
