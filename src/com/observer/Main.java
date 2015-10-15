package com.observer;
/**
 * ClassName: Main 
 * @Description:�۲���ģʽ��Observer����
 * ��һ������仯ʱ�����������ö���Ķ��󶼻��յ�֪ͨ���������ű仯������֮����һ��һ�Զ�Ĺ�ϵ��
 * MySubject��������ǵ�������Observer1��Observer2��������MySubject�Ķ���
 * ��MySubject�仯ʱ��Observer1��Observer2��Ȼ�仯��AbstractSubject���ж�������Ҫ��صĶ����б�
 * ���Զ�������޸ģ����ӻ�ɾ������ض����ҵ�MySubject�仯ʱ������֪ͨ���б��ڴ��ڵĶ��� 
 * @author Panyk
 * @date 2015��10��14��
 */
public class Main {
	public static void main(String[] args) {
		Subject s = new MySubject();
		s.add(new Observer1());
		s.add(new Observer2());
		s.operation();
	}
}
