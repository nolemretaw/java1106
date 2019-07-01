package com.lanou.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *批量加载：批处理（主要是DML）
 * */
public class 批处理 {
	public static Connection getConnection() throws Exception {
		//1、加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2、创建连接并返回
		return DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/lanou1811",
				"root","1234");
	}
	/**发送一万条提交sql语句到数据库
	 * @throws Exception */
	public static void update1() throws Exception{
		//1、获取连接
		long t1 = System.currentTimeMillis();
		Connection conn = getConnection();
		String sql = "insert into user(username,password)"+
				"values(?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		for (int i = 0; i < 10000; i++) {
			pstmt.setString(1, "name"+i);
			pstmt.setString(2, "pwd"+i);
			pstmt.executeUpdate();
		}
		long t2 = System.currentTimeMillis();
		System.out.println("执行时间："+(t2-t1));
	}
	
	/**批处理加载一万条数据
	 * @throws Exception */
	public static void batchUpdate() throws Exception{
		long t1 = System.currentTimeMillis();
		//获取连接
		Connection conn = getConnection();
		//预编译sql
		String sql = "insert into user(username,password)"+
				"values(?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		for (int i = 0; i < 10000; i++) {
			pstmt.setString(1, "name"+i);
			pstmt.setString(2, "pwd"+i);
			//将参数先都加载到预处理对象列表中
			pstmt.addBatch();
			if (i%500==0) {//每500条发送数据库执行一次
				pstmt.executeBatch();
				pstmt.clearBatch();//清除批处理命令
			}
		}
		//再将所有参数一次性发给数据库
		pstmt.executeBatch();
		long t2 = System.currentTimeMillis();
		System.out.println("批处理时间："+(t2-t1));
	}
	
	public static void main(String[] args) throws Exception {
//		update1();
		batchUpdate();

	}

}
