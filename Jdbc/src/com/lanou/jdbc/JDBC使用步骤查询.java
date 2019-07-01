package com.lanou.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JDBCʹ�ò����ѯ {
/**JDBC���裺
 * 	���ӵ�mysql���ݣ���ѯ��lanou1811���е�myemp��������
 * @throws ClassNotFoundException 
 * @throws SQLException 
 * */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1������������Driver
		Class.forName("com.mysql.jdbc.Driver");
//		new Driver();
		//2�����������ݿ�֮�������
		//DriverManager������
		//����Driver�����࣬Driver���ص��ڴ���Լ����Լ�ע�ᵽDriverManager��
		//�ײ�Դ�룺DriverManager.registerDriver(new Driver());
//		Connection conn = DriverManager.getConnection(
//				"jdbc:mysql://localhost:3306/lanou1811",
//				"root",
//				"1234");
		Connection conn = JdbcUtil.getConnection();
		//3�����������ݿⷢ��sql���Ķ���
		java.sql.Statement stmt = conn.createStatement();
		String sql = "select * from myemp";
		//4������sql��䣬����ѯ�����װ��ResultSet
		ResultSet rs = stmt.executeQuery(sql);
		//5����������(���²������ڽ������)
		//�������ָ�룬Ĭ��ָ���һ�е���һ��
		//next()�ж���û����һ�У������Զ�Ų������һ��
		while (rs.next()) {
			//��ȡ��ǰ��ָ����ָ����е�����
			/*int id = rs.getInt(1);
			String name = rs.getString(2);
			String sex = rs.getString(3);
			String job = rs.getString(4);
			double salary = rs.getDouble(5);
			Date hiredate = rs.getDate(6);
			int deptno = rs.getInt(7);*/
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String sex = rs.getString("sex");
			String job = rs.getString("job");
			double salary = rs.getDouble("salary");
			Date hiredate = rs.getDate("hiredate");
			int deptno = rs.getInt("deptno");
			System.out.println(id+","+name+","+sex+","+job+","+salary+","+hiredate+","+deptno);
		}
		//6���ر���Դ����򿪵��ȹرգ�
//		if (rs!=null) {//�����
//			rs.close();
//		}
//		if (stmt!=null) {//���
//			stmt.close();
//		}
//		if (conn!=null) {//����
//			conn.close();
//		}
		JdbcUtil.release(conn,stmt, rs);
	}

}
