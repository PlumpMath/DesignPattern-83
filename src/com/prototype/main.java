package com.prototype;

public class main {
	public static void main(String[] args) {
		try {
			//ǳ����
			Prototype p1 = new Prototype();
			SerializableObject so = new SerializableObject();
			so.id = "p1so";
			p1.setString("p1");
			p1.setObj(so);
			System.out.println("ԭʼ��p1=" + p1);
			Prototype p2 = (Prototype)p1.clone();
			System.out.println("ǳ����p2=" + p2);
			
			System.out.println(p1 == p2);
			System.out.println(p1.getString() == p2.getString());
			System.out.println(p1.getObj() == p2.getObj());
			System.out.println(p1.getObj().id == p2.getObj().id);
			System.out.println("--------------��ɧ��java�ָ���--------------");
			//ǳ����
			Prototype p3 = new Prototype();
			SerializableObject so1 = new SerializableObject();
			so1.id = "p3so";
			p3.setString("p1");
			p3.setObj(so1);
			System.out.println("ԭʼ��p3=" + p1);
			Prototype p4 = (Prototype)p3.deepClone();
			System.out.println("ǳ����p4=" + p2);

			System.out.println(p3 == p4);
			System.out.println(p3.getString() == p4.getString());
			System.out.println(p3.getObj() == p4.getObj());
			System.out.println(p3.getObj().id == p4.getObj().id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}