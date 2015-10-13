package com.interfaceAdapter;
/**
 * ClassName: main
 * @Description:当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，
 * 实现所有方法，我们写别的类的时候，继承抽象类即可。 
 * @author Panyk
 * @date 2015年10月13日
 */
public class main {
	public static void main(String[] args) {
		SourceSub1 s = new SourceSub1();
		s.method1();
	}
}