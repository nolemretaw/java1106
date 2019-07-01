package com.lanou.test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.lanou.bean.User;
import com.lanou.bean.User1;

public class Test1 {

	public static void main(String[] args) {
		//1、加载主配置文件，获取SqlSessionFactory工厂对象
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		InputStream in = Test1.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory factory = builder.build(in);
		
//		findUserById(factory);
//		findAll(factory);
//		findUserLikeName(factory);
//		login(factory);
//		findNameAndPwdById(factory);
//		findAllNameAndPwd(factory);
//		CountAll(factory);
//		SeletePage(factory);
//		findAllUser1(factory);
//		addUser(factory);
//		deleteUserById(factory);
		updateUser(factory);
	}
	
	private static void updateUser(SqlSessionFactory factory) {
		SqlSession session = factory.openSession();
		//先根据id获取一个user对象
		User user = session.selectOne("userMapper.findUserById",5);
		user.setId(5);
		user.setUsername("大黄");
		user.setPassword("123");
		user.setAge(23);
		user.setGender("女");
		System.out.println(user);
		int rows = session.update("userMapper.updateUser", user);
		session.commit();
		System.out.println("修改rows:"+rows);
		session.close();
	}

	private static void deleteUserById(SqlSessionFactory factory) {
		SqlSession session = factory.openSession();
		int rows = session.delete("userMapper.deleteUserById", 8);
		//提交事物
		session.commit();
		System.out.println("删除成功："+rows);
		session.close();
	}

	private static void addUser(SqlSessionFactory factory) {
		SqlSession session = factory.openSession();
		User user = new User();
		user.setUsername("令狐冲");
		user.setPassword("1111");
		user.setAge(25);
		user.setGender("男");
		int rows = session.insert("userMapper.addUser", user);
		System.out.println("数据插入成功，rows="+rows);
		//提交事物
		session.commit();
		session.close();
	}

	private static void findAllUser1(SqlSessionFactory factory) {
		SqlSession session = factory.openSession();
		List<User1> user1s = session.selectList("userMapper.findAllUser1");
		for (User1 user1 : user1s) {
			System.out.println(user1);
		}
		session.close();
	}

	/**分页查询
	 * 两个参数：
	 * page:页码
	 * pageSize:页容
	 * 
	 * start:(page-1)*pageSize
	 * end:pageSize
	 * */
	private static void SeletePage(SqlSessionFactory factory) {
		SqlSession session = factory.openSession();
		Map<String, Integer> map = new HashMap<>();
		int page=2;
		int pageSize=3;
		map.put("start",(page-1)*pageSize);
		map.put("end", pageSize);
		List<User> list = session.selectList("userMapper.SeletPage",map);
		for (User user : list) {
			System.out.println(user);
		}
	}

	/**查询记录数*/
	private static void CountAll(SqlSessionFactory factory) {
		SqlSession session = factory.openSession();
		int count = session.selectOne("userMapper.CountAll");
		System.out.println("总记录数："+count);
	}

	/**查询所有user的账号和密码*/
	private static void findAllNameAndPwd(SqlSessionFactory factory) {
		// 创建SqlSession对象
		SqlSession session = factory.openSession();
		List<Map<String,String>> list = session.selectList("userMapper.findAllNameAndPwd");
		for (Map<String, String> map : list) {
			System.out.println(map);
		}
	}

	/**根据id只查找某个user账号和密码 */
	private static void findNameAndPwdById(SqlSessionFactory factory) {
		// 创建SqlSession对象
		SqlSession session = factory.openSession();
		Map<String, String> map = session.selectOne("userMapper.findNameAndPwdById",1);
		System.out.println(map);
		session.close();
	}
	

	/**
	 * 根据账号和密码查询user
	 * */
	private static void login(SqlSessionFactory factory) {
		// 创建SqlSession对象
		SqlSession session = factory.openSession();
//		Map<String, Object> map = new HashMap<>();
//		//key值与占位符名称一致
//		map.put("username", "kity");
//		map.put("password", "1234");
//		User user = session.selectOne("userMapper.findUserByNameAndPwd",map);
		
		//多个占位符，传入参数实体对象
		User user = new User();
		user.setUsername("kity");
		user.setPassword("1234");
		User findUser = session.selectOne("userMapper.findUserByNameAndPwd",user);
		System.out.println("user:"+user);
		System.out.println("findUser:"+findUser);
		
		session.close();
	}

	/**根据名字进行模糊查询
	 * % 任意0个到多个字符
	 * _ 任意一个字符
	 * */
	private static void findUserLikeName(SqlSessionFactory factory) {
		// 创建SqlSession对象
		SqlSession session = factory.openSession();
		//查询名字中带有i字符
//		String username = "%i%";
		//查询第二个字母为i的
		String username = "_i%";
		List<User> users = session.selectList("userMapper.findUserLikeName",username);
		for (User user : users) {
			System.out.println(user);
		}
		session.close();
	}

	private static void findAll(SqlSessionFactory factory) {
		SqlSession session = factory.openSession();
		//namespace.id值写法，避免和其他sql映射文件中同名的id重复
		List<User> users = session.selectList("userMapper.findAll");
		for (User user : users) {
			System.out.println(user);
		}
		session.close();
	}

	private static void findUserById(SqlSessionFactory factory) {
		//2、通过工厂获取SqlSession对象
		SqlSession session = factory.openSession();
		
		//3、通过id获取并执行sql映射文件中sql语句
		//第一个参数：sql定义的id,第二个参数：传入占位符的值
		
		User user = session.selectOne("userMapper.findUserById", 2);
		System.out.println("user:"+user);

		//4、关闭资源
		session.close();
	}

}
