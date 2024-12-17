package com.awnish.service;

import com.awnish.dao.EmployeeBo;
import com.awnish.dao.IEmployeeDao;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService{
	
	IEmployeeDao empDao;
	
	public EmployeeMgmtServiceImpl(IEmployeeDao dao) {
		// TODO Auto-generated constructor stub
		this.empDao=dao;
	}

	@Override
	public String registerEmployee(EmployeeDTO dto) throws Exception {
		double grossSalary=dto.getSalary()*12;
		double netSalary=(dto.getSalary()*12)-(dto.getSalary()*12)*0.10;
		
		EmployeeBo bo=new EmployeeBo();
		bo.setAddr(dto.getAddr());
		bo.setAge(dto.getAge());
		bo.setEmpNo(dto.getEmpNo());
		bo.setName(dto.getName());
		bo.setSalary(dto.getSalary());
		bo.setGrossSalary(grossSalary);
		bo.setNetSalary(netSalary);
		
		int count=empDao.insertEmployee(bo);
		
		if(count==0) {
			return "Employee registration failed";
		}
		
		return "Employee Registered";
	}

}
