package com.lanou.service;

import com.lanou.bean.User;

/**
 * MVCҵ���
 * ��Ҫ����д�û�Ҫִ�е�ҵ���߼�
 * */
public interface UserService {
	/**
	 * �û���½ҵ��
	 * @param user ��װ��½���˺ź�����
	 * @return true:��½�ɹ�
	 *			false:��½ʧ�� 
	 **/
	public boolean login(User user);
	
	/**
	 * �û�ע��ҵ��
	 * @param user ��װ�û�ע����Ϣ
	 * @return true:ע��ɹ�
	 *			false:ע��ʧ�� 
	 **/
	public boolean regist(User user);
	
	public boolean isUsernameExists(String username);
	
}
