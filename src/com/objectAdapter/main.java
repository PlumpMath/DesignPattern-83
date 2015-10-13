package com.objectAdapter;

public class main {
	/**
	 * @Description:对象适配器模式：当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Adapter类，持有原类的一个实例，
	 * 在Adapter类的方法中，调用实例的方法就行。
	 * @param @param args   
	 * @return void  
	 * @throws
	 * @author Panyk
	 * @date 2015年10月13日
	 */
	public static void main(String[] args) {
		Target a = new Adapter(new Adaptee());
		a.method1();
		a.method2();
	}
}