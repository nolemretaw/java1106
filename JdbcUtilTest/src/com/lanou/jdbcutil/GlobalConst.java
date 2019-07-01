package com.lanou.jdbcutil;

public class GlobalConst {
	static BaseConfig config = new XmlConfig();
	public static final String URL = config.getValue("url");
	public static final String DRIVER = config.getValue("driverClassName");
	public static final String USERNAME = config.getValue("username");
	public static final String PASSWORD = config.getValue("password");
	public static final String FINDALLSQL = config.getValue("findAllSql");
	public static final String FINDALLCustSQL = config.getValue("findAllCustemorSql");
}
