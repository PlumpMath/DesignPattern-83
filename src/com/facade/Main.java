package com.facade;
/**
 * ClassName: Main 
 * @Description:���ģʽ��Facade����
	���ģʽ��Ϊ�˽��������֮�ҵ�������ϵ�ģ���springһ�������Խ������֮��Ĺ�ϵ���õ������ļ��У�
	�����ģʽ���ǽ����ǵĹ�ϵ����һ��Facade�ࣨ��demo����Computer�ࣩ�У�����������֮�����϶ȣ���ģʽ��û���漰���ӿڡ�
	��������һ�����������������Ϊ���� 
 * @author Panyk
 * @date 2015��10��13��
 */
public class Main {
	public static void main(String[] args) {
		Computer c = new Computer();
		c.startup();
		System.out.println("--------------");
		c.shutdown();
	}
}