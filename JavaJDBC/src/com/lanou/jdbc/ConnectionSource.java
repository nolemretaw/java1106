package com.lanou.jdbc;
/**数据库连接池参数设置*/

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public class ConnectionSource {
	//声明数据库连接池
	static BasicDataSource dataSource;
	/**设置初始化参数*/
	public static void init() {
		Properties pro = new Properties();
		InputStream in = ConnectionSource.class.getClassLoader().
				getResourceAsStream("dbcp.properties");
		 try {
			pro.load(in);
			//初始化数据库连接池
			dataSource = new BasicDataSource();
			//参数设置
			//url
			dataSource.setUrl(pro.getProperty("url"));
			//driver
			dataSource.setDriverClassName(pro.getProperty("driverClassName"));
			//username
			dataSource.setUsername(pro.getProperty("username"));
			//password
			dataSource.setPassword(pro.getProperty("password"));
			//初始化连接数
			String initialSize = pro.getProperty("initialSize");
			if (initialSize!=null) {
				dataSource.setInitialSize(Integer.parseInt(initialSize));
			}
			//最大空闲连接数
			String maxIdle = pro.getProperty("maxIdle");
			if (maxIdle!=null) {
				dataSource.setMaxIdle(Integer.parseInt(maxIdle));
			}
			//最小空闲连接数
			String minIdle = pro.getProperty("minIdle");
			if (minIdle!=null) {
				dataSource.setMinIdle(Integer.parseInt(minIdle));
			}
			//最大活动连接数
			String maxActive = pro.getProperty("maxActive");
			if (maxActive!=null) {
				dataSource.setMaxActive(Integer.parseInt(maxActive));
			}
			//最大等待时间
			String maxWait = pro.getProperty("maxWait");
			if (maxWait!=null) {
				dataSource.setMaxWait(Long.parseLong(maxWait));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public synchronized static Connection getConnection(){
		if (dataSource==null) {
			init();
		}
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
}
