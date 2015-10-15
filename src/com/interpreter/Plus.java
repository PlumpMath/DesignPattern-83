package com.interpreter;

public class Plus implements Expression {
	@Override
	public int interpret(Context c) {
		return c.getNum1() + c.getNum2();
	}

}
