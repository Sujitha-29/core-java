package com.chainsys.reflection;

import java.lang.reflect.Method;

public class DemoClassMethodCall
{
	public static void main(String[] args) throws Exception
	{
		//Class,Method,Object,Invoke
		Class<?> mclass=Class.forName("com.chainsys.reflection.DemoClass");
		Method methods=mclass.getMethod("Welcome",String.class);
		Object obj= mclass.newInstance();
		String output= (String)methods.invoke(obj,"Sujitha");
		System.out.println("Output " + output);
	}

}
