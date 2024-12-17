package com.awnish.controller;

import com.awnish.service.EmployeeDTO;
import com.awnish.service.IEmployeeMgmtService;

public class MainControllerImpl implements IMainController {
	
	//HAS-A relation
	private IEmployeeMgmtService empService;
	
	public MainControllerImpl(IEmployeeMgmtService empService) {
		// TODO Auto-generated constructor stub
		this.empService=empService;
	}
	@Override
	public String processEmployee(EmployeeVo vo) throws Exception {
		EmployeeDTO dto=new EmployeeDTO();
		dto.setAddr(vo.getAddr());
		dto.setAge(vo.getAge());
		dto.setEmpNo(vo.getEmpNo());
		dto.setName(vo.getName());
		dto.setSalary(vo.getSalary());
		
		//use service
		String result=empService.registerEmployee(dto);
		
		return result;
	}

}
