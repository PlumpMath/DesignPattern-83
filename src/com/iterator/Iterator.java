package com.iterator;

public interface Iterator {
	//前移
	public Object previous();
	//后移
	public Object next();
	public boolean hasNext();
	//取的第一个元素
	public Object first();
}
