package com.lanou.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * PreparedStatement��Ӧ��
 */
public class Test4 {
	public static void main(String[] args) throws Exception {
		System.out.println("������ָ��:1>��¼2>ע��");
		int type = new Scanner(System.in).nextInt();
		switch (type) {
		case 1:
			login();
			break;
		case 2:
			regist();
		}
	}
	
	
	private static void regist() throws Exception{
		//1����������
		Class.forName("com.mysql.jdbc.Driver");
				
		//2����������
		Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/lanou1811",
			"root","1234");
		
		//3��Ԥ����sql���
		System.out.println("===�û�ע��===");
		//�ж��˺��Ƿ�������˺��ظ�,����ظ�����������
		//�ж��û����Ƿ����
		boolean isUserNameExists = true;
		String username;
		
		do{
			System.out.println("�������˺�:");
			username = new Scanner(System.in).nextLine();
			//�ж��˺��Ƿ�Ϊ��
			if("".equals(username)||username==null){
				System.out.println("�˺Ų���Ϊ��");
				continue;
			}
			String sql = "select * from user where "
					+ " username=?";
			PreparedStatement pstmt = 
				conn.prepareStatement(sql);
			pstmt.setString(1,username);
			//ִ��sql
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()){//�˺��Ѵ���
				isUserNameExists = true;
				System.out.println("�˺��Ѵ���,����������");
			}else{//�˺Ų�����
				isUserNameExists = false;
				System.out.println("��ϲ,�˺ſ���ʹ��");
			}
		}while(isUserNameExists);
		
		//�ж������Ƿ�Ϊ��
		boolean isPwdNull = false;
		String password = null;
		do{
			System.out.println("����������:");
			password = new Scanner(System.in).nextLine();
			if("".equals(password)||password==null){
				System.out.println("���벻��Ϊ��,��������");
				isPwdNull = true;
			}else{
				isPwdNull = false;
			}
		}while(isPwdNull);
		
		String sql = "insert into user(username,password)"
				+ " values(?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,username);
		pstmt.setString(2,password);
		
		//4��ִ��sql���
		int rows = pstmt.executeUpdate();
		if(rows!=0){
			System.out.println("���ݲ���ɹ�");
		}else{
			System.out.println("���ݲ���ʧ��");
		}
		
		//5���ͷ���Դ
		if(pstmt!=null){
			pstmt.close();
		}
		if(conn!=null){
			pstmt.close();
		}
	}

	public static void login() throws ClassNotFoundException, SQLException {
		//1����������
		Class.forName("com.mysql.jdbc.Driver");
		
		//2����������
		Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/lanou1811",
			"root","1234");
		
		//3��Ԥ����sql���
		//   ?�䵱ռλ��
		String sql = "select * from user "
				+ "where username=? and password=?";
		//�Ὣsql��䷢�͸����ݿ�,����������ִ��
		PreparedStatement pstmt = 
				conn.prepareStatement(sql);
		//��ռλ����ֵ,sql��������,��1��ʼ
		System.out.println("===�û���¼===");
		System.out.println("�������˺�:");
		String username = new Scanner(System.in).nextLine();
		System.out.println("����������:");
		String password = new Scanner(System.in).nextLine();
		pstmt.setString(1,username);
		pstmt.setString(2,password);
		System.out.println(sql);
		
		//4��ִ��sql���
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()){
			System.out.println("��¼�ɹ�");
		}else{
			System.out.println("��¼ʧ��");
		}
		
		//5���ͷ���Դ
		if(rs!=null){
			rs.close();
		}
		if(pstmt!=null){
			pstmt.close();
		}
		if(conn!=null){
			pstmt.close();
		}
	}
}