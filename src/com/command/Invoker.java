package com.command;
/**
 * ClassName: Invoker 
 * @Description:����ķ����ߣ�˾� 
 * @author Panyk
 * @date 2015��10��15��
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
