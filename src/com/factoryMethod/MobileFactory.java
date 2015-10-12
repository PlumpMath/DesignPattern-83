package com.factoryMethod;
/**
 * ClassName: MobileFactory 
 * @Description:工厂方法模式：是对普通工厂方法模式的改进，通过不同的方法来创建不同的对象，这样可以避免传递了错误的参数创建错误的对象。 
 * @date 2015年10月12日
 */
public class MobileFactory {
	public Mobile samsunBuild() {
		return new Samsung();
	}
	public Mobile huaweiBuild() {
		return new Huawei();
	}
}