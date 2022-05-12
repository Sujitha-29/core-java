package com.chainsys.interfaces;

public class TestCalculator 
{

		public static void main(String[] args) 
		{
			ICalculator c1=new Calculator();
			System.out.println("Addition  is "+ c1.add(9, 8));
			System.out.println("Division  is "+ c1.divide(50,2));
			System.out.println("Multiplication  is "+ c1.multiply(8, 8));
		}

	

}
