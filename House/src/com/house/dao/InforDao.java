package com.house.dao;

import java.util.List;

import com.house.bean.Infor;

public interface InforDao {
	public List<Infor> findAll();
	public int addInfor(Infor infor);
	public int updateInfor(Infor infor);
	public Infor findInforById(int id);
	public List<Infor> findByKindAndState(String kind,String state);
	public void deleteById(int id);
	public int countAll();
	public int findByInfor(Infor infor);
}
