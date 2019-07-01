package com.lanou.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JDBC使用步骤查询 {
/**JDBC步骤：
 * 	连接到mysql数据，查询到lanou1811库中的myemp表中数据
 * @throws ClassNotFoundException 
 * @throws SQLException 
 * */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1、加载驱动类Driver
		Class.forName("com.mysql.jdbc.Driver");
//		new Driver();
		//2、创建与数据库之间的连接
		//DriverManager的作用
		//管理Driver驱动类，Driver加载到内存后，自己把自己注册到DriverManager中
		//底层源码：DriverManager.registerDriver(new Driver());
//		Connection conn = DriverManager.getConnection(
//				"jdbc:mysql://localhost:3306/lanou1811",
//				"root",
//				"1234");
		Connection conn = JdbcUtil.getConnection();
		//3、构建给数据库发送sql语句的对象
		java.sql.Statement stmt = conn.createStatement();
		String sql = "select * from myemp";
		//4、发送sql语句，将查询结果封装到ResultSet
		ResultSet rs = stmt.executeQuery(sql);
		//5、处理结果集(以下操作均在结果集上)
		//结果集行指针，默认指向第一行的上一行
		//next()判断有没有下一行，有则自动挪动到下一行
		while (rs.next()) {
			//获取当前行指针所指向的行的数据
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
		//6、关闭资源（后打开的先关闭）
//		if (rs!=null) {//结果集
//			rs.close();
//		}
//		if (stmt!=null) {//语句
//			stmt.close();
//		}
//		if (conn!=null) {//连接
//			conn.close();
//		}
		JdbcUtil.release(conn,stmt, rs);
	}

}
