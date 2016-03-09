##命令模式（封装调用）
**命令模式：**将“请求”封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。命令模式也支持可撤销的操作。

命令模式可以将*命令的发出者*和*命令的执行者*解耦。

![类图](http://i.imgur.com/RXkyQ6T.png)
```
package com.command;
//电灯
public class Light {
	public void on(){
		System.out.println("灯亮！");
	}
	public void off(){
		System.out.println("灯灭！");
	}
}
```
```
package com.command;
public interface Command {
	public void execute();
}
```
```
package com.command;

public class LightOffCommand implements Command {
	private Light light = null;//命令对象中包含命令的执行者
	public LightOffCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		light.off();
	}
}
```
```
package com.command;

public class LightOnCommand implements Command {
	private Light light = null;
	public LightOnCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		light.on();
	}
}
```
```
package com.command;
/**
 * ClassName: Switch 
 * @Description: 开关（充当命令的发出者）
 * @author Panyk
 * @date 2016年3月8日
 */
public class Switch {
	private Command lightOn = null;
	private Command lightOff = null;
	private Light light = new Light();//灯
	public Switch() {
		lightOn = new LightOnCommand(light);
		lightOff = new LightOffCommand(light);
	}
	public void switchOn(){
		lightOn.execute();//这里操作的是命令，而不是命令的执行者
	}
	public void switchOff(){
		lightOff.execute();
	}
	
	public static void main(String[] args) {
		Switch s = new Switch();
		s.switchOn();
		s.switchOff();
	}
}

```
**命令模式的更多用途：队列请求**
>命令可以将运算块打包（一个接受者和一组动作），然后将它们传来传去，就像是一般的对象一样。
即使命令对象被创建许久之后，运算依然可以被调用。
甚至可以在不同的线程中被调用。例如：日程安排（Scheduler）、线程池、工作队列等……
你将命令添加到一个队列中，然后另一端是线程，线程从队列中取出一个命令，只需要调用该命令的`execute()`方法,等待该命令执行加成，丢弃再取出下一个命令执行。