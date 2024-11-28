package com.awnish.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.DefaultEventListenerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.awnish.comp.Flipkart;

public class StrategyDesighPatternTest {

	public static void main(String[] args) throws Exception {
		
		//old way
		/*
		 * DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		 * XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		 * reader.loadBeanDefinitions("com/awnish/cnfg/applicationcontext.xml");
		 * 
		 * Flipkart fkpt=factory.getBean("fkpt",Flipkart.class);
		 */
		
		//new way
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/awnish/cnfg/applicationcontext.xml");
		Flipkart fkpt=ac.getBean("fkpt",Flipkart.class);
			
		String result=fkpt.shopping(new String[]{"shirt","pant","sharee","kurta"}, new float[]{4000f,2234f,4422f,4532f});
		System.out.println(result);
	}

}
