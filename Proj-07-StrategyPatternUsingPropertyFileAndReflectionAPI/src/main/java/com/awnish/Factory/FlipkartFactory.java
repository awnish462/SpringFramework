package com.awnish.Factory;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.awnish.comp.Courier;
import com.awnish.comp.Flipkart;

public class FlipkartFactory {
	private static Properties props;
	
	static {
		System.out.println("FlipkartFactory.staticblock");
		try {
			FileInputStream fis=new FileInputStream("src/main/java/com/awnish/commons/info.properties");
			props=new Properties();
			props.load(fis);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//implementing Factory Pattern with Strategy Pattern
	public static Flipkart createFlipkart() throws Exception {
		Flipkart fpkt=new Flipkart();
		
		Class c=Class.forName(props.getProperty("courier.name"));
		Constructor[] cons=c.getDeclaredConstructors();
		Courier courier=(Courier)cons[0].newInstance();
		fpkt.setCourier(courier);
		return fpkt;
		
	}

}
