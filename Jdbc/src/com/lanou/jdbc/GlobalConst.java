package com.lanou.jdbc;
/**存储全局变量*/
public class GlobalConst {
	static BaseConfig config = new Config();
	//url
	public static final String URL = config.getValue("url");
	//driver
	public static final String DRIVER = config.getValue("driverClassName");
	//username
	public static final String USERNAME = config.getValue("username");
	//password
	public static final String PASSWORD = config.getValue("password");
	
}
