package com.lanou.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

public class �����ύ {
	public static void main(String[] args) {
		//1����ȡ����
		Connection conn = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		Savepoint point1 = null;
		try {
			conn = JdbcUtil.getConnection();
			//����������ת��500Ԫ
			String sql1 = "update account set money = money-500 where name='����'";
			String sql2 = "update account set money = money+500 where name='����'";
			pstmt1 = conn.prepareStatement(sql1);
			pstmt2 = conn.prepareStatement(sql2);
			//��mysql������Զ��ύ���̸�Ϊ�ֶ��ύ
			boolean f = conn.getAutoCommit();
			if (f) {
				//����Ϊ�ֶ��ύ����������
				conn.setAutoCommit(false);
			}
			//ִ��һ�������ڲ���������DML������
//			point1 = conn.setSavepoint("a");
			pstmt1.executeUpdate();
			String s = null;
			System.out.println(s.length());
			pstmt2.executeUpdate();
			//�ύ����
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
