package com.state;
/**
 * ClassName: FullHotState 
 * @Description: 装满开水的状态
 * @author Panyk
 * @date 2016年3月21日
 */
public class FullHotState implements State {
	private Kettle kettle;
	
	public FullHotState(Kettle kettle) {
		this.kettle = kettle;
	}
	
	@Override
	public void heat() {
		System.out.println("水壶已经是热水，不需要加热！");
	}

	@Override
	public void addWater() {
		System.out.println("水壶已经加满水，不需要添加！");
	}

	@Override
	public void drink() {
		System.out.println("喝光水！");
		kettle.setState(kettle.getEmptyState());
	}
}
