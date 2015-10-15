package com.state;

public class Main {
	public static void main(String[] args) {
		State s = new State();
		Context c = new Context(s);
		s.setValue("state1");
		c.method();
		s.setValue("state2");
		c.method();
	}
}
