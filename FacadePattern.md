###外观模式（Facade Pattern）
**外观模式：**提供一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用。


| 模式      |  功能                   |
|:---------:|:--------------         |
| 装饰者模式 | 不改变接口，但加入责任    |
| 适配器模式 | 将一个接口转换成另一个接口 |
| 外观模式   | 让接口更简单             |

![外观模式类图](http://img.blog.csdn.net/20160309095410924)

**最少知识原则：**只和你的密友谈话。
>我们在设计中，不要让太多的类耦合在一起，免得修改系统中的一部分，会影响到其他部分。如果很多类相互依赖，那么这个系统就会变成一个易碎的系统，它需要花费很多成本就行维护，也会因为太复杂而不容易被其他人了解。

**最少只是原则的一些方针:**
>就任何对象而言,在该对象的方法内，我们只应该调用属于以下范围的方法：
1. 该对象本身。
1. 被当做方法的参数而传递进来的对象。（如果某个对象是调用其他的方法的返回结果，那么我们不要调用该对象的方法）
2. 此方法所创建或者实例化的任何对象。
3. 对象的任何组件。

**错误示例：**
```
public class House {
	WeatherStation station;
	public float getTemp(){
		return station.getThermometer().getTemperature();
	}
}
```
**正确示例：**
```
public class House {
	WeatherStation station;
	public float getTemp(){
		Thermometer thermometer = station.getThermometer();
//		return thermometer.getTemperature();//该对象是调用其他的方法的返回结果，那么我们不要调用该对象的方法
		return this.getTemphelper(thermometer);
	}
	public float getTemphelper(Thermometer thermometer){
		return thermometer.getTemperature();
	}
}

```