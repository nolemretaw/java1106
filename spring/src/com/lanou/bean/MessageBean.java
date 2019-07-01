package com.lanou.bean;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/**
 *测试各种类型值的注入 
 */
public class MessageBean {
	private String name;
	private int age;
	private List<Object> list;
	private Map<String, String> books;
	private Set<String> cities;
	private Properties props;
	
	public void show(){
		System.out.println("Message Name:"+name);
		System.out.println("Message Age:"+age);
		System.out.println("------List集合的遍历------");
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("------Map集合的遍历------");
		Set<Entry<String, String>> set = books.entrySet();
		for (Entry<String, String> en : set) {
			System.out.println(en.getKey()+"/"+en.getValue());
		}
		
		System.out.println("------Set集合的遍历------");
		for (String city : cities) {
			System.out.println(city);
		}
		
		System.out.println("------properties集合的遍历------");
		Set<Object> keys = props.keySet();
		for (Object key : keys) {
			System.out.println(key+"/"+props.getProperty((String)key));
		}
	}
	
	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public Map<String, String> getBooks() {
		return books;
	}

	public void setBooks(Map<String, String> books) {
		this.books = books;
	}

	public Set<String> getCities() {
		return cities;
	}

	public void setCities(Set<String> cities) {
		this.cities = cities;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
