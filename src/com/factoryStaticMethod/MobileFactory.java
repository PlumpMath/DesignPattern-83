package com.factoryStaticMethod;
/**
 * ClassName: MobileFactory 
 * @Description:��̬��������ģʽ�����ǽ���������ģʽ�ľ�̬������ 
 * @date 2015��10��12��
 */
public class MobileFactory {
	public static Mobile samsunBuild() {
		return new Samsung();
	}
	public static Mobile huaweiBuild() {
		return new Huawei();
	}
}