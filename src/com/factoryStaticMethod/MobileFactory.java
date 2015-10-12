package com.factoryStaticMethod;
/**
 * ClassName: MobileFactory 
 * @Description:静态工厂方法模式：就是将工厂方法模式的静态方法。 
 * @date 2015年10月12日
 */
public class MobileFactory {
	public static Mobile samsunBuild() {
		return new Samsung();
	}
	public static Mobile huaweiBuild() {
		return new Huawei();
	}
}