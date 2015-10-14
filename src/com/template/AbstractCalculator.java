package com.template;
/**
 * ClassName: AbstractCalculator 
 * @Description:ģ�巽��ģʽ��Template Method����
 * ����һ��ģ�巽��ģʽ������ָ��һ���������У���һ�����������ٶ���1...n�������������ǳ���ģ�
 * Ҳ������ʵ�ʵķ���������һ���࣬�̳иó����࣬��д���󷽷���ͨ�����ó����࣬ʵ�ֶ�����ĵ��á� 
 * @author Panyk
 * @date 2015��10��14��
 */
public abstract class AbstractCalculator {
	//��������ʵ�ֶԱ�������������ĵ���
	public final int calculate(String exp, String opt){
		int[] array = split(exp, opt);
		return this.calculate(array[0], array[1]);
	}
	public abstract int calculate(int num1, int num2);
	private int[] split(String exp, String opt){
		String[] arr = exp.split(opt);
		int[] arrI = new int[2];
		arrI[0] = Integer.parseInt(arr[0]);
		arrI[1] = Integer.parseInt(arr[1]);
		return arrI;
	}
}
