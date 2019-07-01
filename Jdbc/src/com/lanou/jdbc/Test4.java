package com.lanou.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * PreparedStatement的应用
 */
public class Test4 {
	public static void main(String[] args) throws Exception {
		System.out.println("请输入指令:1>登录2>注册");
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
		//1、加载驱动
		Class.forName("com.mysql.jdbc.Driver");
				
		//2、创建连接
		Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/lanou1811",
			"root","1234");
		
		//3、预编译sql语句
		System.out.println("===用户注册===");
		//判断账号是否和已有账号重复,如果重复了重新输入
		//判断用户名是否存在
		boolean isUserNameExists = true;
		String username;
		
		do{
			System.out.println("请输入账号:");
			username = new Scanner(System.in).nextLine();
			//判断账号是否为空
			if("".equals(username)||username==null){
				System.out.println("账号不能为空");
				continue;
			}
			String sql = "select * from user where "
					+ " username=?";
			PreparedStatement pstmt = 
				conn.prepareStatement(sql);
			pstmt.setString(1,username);
			//执行sql
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()){//账号已存在
				isUserNameExists = true;
				System.out.println("账号已存在,请重新输入");
			}else{//账号不存在
				isUserNameExists = false;
				System.out.println("恭喜,账号可以使用");
			}
		}while(isUserNameExists);
		
		//判断密码是否为空
		boolean isPwdNull = false;
		String password = null;
		do{
			System.out.println("请输入密码:");
			password = new Scanner(System.in).nextLine();
			if("".equals(password)||password==null){
				System.out.println("密码不能为空,重新输入");
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
		
		//4、执行sql语句
		int rows = pstmt.executeUpdate();
		if(rows!=0){
			System.out.println("数据插入成功");
		}else{
			System.out.println("数据插入失败");
		}
		
		//5、释放资源
		if(pstmt!=null){
			pstmt.close();
		}
		if(conn!=null){
			pstmt.close();
		}
	}

	public static void login() throws ClassNotFoundException, SQLException {
		//1、加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//2、创建连接
		Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/lanou1811",
			"root","1234");
		
		//3、预编译sql语句
		//   ?充当占位符
		String sql = "select * from user "
				+ "where username=? and password=?";
		//会将sql语句发送给数据库,但不会立即执行
		PreparedStatement pstmt = 
				conn.prepareStatement(sql);
		//给占位符赋值,sql语句从左到右,从1开始
		System.out.println("===用户登录===");
		System.out.println("请输入账号:");
		String username = new Scanner(System.in).nextLine();
		System.out.println("请输入密码:");
		String password = new Scanner(System.in).nextLine();
		pstmt.setString(1,username);
		pstmt.setString(2,password);
		System.out.println(sql);
		
		//4、执行sql语句
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()){
			System.out.println("登录成功");
		}else{
			System.out.println("登录失败");
		}
		
		//5、释放资源
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