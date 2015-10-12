package com.singleton;
//懒汉模式
public class Singleton {
	//私有静态实例，防止被引用。赋值null，延迟加载
	private static Singleton instance = null;
	//私有构造方法，防止被实例化（本类内部还可以调用private构造方法进行实例化，但是其他类不能new，只能通过getInstance来获得该类）
	private Singleton(){
		System.out.println("private Singleton");
	}
	//方法1：这种方法能够实现单例，但是在多线程环境中，肯定会出问题，所以我们需要在方法名上添加synchronized。
	/*
	public static synchronized Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	*/
	/*方法2：方法1可以实现单例。但是，synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下降，
	因为每次调用getInstance()，都要对对象上锁，事实上，只有在第一次创建对象的时候需要加锁，之后就不需要了，所以，这个地方需要改进。
	*/
	//双重检查锁定
	public static Singleton getInstance(){
		if(instance == null){
			synchronized(Singleton.class){
				if(instance == null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	//如果该对象被用于序列化，可以保证对象在序列化前后保持一致
	public Object readResolve(){
		return instance;
	}
	//一个普通方法
	public void show(){
		System.out.println("singleton show。");
	}
}
