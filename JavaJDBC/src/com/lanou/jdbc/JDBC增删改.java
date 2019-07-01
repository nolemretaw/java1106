package com.lanou.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC增删改 {

	public static void main(String[] args) throws Exception {
		while (true) {
			System.out.println("请输入指令:1>插入，2>删除，3>修改");
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
	/**修改数据
	 * @throws Exception */
	private static void update() throws Exception {
		System.out.println("输入部门编号");
		int deptno = new Scanner(System.in).nextInt();
		System.out.println("输入部门名称");
		String dname = new Scanner(System.in).nextLine();
		System.out.println("输入部门地址");
		String location = new Scanner(System.in).nextLine();
		//sql语句
		String sql = "update dept set dname='"
		+dname+"',location='"+location+"' where deptno="+deptno;
//		System.out.println(sql);
		executeSql(sql);
	}
	/**删除数据
	 * @throws Exception */
	private static void delete() throws Exception {
		System.out.println("输入要删除的部门编号");
		int deptno = new Scanner(System.in).nextInt();
		//sql语句
		String sql = "delect "
				+ "from dept where deptno="+deptno;
		System.out.println(sql);
		executeSql(sql);
	}
	/**插入数据的方法*/
	public static void add() throws Exception{
		System.out.println("输入部门编号");
		int deptno = new Scanner(System.in).nextInt();
		System.out.println("输入部门名称");
		String dname = new Scanner(System.in).nextLine();
		System.out.println("输入部门地址");
		String location = new Scanner(System.in).nextLine();
		//sql语句
		String sql = "insert into dept "
				+ "values("+deptno+",'"+dname+"','"+location+"')";
//		System.out.println(sql);
		executeSql(sql);
	}
	/**用于执行sql语句方法，增删改*/
	public static void executeSql(String sql)throws Exception {
		//1、加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2、创建连接
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/lanou1811",
				"root",
				"1234");
		//3、创建Statement
		Statement stmt = conn.createStatement();
		//4、执行sql语句
		
		//返回受影响的行数
		int rows = stmt.executeUpdate(sql);
		if (rows!=0) {
			System.out.println("操作成功，rows="+rows);
		}else {
			System.out.println("操作失败");
		}
		//5、关闭资源
		if (stmt!=null) {
			stmt.close();
		}
		if (conn!=null) {
			conn.close();
		}
	}
	
	

}
