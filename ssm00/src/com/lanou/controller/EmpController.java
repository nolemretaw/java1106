package com.lanou.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lanou.bean.Emp;
import com.lanou.service.EmpService;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@RequestMapping(value="/showAll",method=RequestMethod.GET)
	@ResponseBody
	public List<Emp> findAllEmp(){
		List<Emp> emps = empService.findAllEmp();
		return emps;
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public boolean deleteEmpById(@PathVariable("id") int id){
		empService.deleteEmpById(id);
		System.out.println(id);
		return true;
	}
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Emp toUpdate(@PathVariable("id") int id,HttpServletRequest request){
		Emp emp = empService.findEmpById(id);
		return emp;
	}
	
	
	@RequestMapping(value="/updateEmp",method=RequestMethod.PUT)
	@ResponseBody
	public boolean updateEmp(@RequestBody Emp emp) {
		System.out.println("updateEmp="+empService.update(emp));
		return true;
	}
	
	@RequestMapping(value="/addEmp",method=RequestMethod.POST)
	@ResponseBody
	public boolean addEmp(@RequestBody Emp emp) {
		empService.addEmp(emp);
		return true;
	}
	
}
