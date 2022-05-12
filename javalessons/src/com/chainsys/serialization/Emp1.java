package com.chainsys.serialization;

import java.io.Serializable;

public class Emp1 implements Serializable 
{
	private final int id;
	public String Name;
	public Emp1(int v1 , String sName)
	{
		id=v1;
		Name=sName;
	}
	public int getId()
	{
		return id;
	}
	public String Name()
	{
		return Name;
	}
	@Override
	public boolean equals(Object obj)
	{
		Class c1=obj.getClass();//provide metadata about class
		boolean flag=false;
		if(c1==this.getClass())
		{
			Emp1 other=(Emp1) obj;
			if(this.hashCode()==other.hashCode())
		    flag=true;
		}
		return flag;
	}
	public int hashcode()
	{
		return this.id;
	}
}
