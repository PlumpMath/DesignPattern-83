package com.classAdapter;

public class main {
	/**
	 * @Description:��������ģʽ����ϣ����һ����ת����������һ���½ӿڵ���ʱ������ʹ�����������ģʽ������һ�����࣬�̳�ԭ�е��࣬ʵ���µĽӿڼ��ɡ�
	 * @param @param args   
	 * @return void  
	 * @throws
	 * @author Panyk
	 * @date 2015��10��13��
	 */
	public static void main(String[] args) {
		Target a = new Adapter();
		a.method1();
		a.method2();
	}
}