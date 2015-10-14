package com.template;
/**
 * ClassName: AbstractCalculator 
 * @Description:模板方法模式（Template Method）：
 * 解释一下模板方法模式，就是指：一个抽象类中，有一个主方法，再定义1...n个方法，可以是抽象的，
 * 也可以是实际的方法，定义一个类，继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用。 
 * @author Panyk
 * @date 2015年10月14日
 */
public abstract class AbstractCalculator {
	//主方法，实现对本类的其它方法的调用
	public final int calculate(String exp, String opt){
		int[] array = split(exp, opt);
		return this.calculate(array[0], array[1]);
	}
	public abstract int calculate(int num1, int num2);
	private int[] split(String exp, String opt){
		String[] arr = exp.split(opt);
		int[] arrI = new int[2];
		arrI[0] = Integer.parseInt(arr[0]);
		arrI[1] = Integer.parseInt(arr[1]);
		return arrI;
	}
}
