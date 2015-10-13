package com.builder;

import java.util.ArrayList;
import java.util.List;
/**
 * ClassName: MobileBuilder 
 * @Description: ������ģʽ�ṩ���Ǵ����������ģʽ����������ģʽ���ǽ����ֲ�Ʒ�����������й��������������϶���
 * ��ν���϶������ָĳ������в�ͬ�����ԣ���ʵ������ģʽ����ǰ����󹤳�ģʽ������Test��������õ��ġ�
 * @date 2015��10��13��
 */
public class MobileBuilder {
	private List<Mobile> mL = new ArrayList<Mobile>();
	
	public List buildSamsungs(int count){
		int i=0;
		while(i++ < count){
			mL.add(new Samsung());
		}
		return mL;
	}
}
