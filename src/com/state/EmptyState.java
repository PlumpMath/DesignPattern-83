package com.state;
/**
 * ClassName: EmptyState 
 * @Description: 为空时候的状态
 * @author Panyk
 * @date 2016年3月21日
 */
public class EmptyState implements State {
	private Kettle kettle;
	
	public EmptyState(Kettle kettle) {
		this.kettle = kettle;
	}
	
	/**
	 * @Description:为空的时候加热 
	 * @param    
	 * @return void  
	 * @throws
	 * @author Panyk
	 * @date 2016年3月21日
	 */
	public void heat() {
		System.out.println("水壶为空，请加水后再加热！");
		kettle.addWater();
		kettle.heat();
	}

	@Override
	public void addWater() {
		System.out.println("将水壶加满水！");
		kettle.setState(kettle.getFullColdState());//转成水壶装满凉水状态
	}

	@Override
	public void drink() {
		System.out.println("没有水不能喝，请加水！");
		kettle.addWater();
		kettle.heat();
		kettle.drink();
	}
}