package com.lanou.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

public class 事物提交 {
	public static void main(String[] args) {
		//1、获取连接
		Connection conn = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		Savepoint point1 = null;
		try {
			conn = JdbcUtil.getConnection();
			//张三给李四转账500元
			String sql1 = "update account set money = money-500 where name='张三'";
			String sql2 = "update account set money = money+500 where name='李四'";
			pstmt1 = conn.prepareStatement(sql1);
			pstmt2 = conn.prepareStatement(sql2);
			//将mysql事物的自动提交过程改为手动提交
			boolean f = conn.getAutoCommit();
			if (f) {
				//设置为手动提交，开启事物
				conn.setAutoCommit(false);
			}
			//执行一个事物内部的若干条DML语句操作
//			point1 = conn.setSavepoint("a");
			pstmt1.executeUpdate();
			String s = null;
			System.out.println(s.length());
			pstmt2.executeUpdate();
			//提交事物
			conn.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
//				conn.rollback(point1);
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
}
