package com.chainsys.interfaces;

public class Calculator implements ICalculator {

	@Override
	public int add(int v1, int v2) 
	{
		int x=v1+v2;
        return x;
	}

	@Override
	public int multiply(int v1, int v2) {
		int x=v1*v2;
        return x;
	}

	@Override
	public int divide(int v1, int v2) {
		int x=v1/v2;
        return x;
	}

}
