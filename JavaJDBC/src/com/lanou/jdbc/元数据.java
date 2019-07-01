package com.lanou.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class 元数据 {

	public static void main(String[] args) throws Exception {
		Connection conn = ConnectionSource.getConnection();
		//数据库元数据
		DatabaseMetaData dbms = conn.getMetaData();
		//获取数据库名
		System.out.println(dbms.getDatabaseProductName());
		//获取url
		System.out.println(dbms.getURL());
		//获取用户名
		System.out.println(dbms.getUserName());
		
		String sql = "select * from myemp";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		//获取数据表元数据
		ResultSetMetaData rsmd = rs.getMetaData();
		//获取结果集列数
		int columnCount = rsmd.getColumnCount();
		System.out.println(columnCount);
		//获取表名
		String tableName = rsmd.getTableName(1);
		System.out.println(tableName);
		//获取列名
		String columnLabel2 = rsmd.getColumnLabel(2);
		System.out.println(columnLabel2);
	}

}
