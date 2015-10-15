package com.interpreter;

public class Minus implements Expression {
	@Override
	public int interpret(Context c) {
		return c.getNum1() - c.getNum2();
	}
}