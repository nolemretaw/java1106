package com.lanou.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lanou.bean.Emp;
import com.lanou.service.EmpService;
import com.sun.corba.se.impl.protocol.giopmsgheaders.RequestMessage;

@Controller
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	private EmpService empService;
	
	@RequestMapping("/listAll")
	public String listAll(Model model){
		List<Emp> emps= empService.findAll();
		model.addAttribute("emps",emps);
		return "list";
	}
	
	@RequestMapping(value="/showAll",
					method=RequestMethod.GET)
	@ResponseBody
	public List<Emp> showAll(){
		List<Emp> emps = empService.findAll();
		return emps;
	}
	
	@RequestMapping(value="/{id}",
			method=RequestMethod.DELETE)
	@ResponseBody
	public boolean deleteEmpById(@PathVariable("id") int id){
		System.out.println("id="+id);
		empService.deleteEmpById(id);
		return true;
	}
	
	
	
	
}
