package com.iterator;

public class Main {
	public static void main(String[] args) {
		Collection c = new MyCollection();
		com.iterator.Iterator i = (com.iterator.Iterator)c.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}