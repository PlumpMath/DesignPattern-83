package com.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * ClassName: Prototype 
 * @Description: 原型模式（Prototype）：原型模式虽然是创建性的模式，但是与工程模式没有关系。
 * 该模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象。
 * @author Panyk
 * @date 2015年10月13日
 */
public class Prototype implements Cloneable,Serializable {
	private static final long serialVersionUID = 3563181097148531834L;
	private String string;
	private SerializableObject obj;

	/*只需要实现Cloneable接口，覆写clone方法，此处clone方法可以改成任意的名称，
	因为Cloneable接口是个空接口，你可以任意定义实现类的方法名，如cloneA或者cloneB。
	重点是super.clone()这句话，super.clone()调用的是Object的clone()方法，而在Object类中，clone()是native的。
	*/
	//浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
	public Object clone() throws CloneNotSupportedException{
		Prototype proto = (Prototype)super.clone();
		return proto;
	}
	//深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。
	//实现深复制，需要采用流的形式读入当前对象的二进制输入，再写出二进制数据对应的对象。
	public Object deepClone() throws IOException, ClassNotFoundException{
		//写入当前对象的二进制流
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		//读入二进制流产生的新对象
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public SerializableObject getObj() {
		return obj;
	}
	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "Prototype [string=" + string + ", obj=" + obj + "]";
	}
}
class SerializableObject implements Serializable{
	private static final long serialVersionUID = 1944649467815346512L;
	public String id;
	@Override
	public String toString() {
		return "SerializableObject [id=" + id + "]";
	}
}