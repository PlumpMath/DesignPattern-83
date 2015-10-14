package com.strategy;
/**
 * ClassName: Main 
 * @Description:策略模式（strategy）：
 	策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户。
 	需要设计一个接口，为一系列实现类提供统一的方法，多个实现类实现该接口，设计一个抽象类（可有可无，属于辅助类），提供辅助函数。
 	策略模式的决定权在用户，系统本身提供不同算法的实现，新增或者删除算法，对各种算法做封装。
 	因此，策略模式多用在算法决策系统中，外部用户只需要决定用哪个算法即可。
 * @author Panyk
 * @date 2015年10月14日
 */
public class Main {
	public static void main(String[] args) {
		CalculatorInterface ci = new Plus();
		String exp = "3+8";
		int res = ci.calculate(exp);
		System.out.println(exp + " = " + res);
	}
}