package com.lanou.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC��ɾ�� {

	public static void main(String[] args) throws Exception {
		while (true) {
			System.out.println("������ָ��:1>���룬2>ɾ����3>�޸�");
			int type = new Scanner(System.in).nextInt();
			switch (type) {
			case 1:
				add();
				break;

			case 2:
				delete();
				break;
			case 3:
				update();
				break;
			}
		}
		
	}
	/**�޸�����
	 * @throws Exception */
	private static void update() throws Exception {
		System.out.println("���벿�ű��");
		int deptno = new Scanner(System.in).nextInt();
		System.out.println("���벿������");
		String dname = new Scanner(System.in).nextLine();
		System.out.println("���벿�ŵ�ַ");
		String location = new Scanner(System.in).nextLine();
		//sql���
		String sql = "update dept set dname='"
		+dname+"',location='"+location+"' where deptno="+deptno;
//		System.out.println(sql);
		executeSql(sql);
	}
	/**ɾ������
	 * @throws Exception */
	private static void delete() throws Exception {
		System.out.println("����Ҫɾ���Ĳ��ű��");
		int deptno = new Scanner(System.in).nextInt();
		//sql���
		String sql = "delect "
				+ "from dept where deptno="+deptno;
		System.out.println(sql);
		executeSql(sql);
	}
	/**�������ݵķ���*/
	public static void add() throws Exception{
		System.out.println("���벿�ű��");
		int deptno = new Scanner(System.in).nextInt();
		System.out.println("���벿������");
		String dname = new Scanner(System.in).nextLine();
		System.out.println("���벿�ŵ�ַ");
		String location = new Scanner(System.in).nextLine();
		//sql���
		String sql = "insert into dept "
				+ "values("+deptno+",'"+dname+"','"+location+"')";
//		System.out.println(sql);
		executeSql(sql);
	}
	/**����ִ��sql��䷽������ɾ��*/
	public static void executeSql(String sql)throws Exception {
		//1����������
		Class.forName("com.mysql.jdbc.Driver");
		//2����������
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/lanou1811",
				"root",
				"1234");
		//3������Statement
		Statement stmt = conn.createStatement();
		//4��ִ��sql���
		
		//������Ӱ�������
		int rows = stmt.executeUpdate(sql);
		if (rows!=0) {
			System.out.println("�����ɹ���rows="+rows);
		}else {
			System.out.println("����ʧ��");
		}
		//5���ر���Դ
		if (stmt!=null) {
			stmt.close();
		}
		if (conn!=null) {
			conn.close();
		}
	}
	
	

}
