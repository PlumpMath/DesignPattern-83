package com.bridge;
/**
 * ClassName: Main 
 * @Description:桥接模式（Bridge）： 
 * @author Panyk
 * @date 2015年10月13日
 */
public class Main {

	public static void main(String[] args) {
		DriverManager dm = new MyDriver();
		//oracle
		DriverInterface di = new OracleDriver();
		dm.setDi(di);
		dm.connect();
		//mysql
		di = new MysqlDriver();
		dm.setDi(di);
		dm.connect();
	}
}
