package com.interpreter;
/**
 * ClassName: Main 
 * @Description:解释器模式（Interpreter）：
 * 一般主要应用在OOP开发中的编译器的开发中，所以适用面比较窄。 
 * @author Panyk
 * @date 2015年10月15日
 */
public class Main {
	public static void main(String[] args) {
		//计算9+2-8
		int res = new Minus().interpret(new Context(new Plus().interpret(new Context(9,2)) ,8));
		System.out.println("9+2-8=" + res);
	}
}
