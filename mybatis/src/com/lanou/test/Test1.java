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
		//1�������������ļ�����ȡSqlSessionFactory��������
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
		//�ȸ���id��ȡһ��user����
		User user = session.selectOne("userMapper.findUserById",5);
		user.setId(5);
		user.setUsername("���");
		user.setPassword("123");
		user.setAge(23);
		user.setGender("Ů");
		System.out.println(user);
		int rows = session.update("userMapper.updateUser", user);
		session.commit();
		System.out.println("�޸�rows:"+rows);
		session.close();
	}

	private static void deleteUserById(SqlSessionFactory factory) {
		SqlSession session = factory.openSession();
		int rows = session.delete("userMapper.deleteUserById", 8);
		//�ύ����
		session.commit();
		System.out.println("ɾ���ɹ���"+rows);
		session.close();
	}

	private static void addUser(SqlSessionFactory factory) {
		SqlSession session = factory.openSession();
		User user = new User();
		user.setUsername("�����");
		user.setPassword("1111");
		user.setAge(25);
		user.setGender("��");
		int rows = session.insert("userMapper.addUser", user);
		System.out.println("���ݲ���ɹ���rows="+rows);
		//�ύ����
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

	/**��ҳ��ѯ
	 * ����������
	 * page:ҳ��
	 * pageSize:ҳ��
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

	/**��ѯ��¼��*/
	private static void CountAll(SqlSessionFactory factory) {
		SqlSession session = factory.openSession();
		int count = session.selectOne("userMapper.CountAll");
		System.out.println("�ܼ�¼����"+count);
	}

	/**��ѯ����user���˺ź�����*/
	private static void findAllNameAndPwd(SqlSessionFactory factory) {
		// ����SqlSession����
		SqlSession session = factory.openSession();
		List<Map<String,String>> list = session.selectList("userMapper.findAllNameAndPwd");
		for (Map<String, String> map : list) {
			System.out.println(map);
		}
	}

	/**����idֻ����ĳ��user�˺ź����� */
	private static void findNameAndPwdById(SqlSessionFactory factory) {
		// ����SqlSession����
		SqlSession session = factory.openSession();
		Map<String, String> map = session.selectOne("userMapper.findNameAndPwdById",1);
		System.out.println(map);
		session.close();
	}
	

	/**
	 * �����˺ź������ѯuser
	 * */
	private static void login(SqlSessionFactory factory) {
		// ����SqlSession����
		SqlSession session = factory.openSession();
//		Map<String, Object> map = new HashMap<>();
//		//keyֵ��ռλ������һ��
//		map.put("username", "kity");
//		map.put("password", "1234");
//		User user = session.selectOne("userMapper.findUserByNameAndPwd",map);
		
		//���ռλ�����������ʵ�����
		User user = new User();
		user.setUsername("kity");
		user.setPassword("1234");
		User findUser = session.selectOne("userMapper.findUserByNameAndPwd",user);
		System.out.println("user:"+user);
		System.out.println("findUser:"+findUser);
		
		session.close();
	}

	/**�������ֽ���ģ����ѯ
	 * % ����0��������ַ�
	 * _ ����һ���ַ�
	 * */
	private static void findUserLikeName(SqlSessionFactory factory) {
		// ����SqlSession����
		SqlSession session = factory.openSession();
		//��ѯ�����д���i�ַ�
//		String username = "%i%";
		//��ѯ�ڶ�����ĸΪi��
		String username = "_i%";
		List<User> users = session.selectList("userMapper.findUserLikeName",username);
		for (User user : users) {
			System.out.println(user);
		}
		session.close();
	}

	private static void findAll(SqlSessionFactory factory) {
		SqlSession session = factory.openSession();
		//namespace.idֵд�������������sqlӳ���ļ���ͬ����id�ظ�
		List<User> users = session.selectList("userMapper.findAll");
		for (User user : users) {
			System.out.println(user);
		}
		session.close();
	}

	private static void findUserById(SqlSessionFactory factory) {
		//2��ͨ��������ȡSqlSession����
		SqlSession session = factory.openSession();
		
		//3��ͨ��id��ȡ��ִ��sqlӳ���ļ���sql���
		//��һ��������sql�����id,�ڶ�������������ռλ����ֵ
		
		User user = session.selectOne("userMapper.findUserById", 2);
		System.out.println("user:"+user);

		//4���ر���Դ
		session.close();
	}

}
