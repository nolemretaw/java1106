package com.lanou.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *�������أ���������Ҫ��DML��
 * */
public class ������ {
	public static Connection getConnection() throws Exception {
		//1����������
		Class.forName("com.mysql.jdbc.Driver");
		//2���������Ӳ�����
		return DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/lanou1811",
				"root","1234");
	}
	/**����һ�����ύsql��䵽���ݿ�
	 * @throws Exception */
	public static void update1() throws Exception{
		//1����ȡ����
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
		System.out.println("ִ��ʱ�䣺"+(t2-t1));
	}
	
	/**���������һ��������
	 * @throws Exception */
	public static void batchUpdate() throws Exception{
		long t1 = System.currentTimeMillis();
		//��ȡ����
		Connection conn = getConnection();
		//Ԥ����sql
		String sql = "insert into user(username,password)"+
				"values(?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		for (int i = 0; i < 10000; i++) {
			pstmt.setString(1, "name"+i);
			pstmt.setString(2, "pwd"+i);
			//�������ȶ����ص�Ԥ��������б���
			pstmt.addBatch();
			if (i%500==0) {//ÿ500���������ݿ�ִ��һ��
				pstmt.executeBatch();
				pstmt.clearBatch();//�������������
			}
		}
		//�ٽ����в���һ���Է������ݿ�
		pstmt.executeBatch();
		long t2 = System.currentTimeMillis();
		System.out.println("������ʱ�䣺"+(t2-t1));
	}
	
	public static void main(String[] args) throws Exception {
//		update1();
		batchUpdate();

	}

}
