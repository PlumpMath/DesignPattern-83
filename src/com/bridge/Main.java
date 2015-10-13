package com.bridge;
/**
 * ClassName: Main 
 * @Description:�Ž�ģʽ��Bridge���� 
 * @author Panyk
 * @date 2015��10��13��
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
