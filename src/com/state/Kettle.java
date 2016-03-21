package com.state;

public class Kettle {
	State state = null;
	State emptyState = new EmptyState(this);
	State fullColdState = new FullColdState(this);
	State fullHotState = new FullHotState(this);
	
	public Kettle() {
		emptyState = new EmptyState(this);
		fullColdState = new FullColdState(this);
		fullHotState = new FullHotState(this);
		state = emptyState;
	}
	/**
	 * 加热
	 */
	public void heat(){
		state.heat();
	}
	/**
	 * 加水
	 */
	public void addWater(){
		state.addWater();
	}
	public void drink(){
		state.drink();
	}
	
	public static void main(String[] args) {
		Kettle k = new Kettle();
		System.out.println("喝");
		k.drink();
		System.out.println("**************");
		System.out.println("热");
		k.heat();
		System.out.println("**************");
		System.out.println("加");
		k.addWater();
		System.out.println("**************");
		System.out.println("热");
		k.heat();
		System.out.println("**************");
		System.out.println("喝");
		k.drink();
		
		
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getEmptyState() {
		return emptyState;
	}
	public void setEmptyState(State emptyState) {
		this.emptyState = emptyState;
	}
	public State getFullColdState() {
		return fullColdState;
	}
	public void setFullColdState(State fullColdState) {
		this.fullColdState = fullColdState;
	}
	public State getFullHotState() {
		return fullHotState;
	}
	public void setFullHotState(State fullHotState) {
		this.fullHotState = fullHotState;
	}
}
