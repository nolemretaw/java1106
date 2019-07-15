package com.lanou.controller;

import java.util.List;

import com.lanou.service.cluster.ClusterEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lanou.bean.master.Emp;
import com.lanou.service.master.EmpService;

import javax.annotation.Resource;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Resource(name = "empService")
	private EmpService empService;

	@Resource(name = "clusterEmpService")
	private ClusterEmpService clusterEmpService;

	@RequestMapping("/test")
	@ResponseBody
	public String sayhello(){
		return "hello";
	}

	/**跳转到templates目录下的thymeleaf引擎页面*/
	@RequestMapping("/listEmp")
	public String listEmp(Model model) {
		List<Emp> emps = empService.findAllEmp();
		model.addAttribute("emps",emps);
		return "show";
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public boolean deleteEmpById(@PathVariable("id") int id){
		empService.deleteEmpById(id);
		System.out.println(id);
		return true;
	}
	
	
	@RequestMapping(value="/updateEmp",method=RequestMethod.PUT)
	@ResponseBody
	public boolean updateEmp(@RequestBody Emp emp) {
		empService.update(emp);
		return true;
	}
	
	@RequestMapping(value="/addEmp",method=RequestMethod.POST)
	@ResponseBody
	public boolean addEmp(@RequestBody Emp emp) {
		System.out.println("添加员工:"+emp);
		empService.addEmp(emp);
		return true;
	}

	@Scheduled（cron = "0/5 * * * * ?"）
	@RequestMapping(value = "/mysql2PostgresById/{id}",method = RequestMethod.GET)
	@ResponseBody
	public String mysql2PostgresById(@PathVariable("id") int id ){
		Emp emp = empService.findEmpById(id);
		clusterEmpService.addEmp(emp);
		System.out.println("转存至PostgresDB");
		return "转存至PostgresDB";
	}
	
}
