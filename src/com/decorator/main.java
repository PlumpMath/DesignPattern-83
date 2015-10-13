package com.decorator;
/**
 * ClassName: main 
 * @Description: 装饰模式就是给一个对象增加一些新的功能，而且是动态的，
 * 要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例。
 * @author Panyk
 * @date 2015年10月13日
 */
public class main {
	public static void main(String[] args) {
		TargetInterface d = new Decorator(new Target());
		d.method1();
	}

}
