package com.chainsys.arrays;

public class ArraySolution {
	public static void Bubblesort()
	{
		int[] nos= {11,23,4,56,32,323,76,8,54,56};
		System.out.println("Original valuesnBefore");
		for(int index=0;index<nos.length;index++)
		{
			System.out.println(nos[index] + ",");
		}
		System.out.println();
		int count=nos.length;
		int temp=0;
		for(int i=0;i<count;i++)
		{
		
		   for(int j=0;j<count-1;j++)
		    {
			   if(nos[j+1]<nos[j])
			    {
		         temp=nos[j];
			     nos[j]=nos[j+1];
			     nos[j+1]=temp;
			     temp=0;
		        }
		    }
		}
		System.out.println("Value after Sort");
		for(int index=0;index<nos.length;index++)
		{
			System.out.println(nos[index] + ",");
		}

    }
}
