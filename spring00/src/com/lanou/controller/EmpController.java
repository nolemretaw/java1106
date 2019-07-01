package com.lanou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//¿ØÖÆ²ã

import com.lanou.bean.Emp;
import com.lanou.service.EmpService;
@Controller("empController")
public class EmpController {
	@Autowired
	private EmpService empService;
	public List<Emp> findAll(){
		List<Emp> emps = empService.findAll();
		return emps;
	}
	public void insert(Emp emp){
		empService.insert(emp);
	}
	public void delete(int id){
		empService.deleteEmpById(id);
	}
	public void update(Emp emp){
		empService.updateEmp(emp);
	}
	public Emp search(int id){
		return empService.findEmpById(id);
	}
}
