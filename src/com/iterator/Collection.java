package com.iterator;

import java.util.Iterator;

public interface Collection {
	public com.iterator.Iterator iterator();
	public Object get(int i);
	public int size();
}
