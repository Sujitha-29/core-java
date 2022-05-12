package com.chainsys.collections;



public class Emp  {
	private final int id;
	public String Name;
	public Emp(int v1)
	{
		id=v1;
	}
	public int getId()
	{
		return id;
	}
	@Override
	public boolean equals(Object obj)
	{
		Class c1=obj.getClass();
		boolean flag=false;
		if(c1==this.getClass())
		{
			Emp other=(Emp) obj;
			if(this.hashCode()==other.hashCode())
				flag=true;
		}
		return flag;
	}
	@Override
	public int hashCode()
	{
		return this.id;
	}


	

}
