package com.facade;
/**
 * ClassName: Main 
 * @Description:外观模式（Facade）：
	外观模式是为了解决类与类之家的依赖关系的，像spring一样，可以将类和类之间的关系配置到配置文件中，
	而外观模式就是将他们的关系放在一个Facade类（本demo中是Computer类）中，降低了类类之间的耦合度，该模式中没有涉及到接口。
	（我们以一个计算机的启动过程为例） 
 * @author Panyk
 * @date 2015年10月13日
 */
public class Main {
	public static void main(String[] args) {
		Computer c = new Computer();
		c.startup();
		System.out.println("--------------");
		c.shutdown();
	}
}