package com.interpreter;
/**
 * ClassName: Main 
 * @Description:������ģʽ��Interpreter����
 * һ����ҪӦ����OOP�����еı������Ŀ����У�����������Ƚ�խ�� 
 * @author Panyk
 * @date 2015��10��15��
 */
public class Main {
	public static void main(String[] args) {
		//����9+2-8
		int res = new Minus().interpret(new Context(new Plus().interpret(new Context(9,2)) ,8));
		System.out.println("9+2-8=" + res);
	}
}
