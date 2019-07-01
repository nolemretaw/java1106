package com.lanou.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.lanou.bean.Emp;
import com.lanou.service.EmpService;
/** ¿ØÖÆ²ã*/
@Controller("empController")
public class EmpController {
	@Autowired
	private EmpService empService;
	public List<Emp> service(){
		List<Emp> emps = empService.findAll();
		return emps;
	}
	public void insert(Emp emp){
		empService.insert(emp);	
	}
	/*public EmpService getEmpService() {
		return empService;
	}
	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}*/
	
}
