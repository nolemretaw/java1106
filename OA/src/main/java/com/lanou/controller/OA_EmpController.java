package com.lanou.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lanou.bean.OA_Emp;
import com.lanou.service.OA_EmpService;

@Controller
@RequestMapping("/oa_emp")
public class OA_EmpController {
	@Autowired
	private OA_EmpService empService;
	
	@RequestMapping("/ys")
	public String findAllEmp(Model model){
		List<OA_Emp> emps = empService.findAllEmp();
		System.out.println(emps);
		model.addAttribute("emps",emps);
		return "index";
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	@ResponseBody
	public boolean update(@RequestBody OA_Emp emp){
		empService.updateEmp(emp);
		return true;
	}
	
	@RequestMapping(value="updateEmp",method = RequestMethod.PUT)
	@ResponseBody
	public boolean updateEmp(@RequestBody OA_Emp emp){
		empService.updateEmp(emp);
		return true;
	}
	@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
	@ResponseBody
	public boolean deleteEmpById(@PathVariable("id") int id){
		empService.deleteEmpById(id);
		return true;
	}
	
	@RequestMapping (value="/addEmp",method=RequestMethod.POST)
	@ResponseBody
	public boolean addEmp(@RequestBody OA_Emp emp){
		empService.addEmp(emp);
		return true;
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	@ResponseBody
	public OA_Emp findAllById(@PathVariable("id") int id,HttpServletRequest request){
		OA_Emp emp = empService.findEmpById(id);
		return emp;
	}
	
}
