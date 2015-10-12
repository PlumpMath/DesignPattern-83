package com.singleton;
/**
 * ClassName: Singleton1 
 * @Description:��̬�ڲ��� 
 * @author Panyk
 * @date 2015��10��12��
 */
public class Singleton1 {
	private static class SingletonFactory{
		private static final Singleton1 instance = new Singleton1();
	}
	private Singleton1(){
		System.out.println("Singleton 1");
	}
	public static final Singleton1 getInstance(){
		return SingletonFactory.instance;
	}
	public void show(){
		System.out.println("singleton1 show");
	}
}