package com.decorator;
/**
 * ClassName: main 
 * @Description: װ��ģʽ���Ǹ�һ����������һЩ�µĹ��ܣ������Ƕ�̬�ģ�
 * Ҫ��װ�ζ���ͱ�װ�ζ���ʵ��ͬһ���ӿڣ�װ�ζ�����б�װ�ζ����ʵ����
 * @author Panyk
 * @date 2015��10��13��
 */
public class main {
	public static void main(String[] args) {
		TargetInterface d = new Decorator(new Target());
		d.method1();
	}

}
