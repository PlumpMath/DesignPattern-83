package com.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * ClassName: Prototype 
 * @Description: ԭ��ģʽ��Prototype����ԭ��ģʽ��Ȼ�Ǵ����Ե�ģʽ�������빤��ģʽû�й�ϵ��
 * ��ģʽ��˼����ǽ�һ��������Ϊԭ�ͣ�������и��ơ���¡������һ����ԭ�������Ƶ��¶���
 * @author Panyk
 * @date 2015��10��13��
 */
public class Prototype implements Cloneable,Serializable {
	private static final long serialVersionUID = 3563181097148531834L;
	private String string;
	private SerializableObject obj;

	/*ֻ��Ҫʵ��Cloneable�ӿڣ���дclone�������˴�clone�������Ըĳ���������ƣ�
	��ΪCloneable�ӿ��Ǹ��սӿڣ���������ⶨ��ʵ����ķ���������cloneA����cloneB��
	�ص���super.clone()��仰��super.clone()���õ���Object��clone()����������Object���У�clone()��native�ġ�
	*/
	//ǳ���ƣ���һ�������ƺ󣬻����������͵ı����������´��������������ͣ�ָ��Ļ���ԭ������ָ��ġ�
	public Object clone() throws CloneNotSupportedException{
		Prototype proto = (Prototype)super.clone();
		return proto;
	}
	//��ƣ���һ�������ƺ󣬲����ǻ����������ͻ����������ͣ��������´����ġ�
	//ʵ����ƣ���Ҫ����������ʽ���뵱ǰ����Ķ��������룬��д�����������ݶ�Ӧ�Ķ���
	public Object deepClone() throws IOException, ClassNotFoundException{
		//д�뵱ǰ����Ķ�������
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		//������������������¶���
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