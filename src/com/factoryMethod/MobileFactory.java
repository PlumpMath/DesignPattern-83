package com.factoryMethod;
/**
 * ClassName: MobileFactory 
 * @Description:��������ģʽ���Ƕ���ͨ��������ģʽ�ĸĽ���ͨ����ͬ�ķ�����������ͬ�Ķ����������Ա��⴫���˴���Ĳ�����������Ķ��� 
 * @date 2015��10��12��
 */
public class MobileFactory {
	public Mobile samsunBuild() {
		return new Samsung();
	}
	public Mobile huaweiBuild() {
		return new Huawei();
	}
}