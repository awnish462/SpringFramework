package com.awnish.bean;

import java.util.Date;


public class WishMessageGenerator {
	
	//HAS-A relation 
	private Date date;
	
	public void setDate(Date date) {
		this.date= date;
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
		
		return "Good Night"+hour;
		
	}

}
