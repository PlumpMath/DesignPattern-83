package com.responsibility;
/**
 * ClassName: Main 
 * @Description:������ģʽ��Chain of Responsibility����
 * �ж������ÿ��������ж���һ����������ã������ͻ��γ�һ�������������������ϴ��ݣ�ֱ��ĳһ����������������
 * ���Ƿ����߲���������������Ǹ�����ᴦ����������ԣ�������ģʽ����ʵ�֣��������ͻ��˵�����£���ϵͳ���ж�̬�ĵ����� 
 * @author Panyk
 * @date 2015��10��15��
 */
public class Main {
	public static void main(String[] args) {
		MyHandler h1 = new MyHandler("h1");
		MyHandler h2 = new MyHandler("h2");
		MyHandler h3 = new MyHandler("h3");
		h1.setHandler(h2);
		h2.setHandler(h3);
		h1.operator();
	}
}
