package com.mediator;
/**
 * ClassName: Main 
 * @Description:�н���ģʽ��Mediator�������˽�����ʲôӦ�ó���
 * �н���ģʽҲ��������������֮�����ϵģ���Ϊ�������֮����������ϵ�Ļ��������ڹ��ܵ���չ��ά������ΪֻҪ�޸�һ������
 * ���������Ķ��󶼵ý����޸ġ����ʹ���н���ģʽ��ֻ����ĺ�Mediator��Ĺ�ϵ����������֮��Ĺ�ϵ�����Ƚ���Mediator���У�
 * ���е���spring���������á� 
 * @author Panyk
 * @date 2015��10��15��
 */
public class Main {
	public static void main(String[] args) {
		Mediator m = new MyMediator();
		m.createMediator();
		m.workAll();
	}
}
