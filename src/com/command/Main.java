package com.command;
/**
 * ClassName: Main 
 * @Description:����ģʽ��Command���� 
 * ����ģʽ�ܺ���⣬�ٸ����ӣ�˾��Ա������ʿ��ȥ�ɼ����飬����������ĽǶ������ǣ�
 * ˾��Ա�������ǣ����������������ݣ�������ʿ�������ʿ��ȥִ�С�
 * ������̺��ڣ������໥����κ�һ��������ȥ���������ˣ�ֻ��Ҫ�����Լ����¶����У�
 * ˾��ԱҪ���ǽ��������ȥ��ע����ʿ������ôʵ�ֵġ�
 * @author Panyk
 * @date 2015��10��15��
 */
public class Main {
	public static void main(String[] args) {
		Receiver r = new Receiver();
		Command c = new MyCommand(r);
		Invoker i = new Invoker(c);
		i.action();
	}
}
