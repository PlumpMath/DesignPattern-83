package com.normalFactory;
/**
 * ClassName: MobileFactory 
 * @Description:��ͨ����ģʽ������һ�������࣬��ʵ����ͬһ�ӿڵ�һЩ�����ʵ���Ĵ����� 
 * @date 2015��10��12��
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