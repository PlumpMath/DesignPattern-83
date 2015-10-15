package com.memento;
/**
 * ClassName: Main 
 * @Description:����¼ģʽ��Memento����
 * ��ҪĿ���Ǳ���һ�������ĳ��״̬���Ա����ʵ���ʱ��ָ����󣬸��˾��ýб���ģʽ������Щ��
 * Original����ԭʼ�࣬��������Ҫ���������value������һ������¼�࣬��������valueֵ��
 * Memento���Ǳ���¼�࣬Storage���Ǵ洢����¼���࣬����Memento���ʵ������ģʽ�ܺ���⡣ 
 * @author Panyk
 * @date 2015��10��15��
 */
public class Main {
	public static void main(String[] args) {
		//����ԭʼ��
		Original o = new Original("egg");
		//��������¼
		Storage s = new Storage(o.createMemento());
		//�޸�ԭʼ��ֵ
		System.out.println("ԭʼֵ="+o.getValue());
		o.setValue("new value");
		System.out.println("����ֵ="+o.getValue());
		//�ָ�ԭʼֵ
		o.restoreMemento(s.getMemento());
		System.out.println("�ָ�ֵ=" + o.getValue());
	}
}
