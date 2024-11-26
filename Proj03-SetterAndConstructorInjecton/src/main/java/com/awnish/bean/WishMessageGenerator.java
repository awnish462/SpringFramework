package com.awnish.bean;

import java.util.Date;


public class WishMessageGenerator {
	
	//HAS-A relation 
	private Date date;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator() 0 param");
	}
	
	public WishMessageGenerator(Date date) {
		
		this.date=date;
		System.out.println("WishMessageGenerator.WishMessageGenerator() 1 param");
		System.out.println(date.toString());
	}
	
	public void setDate(Date date) {
		this.date=date;
		System.out.println("WishMessageGenerator.setDate() Setter Method");
		System.out.println(date.toString());
		
	}
	
	public String generateMessage(String user) {
		//get current hour of the day
		int hour= date.getHours();
		
		//generate Message
		if(hour<12) {
			return "Good Morning"+hour;
		}else if(hour>12 && hour <16) {
			return "Good Afternoon"+hour;
		}else if(hour>16 && hour<18){
			return "Good Evening"+hour;
		}
		
		System.out.println("Final Date:- "+date.toString());//Here setter injection will override constructor injection
		                                                    //because constructor injection is faster than setter injection
		                                                    // in execution 
		
		return "Good Night"+hour;
		
	}

}
