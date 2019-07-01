package com.lanou.jdbc;
/**用于生产dao对象的工厂*/
public class DaoFactory {
	public static Class<?> getDao(String daoName) throws ClassNotFoundException{
		BaseConfig config = new Config();
		String daoClassName = config.getValue(daoName);
		Class<?> dao = Class.forName(daoClassName);
		return dao;
	} 
}
