package com.chainsys.collections;

public class TestEmp {

	public static void main(String[] args) {
		Emp firstEmp=new Emp(111);
		Emp secondEmp=new Emp(111);
		//if id same it return true otherwise it will return false
		System.out.println(firstEmp.hashCode());
		System.out.println(secondEmp.hashCode());
		boolean result=firstEmp.equals(firstEmp);
		System.out.println(result);
		result=firstEmp.equals(firstEmp);
		System.out.println(result);
		result=firstEmp.equals("Hello");
		System.out.println(result);
				

	}

}
