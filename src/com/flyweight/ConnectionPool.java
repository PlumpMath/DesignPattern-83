package com.flyweight;

import java.sql.Connection;
import java.util.Vector;
/**
 * ClassName: ConnectionPool 
 * @Description:享元模式（Flyweight）：
 * 享元模式的主要目的是实现对象的共享，即共享池，当系统中对象多的时候可以减少内存的开销，通常与工厂模式一起使用。
 * @author Panyk
 * @date 2015年10月14日
 */
public class ConnectionPool {
	private Vector<Connection> pool;
	//公共属性
	private String url = "jdbc://mysql://127.0.0.1:3306/test";
	private String userName = "root";
	private String password = "root";
	private String driverClassName = "com.mysql.jdbc.Driver";
	private int poolSize = 100;
	Connection conn = null;
	//单例模式的connectionPool
	private static ConnectionPool instance = null;
	//初始化connection
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
	//返回连接到连接池
	public synchronized void release(Connection conn){
		pool.add(conn);
	}
	//获取一个数据库连接
	public synchronized Connection getConnection(){
		if(pool.size()>0){
			Connection conn = pool.remove(0);
			return conn;
		}
		return null;
	}
}
