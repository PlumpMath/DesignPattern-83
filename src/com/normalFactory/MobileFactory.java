package com.normalFactory;
/**
 * ClassName: MobileFactory 
 * @Description:普通工厂模式：建立一个工厂类，对实现了同一接口的一些类进行实例的创建。 
 * @date 2015年10月12日
 */
public class MobileFactory {
	public Mobile build(String type){
		if(type.equals("Samsung")){
			return new Samsung();
		}else if(type.equals("Huawei")){
			return new Huawei();
		}
		return null;
	}
}