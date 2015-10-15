package com.command;
/**
 * ClassName: Invoker 
 * @Description:命令的发起者（司令） 
 * @author Panyk
 * @date 2015年10月15日
 */
public class Invoker {
	private Command command;
	public Invoker(Command command){
		this.command = command;
	}
	public void action(){
		command.exe();
	}
}
