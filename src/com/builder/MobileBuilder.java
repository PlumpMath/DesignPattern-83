package com.builder;

import java.util.ArrayList;
import java.util.List;
/**
 * ClassName: MobileBuilder 
 * @Description: 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象。
 * 所谓复合对象就是指某个类具有不同的属性，其实建造者模式就是前面抽象工厂模式和最后的Test结合起来得到的。
 * @date 2015年10月13日
 */
public class MobileBuilder {
	private List<Mobile> mL = new ArrayList<Mobile>();
	
	public List buildSamsungs(int count){
		int i=0;
		while(i++ < count){
			mL.add(new Samsung());
		}
		return mL;
	}
}
