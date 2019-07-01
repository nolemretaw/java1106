package com.lanou.dao;

import java.util.List;

import com.lanou.bean.TeaAndStu;

public interface TeaAndStuMapper {
	public List<TeaAndStu> findTeaAndStuById(int id);
}
