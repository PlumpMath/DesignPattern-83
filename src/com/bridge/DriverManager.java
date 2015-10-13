package com.bridge;

public abstract class DriverManager {
	private DriverInterface di;
	public void connect(){
		di.connect();
	}
	public DriverInterface getDi() {
		return di;
	}
	public void setDi(DriverInterface di) {
		this.di = di;
	}
}
