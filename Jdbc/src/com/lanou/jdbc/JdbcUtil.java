package com.lanou.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**工具类*/
public class JdbcUtil extends GlobalConst{
	/**封装获取连接的方法
	 * 一个线程一个链接对象
	 * ThreadLocal：可以将一个对象绑定到当前线程
	 * */
	static ThreadLocal<Connection> td = new ThreadLocal<>();
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		//判断当前线程有没有绑定连接对象
		//如果有，则直接返回
		//如果没有则创建一个连接对象并绑定到当前线程
		Connection conn = td.get();
		if (conn==null) {
			//1、加载驱动
			Class.forName(DRIVER);
			//2、创建连接
			conn = DriverManager.getConnection(
					URL,USERNAME,PASSWORD);
			//3、将连接对象绑定到当前线程
			td.set(conn);
		}
		return conn;
	}
	/**关闭资源的方法*/
	public static void release(Connection conn,Statement stmt,ResultSet rs){
		try {
			if (rs!=null) rs.close();
			if (stmt!=null) stmt.close();
			if (conn!=null) {
				//将conn对象从当前线程移除
				conn.close();
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
