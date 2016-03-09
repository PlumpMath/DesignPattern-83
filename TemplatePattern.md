###模板方法模式
**模板方法模式：**在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。
**例子：**
1. 冲咖啡：
 * 烧开水
 * 冲咖啡
 * 将咖啡倒进杯子里
 * 添加牛奶或糖
1. 泡茶
 * 烧开水
 * 泡茶
 * 将茶水倒进杯子里
 * 添加柠檬

上面的两个操作我们可以抽象出一个算法，该**算法的步骤是：***烧水->冲泡->倒进杯子->添加调料*
1. 其中，冲泡、添加调料的方法不同，其他的两个方法相同。我们可以将不同的方法写成抽象方法，在子类中来具体实现；而相同的方法可以在父类中实现。
1. 另外，有的人添加调料，有的人不添加调料，这个我们可以通过钩子`hook()`来实现。

**模板抽象类：**
```
package com.template;
/**
 * ClassName: AbstractClass 
 * @Description:抽象父类 
 * @author Panyk
 * @date 2016年3月9日
 */
public abstract class AbstractClass {
	/**
	 * @Description:封装的算法模块。
	 * 有了该算法模块，我们不需要调用细节方法，只需要调用该算法模块就能使用一系列的功能。
	 * （之所以是final为了防止子类重写该方法） 
	 * @param    
	 * @return void  
	 * @throws
	 * @author Panyk
	 * @date 2016年3月9日
	 */
	final void templateMethod(){
		this.boil();
		this.brew();
		this.pourIntoCup();
		if(this.hook()){
			this.addCondiments();
		}
	}
	/**
	 * @Description:冲咖啡或者是泡茶 
	 * @param    
	 * @return void  
	 * @throws
	 * @author Panyk
	 * @date 2016年3月9日
	 */
	abstract void brew();
	/**
	 * @Description:添加调料 
	 * @param    
	 * @return void  
	 * @throws
	 * @author Panyk
	 * @date 2016年3月9日
	 */
	abstract void addCondiments();
	
	private void boil(){}{
		System.out.println("烧开水！");
	}
	private void pourIntoCup(){
		System.out.println("倒进杯子中！");
	}
	/**
	 * @Description:钩子方法，默认返回true，表示添加调料。
	 * @param @return   
	 * @return boolean  
	 * @throws
	 * @author Panyk
	 * @date 2016年3月9日
	 */
	protected boolean hook(){
		return true;
	}
}
```
**咖啡类：**
```
package com.template;

public class Coffee extends AbstractClass {
	/**
	 * 抽象方法子类必须实现
	 */
	@Override
	protected void brew() {
		System.out.println("冲咖啡！");
	}
	@Override
	protected void addCondiments() {
		System.out.println("添加糖和牛奶！");
	}
	@Override
	protected boolean hook() {
		System.out.println("钩子返回咖啡加调料！");
		return true;
	}
}
```
**茶类：**
```
package com.template;

public class Tea extends AbstractClass {
	@Override
	void brew() {
		System.out.println("泡茶！");
	}
	@Override
	void addCondiments() {
		System.out.println("添加柠檬！");
	}
	@Override
	protected boolean hook() {
		System.out.println("钩子返回喝茶不添加调料！");
		return false;
	}
}
```
**用户类：**
```
package com.template;

public class People {
	public void drink(){
		AbstractClass c = new Coffee();
		c.templateMethod();
		System.out.println("-------------");
		AbstractClass t = new Tea();
		t.templateMethod();
	}
	public static void main(String[] args) {
		People p = new People();
		p.drink();
	}
}
```

***
**好莱坞原则：**高层可以调用底层，但是底层不能调用高层。
>当高层依赖底层，而底层又依赖高层的时候，这样就形成了一个环形依赖关系，系统容易出现问题。
>所以，我们允许底层将自己挂在高层系统上，但是高层决定什么时候调用底层，而底层不能直接调用高层组件。


|          |            |
|:--------:|:-----------|
|依赖倒置原则|避免使用具体类，多使用抽象，更注重在设计中避免依赖|
|好莱坞原则  |在创建框架或组件上的一种技巧，好让底层组件能够被挂钩进计算中，而且不会让高层组件依赖底层组件。   |

|模式            | 说明              |
|:------------:  |:-----------------|
|模板方法         |子类决定如何实现算法中的步骤|
|策略            |封装可以替换的行为，然后使用委托来决定要采用哪一个行为|
|工厂方法         |由子类来决定实例化哪个具体类|

