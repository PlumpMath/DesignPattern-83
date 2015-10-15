package com.iterator;

import java.util.Iterator;

public class MyCollection implements Collection {
	public String[] str = {"H","E","L","L","O","W","O","R","L","D"};
	@Override
	public com.iterator.Iterator iterator() {
		return (com.iterator.Iterator) new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		return str[i];
	}

	@Override
	public int size() {
		return str.length;
	}
}
