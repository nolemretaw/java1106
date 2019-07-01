package com.lanou.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**������*/
public class JdbcUtil extends GlobalConst{
	/**��װ��ȡ���ӵķ���
	 * һ���߳�һ�����Ӷ���
	 * ThreadLocal�����Խ�һ������󶨵���ǰ�߳�
	 * */
	static ThreadLocal<Connection> td = new ThreadLocal<>();
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		//�жϵ�ǰ�߳���û�а����Ӷ���
		//����У���ֱ�ӷ���
		//���û���򴴽�һ�����Ӷ��󲢰󶨵���ǰ�߳�
		Connection conn = td.get();
		if (conn==null) {
			//1����������
			Class.forName(DRIVER);
			//2����������
			conn = DriverManager.getConnection(
					URL,USERNAME,PASSWORD);
			//3�������Ӷ���󶨵���ǰ�߳�
			td.set(conn);
		}
		return conn;
	}
	/**�ر���Դ�ķ���*/
	public static void release(Connection conn,Statement stmt,ResultSet rs){
		try {
			if (rs!=null) rs.close();
			if (stmt!=null) stmt.close();
			if (conn!=null) {
				//��conn����ӵ�ǰ�߳��Ƴ�
				conn.close();
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
