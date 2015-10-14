package com.strategy;
//¸¨ÖúÀà
public class AbstractCalculator {
	public int[] split(String exp, String opt){
		String[] array = exp.split(opt);
		int[] arrInt = new int[2];
		arrInt[0] = Integer.parseInt(array[0].trim());
		arrInt[1] = Integer.parseInt(array[1].trim());
		return arrInt;
	}
}
