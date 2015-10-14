package com.template;
public class Main {
	public static void main(String[] args) {
		AbstractCalculator ac = new Plus();
		int res = ac.calculate("3+5", "\\+");
		System.out.println("3+5="+res);
	}
}