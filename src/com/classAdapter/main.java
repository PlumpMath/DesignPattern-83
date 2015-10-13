package com.classAdapter;

public class main {
	/**
	 * @Description:类适配器模式：当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。
	 * @param @param args   
	 * @return void  
	 * @throws
	 * @author Panyk
	 * @date 2015年10月13日
	 */
	public static void main(String[] args) {
		Target a = new Adapter();
		a.method1();
		a.method2();
	}
}