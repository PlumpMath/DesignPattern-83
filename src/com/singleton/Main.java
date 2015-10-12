package com.singleton;

public class Main {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		s.show();
		Singleton1 s1 = Singleton1.getInstance();
		s1.show();
	}
}