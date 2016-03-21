package com.state;
/**
 * ClassName: FullColdState 
 * @Description: 装满凉水的状态
 * @author Panyk
 * @date 2016年3月21日
 */
public class FullColdState implements State {
	private Kettle kettle;
	
	public FullColdState(Kettle kettle) {
		this.kettle = kettle;
	}
	
	@Override
	public void heat() {
		System.out.println("加热！");
		kettle.setState(kettle.getFullHotState());
	}

	@Override
	public void addWater() {
		System.out.println("水壶已经加满水，不需要添加！");
	}

	@Override
	public void drink() {
		System.out.println("凉水不能喝，请加热！");
		kettle.heat();
		kettle.drink();
	}
}
