package com.awnish.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Hello world!
 */
public class App {
	public static <T> T m1(Class<T> cls)  {// here <T> tells the compiler that it is of generic type(3rd word)
		try {
		if(cls.equals(App.class)) {
		   return cls.getDeclaredConstructor().newInstance();
		}
		}catch(Exception e) {
			
		 throw new IllegalArgumentException("");
		}
		throw new IllegalArgumentException("Invalid class");
	}
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    	Class<?> cls=App.class;
    	System.out.print(m1(cls));
    	
        
    }
}
