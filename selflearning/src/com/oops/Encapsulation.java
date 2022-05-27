package com.oops;

public class Encapsulation 
{
	public static void main(String[] args)
	{
		Student stds=new Student();
		stds.setName("Lila");
		stds.setEmail("abc@gmail.com");
		System.out.println(stds.getAge());
		System.out.println(stds.getName());
		//System.out.println(stds.setEmail(email));
	}
	//Better control of class attributes and methods
}
