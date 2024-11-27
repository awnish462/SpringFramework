package com.awnish.test;

import com.awnish.Factory.FlipkartFactory;
import com.awnish.comp.Flipkart;

public class StrategyDesighPatternTest {

	public static void main(String[] args) throws Exception {
		
		
	    Flipkart fpkt = FlipkartFactory.createFlipkart();
			
		String result=fpkt.shopping(new String[]{"shirt","pant","sharee","kurta"}, new float[]{4000f,2234f,4422f,4532f});
		System.out.println(result);
	}

}
