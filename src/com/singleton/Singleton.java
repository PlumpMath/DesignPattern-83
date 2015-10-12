package com.singleton;
//����ģʽ
public class Singleton {
	//˽�о�̬ʵ������ֹ�����á���ֵnull���ӳټ���
	private static Singleton instance = null;
	//˽�й��췽������ֹ��ʵ�����������ڲ������Ե���private���췽������ʵ���������������಻��new��ֻ��ͨ��getInstance����ø��ࣩ
	private Singleton(){
		System.out.println("private Singleton");
	}
	//����1�����ַ����ܹ�ʵ�ֵ����������ڶ��̻߳����У��϶�������⣬����������Ҫ�ڷ����������synchronized��
	/*
	public static synchronized Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	*/
	/*����2������1����ʵ�ֵ��������ǣ�synchronized�ؼ�����ס������������������÷����������ϻ������½���
	��Ϊÿ�ε���getInstance()����Ҫ�Զ�����������ʵ�ϣ�ֻ���ڵ�һ�δ��������ʱ����Ҫ������֮��Ͳ���Ҫ�ˣ����ԣ�����ط���Ҫ�Ľ���
	*/
	//˫�ؼ������
	public static Singleton getInstance(){
		if(instance == null){
			synchronized(Singleton.class){
				if(instance == null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	//����ö����������л������Ա�֤���������л�ǰ�󱣳�һ��
	public Object readResolve(){
		return instance;
	}
	//һ����ͨ����
	public void show(){
		System.out.println("singleton show��");
	}
}
