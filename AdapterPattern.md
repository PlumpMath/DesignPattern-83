##适配器模式
**适配器模式**：将一个类的接口，转换成客户期望的另一个接口。适配器让原来接口不兼容的类可以合作无间。

![适配器通俗解释截屏](http://i.imgur.com/msi2wMB.png)

![类图](http://7xr4kq.com1.z0.glb.clouddn.com/1457427440723_AdapterPattern.png)

**示例：**一个农场主，以前一直喂养家禽Poultry中的鸡chicken，后来他又喂养鸽子dove。
**家禽接口：**
```
package com.adapter;
/**
 * ClassName: Poultry 
 * @Description: 家禽类
 * @author Panyk
 * @date 2016年3月9日
 */
public interface Poultry {
	//跑
	public void run();
	//喂养
	public void feed();
}

```
**鸡类：**
```
package com.adapter;

public class Chicken implements Poultry {
	@Override
	public void run() {
		System.out.println("鸡跑过来吃食！");
	}
	@Override
	public void feed() {
		System.out.println("在院子里喂鸡！");
	}
}
```
**鸽子类：**
```
package com.adapter;
/**
 * ClassName: Dove 
 * @Description:鸽子 
 * @author Panyk
 * @date 2016年3月9日
 */
public class Dove {
	public void fly(){
		System.out.println("鸽子飞过来吃食！");
	}
	public void feedOnGround(){
		System.out.println("在人民广场喂鸽子！");
	}
}

```
**鸽子适配器：**
```
package com.adapter;
/**
 * ClassName: DoveAdapter 
 * @Description:鸽子适配器 
 * @author Panyk
 * @date 2016年3月9日
 */
public class DoveAdapter implements Poultry {
	private Dove dove;
	
	public DoveAdapter(Dove dove){
		this.dove = dove;
	}
	@Override
	public void run() {
		dove.fly();
	}
	@Override
	public void feed() {
		dove.feedOnGround();
	}
}
```
**农场主类：**
```
package com.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Farmer 
 * @Description:农场主 
 * @author Panyk
 * @date 2016年3月9日
 */
public class Farmer {
	public List<Poultry> poultrys = new ArrayList();
	public void feed(){
		for(Poultry p:poultrys){
			p.feed();
			p.run();
			System.out.println("------------------------");
		}
	}
	public static void main(String[] args) {
		Farmer f = new Farmer();
		//农场主喂养鸡
		Poultry chicken = new Chicken();
		f.poultrys.add(chicken);
		//农场主喂鸽子
		Dove dove = new Dove();
		Poultry da = new DoveAdapter(dove);
		f.poultrys.add(da);
		f.feed();
	}
}

```
