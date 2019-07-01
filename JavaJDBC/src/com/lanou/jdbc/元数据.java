package com.lanou.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Ԫ���� {

	public static void main(String[] args) throws Exception {
		Connection conn = ConnectionSource.getConnection();
		//���ݿ�Ԫ����
		DatabaseMetaData dbms = conn.getMetaData();
		//��ȡ���ݿ���
		System.out.println(dbms.getDatabaseProductName());
		//��ȡurl
		System.out.println(dbms.getURL());
		//��ȡ�û���
		System.out.println(dbms.getUserName());
		
		String sql = "select * from myemp";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		//��ȡ���ݱ�Ԫ����
		ResultSetMetaData rsmd = rs.getMetaData();
		//��ȡ���������
		int columnCount = rsmd.getColumnCount();
		System.out.println(columnCount);
		//��ȡ����
		String tableName = rsmd.getTableName(1);
		System.out.println(tableName);
		//��ȡ����
		String columnLabel2 = rsmd.getColumnLabel(2);
		System.out.println(columnLabel2);
	}

}
