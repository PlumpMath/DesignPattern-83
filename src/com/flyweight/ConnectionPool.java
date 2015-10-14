package com.flyweight;

import java.sql.Connection;
import java.util.Vector;
/**
 * ClassName: ConnectionPool 
 * @Description:��Ԫģʽ��Flyweight����
 * ��Ԫģʽ����ҪĿ����ʵ�ֶ���Ĺ���������أ���ϵͳ�ж�����ʱ����Լ����ڴ�Ŀ�����ͨ���빤��ģʽһ��ʹ�á�
 * @author Panyk
 * @date 2015��10��14��
 */
public class ConnectionPool {
	private Vector<Connection> pool;
	//��������
	private String url = "jdbc://mysql://127.0.0.1:3306/test";
	private String userName = "root";
	private String password = "root";
	private String driverClassName = "com.mysql.jdbc.Driver";
	private int poolSize = 100;
	Connection conn = null;
	//����ģʽ��connectionPool
	private static ConnectionPool instance = null;
	//��ʼ��connection
	private ConnectionPool(){
		pool = new Vector<Connection>(poolSize);
		for(int i=0; i<poolSize; i++){
			try{
//				Class.forName(driverClassName);
//				conn = DriverManager.getConnection(url, userName, password);
				pool.add(conn);
			}catch(Exception e){
				
			}
		}
	}
	//�������ӵ����ӳ�
	public synchronized void release(Connection conn){
		pool.add(conn);
	}
	//��ȡһ�����ݿ�����
	public synchronized Connection getConnection(){
		if(pool.size()>0){
			Connection conn = pool.remove(0);
			return conn;
		}
		return null;
	}
}
