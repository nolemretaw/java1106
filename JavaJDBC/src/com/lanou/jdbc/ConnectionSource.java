package com.lanou.jdbc;
/**���ݿ����ӳز�������*/

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public class ConnectionSource {
	//�������ݿ����ӳ�
	static BasicDataSource dataSource;
	/**���ó�ʼ������*/
	public static void init() {
		Properties pro = new Properties();
		InputStream in = ConnectionSource.class.getClassLoader().
				getResourceAsStream("dbcp.properties");
		 try {
			pro.load(in);
			//��ʼ�����ݿ����ӳ�
			dataSource = new BasicDataSource();
			//��������
			//url
			dataSource.setUrl(pro.getProperty("url"));
			//driver
			dataSource.setDriverClassName(pro.getProperty("driverClassName"));
			//username
			dataSource.setUsername(pro.getProperty("username"));
			//password
			dataSource.setPassword(pro.getProperty("password"));
			//��ʼ��������
			String initialSize = pro.getProperty("initialSize");
			if (initialSize!=null) {
				dataSource.setInitialSize(Integer.parseInt(initialSize));
			}
			//������������
			String maxIdle = pro.getProperty("maxIdle");
			if (maxIdle!=null) {
				dataSource.setMaxIdle(Integer.parseInt(maxIdle));
			}
			//��С����������
			String minIdle = pro.getProperty("minIdle");
			if (minIdle!=null) {
				dataSource.setMinIdle(Integer.parseInt(minIdle));
			}
			//���������
			String maxActive = pro.getProperty("maxActive");
			if (maxActive!=null) {
				dataSource.setMaxActive(Integer.parseInt(maxActive));
			}
			//���ȴ�ʱ��
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
