package com.observer;
//���۲����Ľӿ�
public interface Subject {
	//add observer
	public void add(Observer o);
	public void del(Observer o);
	//֪ͨ���й۲���
	public void notifyObservers();
	//���۲�����һЩ����
	public void operation();
}
