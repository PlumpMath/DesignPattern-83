package com.objectAdapter;

public class main {
	/**
	 * @Description:����������ģʽ����ϣ����һ������ת����������һ���½ӿڵĶ���ʱ�����Դ���һ��Adapter�࣬����ԭ���һ��ʵ����
	 * ��Adapter��ķ����У�����ʵ���ķ������С�
	 * @param @param args   
	 * @return void  
	 * @throws
	 * @author Panyk
	 * @date 2015��10��13��
	 */
	public static void main(String[] args) {
		Target a = new Adapter(new Adaptee());
		a.method1();
		a.method2();
	}
}