package com.proxy;
/**
 * ClassName: Main 
 * @Description:代理模式：代理模式就是多一个代理类出来，替原对象进行一些操作
 * 代理模式的应用场景：
	如果已有的方法在使用的时候需要对原有的方法进行改进，此时有两种办法：
	1、修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则。
	2、就是采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是代理模式。
	使用代理模式，可以将功能划分的更加清晰，有助于后期维护！ 
	ps：我感觉对象适配器模式、装饰者模式和代理模式都差不多，哪里出了问题？？？
 * @author Panyk
 * @date 2015年10月13日
 */
public class Main {
	public static void main(String[] args) {
		TargetInterface ti = new Proxy();
		ti.method1();
	}
}
