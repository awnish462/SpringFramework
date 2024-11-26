package com.awnish.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.awnish.bean.WishMessageGenerator;

public class ConstructorAndSetterInjection {
	public static void main(String[] args) {
		
		//getting configuration file
//		FileSystemResource fim=new FileSystemResource("src/main/java/com/awnish/cfgs.applicationContext.xml");
		//creating bean factory object or IOC container
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/awnish/cfgs/applicationContext.xml");
		
		Object obj=context.getBean("wmg");
		
		WishMessageGenerator wmg=(WishMessageGenerator)obj;
		
		System.out.print(wmg.generateMessage("awnish"));
	}

}
