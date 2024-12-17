package com.awnish.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.awnish.controller.EmployeeVo;
import com.awnish.controller.MainControllerImpl;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext appContx = new ClassPathXmlApplicationContext("com/awnish/config/bean.xml");
		Scanner scn = new Scanner(System.in);
		int oper = 0;
		int empNo, age;
		String name, addr;
		double salary;
		EmployeeVo vo = null;

		System.out.println("Enter 1 for insert operation");
		System.out.println("Enter 2 for delete operation");
		oper = scn.nextInt();

		switch (oper) {
		case 1: {

			System.out.println("Enter empId");
			empNo = scn.nextInt();
			System.out.println("Enter age");
			age = scn.nextInt();
			System.out.println("Enter name");
			name = scn.next();
			System.out.println("Enter address");
			addr = scn.next();
			System.out.println("Enter salary");
			salary = scn.nextDouble();

			vo = new EmployeeVo();
			vo.setEmpNo(empNo);
			vo.setAge(age);
			vo.setName(name);
			vo.setAddr(addr);
			vo.setSalary(salary);
			break;
		}
		case 2: {
			System.out.println("Enter empNo");
			empNo = scn.nextInt();
			vo = new EmployeeVo();
			vo.setEmpNo(empNo);
		}
		}

		MainControllerImpl mainCon = appContx.getBean("mainContx", MainControllerImpl.class);

		// invoke Business Logic
		try {
			String msg = mainCon.processEmployee(vo);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Internall Error");
		}

	}
}
