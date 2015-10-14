package com.strategy;

public class Plus extends AbstractCalculator implements CalculatorInterface{
	@Override
	public int calculate(String exp) {
		int[] arrI = this.split(exp, "\\+");
		return arrI[0] + arrI[1];
	}
}