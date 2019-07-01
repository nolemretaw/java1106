package com.lanou.jdbcutil;
/**��������dao����Ĺ���*/
public class DaoFactory {
	public static Class<?> getDao(String daoName) throws ClassNotFoundException{
		BaseConfig config = new XmlConfig();
		String daoClassName = config.getValue(daoName);
		Class<?> dao = Class.forName(daoClassName);
		return dao;
	} 
}
