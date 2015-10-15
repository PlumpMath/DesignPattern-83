package com.memento;

public class Original {
	private String value;
	public Original(String value) {
		this.value = value;
	}
	public Memento createMemento(){
		return new Memento(value);
	}
	public void restoreMemento(Memento m){
		this.value = m.getValue();
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
