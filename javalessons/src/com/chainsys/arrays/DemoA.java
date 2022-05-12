package com.chainsys.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class DemoA {
	public static void creatinganotherArrays()
	{
		int days[]=null;
		if(days==null)
		{
			System.out.println("days is null");
		}
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size for days");
		int size=scanner.nextInt();
		scanner.close();
		//days is instantiated with a length equal to size
		days=new int[size];
		if(days!=null)
		{
			System.out.println("Days is not null");
		}
		int lengthofdays=days.length;
		System.out.println("No of days" + lengthofdays);
		for(int i=0;i<lengthofdays;i++)
		{
			days[i]=(int)(Math.random()*10);
		}
		for(int x:days)
		{
			System.out.println(x);
		}
	}
	public static void createMonthArray()
	{
		int month[]=new int[12];
		int lengthofmontharray=month.length;//12
		System.out.println("Array Lenth is " + lengthofmontharray);
		for(int i=0;i<lengthofmontharray;i++)
		{
			System.out.println(i + "-" + month[i] + ",");//month will be zero
		}
		System.out.println();
		month[1]=31;
		for(int i=0;i<lengthofmontharray;i++)
		{
			System.out.println(i + "-" + month[i] + ",");
		}
		try
		{
			month[12]=31;
			System.out.println("Hii...");
			//month[11]=31;upper index is length-1	
		}catch(Exception err)
		{
			System.out.println("ERROR!!!" + err.getMessage());
		}
		int anotherMonth[]= {31,28,31,30,31,30,31,31};
		lengthofmontharray=anotherMonth.length;
		System.out.println("Array length is "+lengthofmontharray);
		for(int i=0;i<lengthofmontharray;i++)
		{
		    System.out.println(i + "-" + anotherMonth[i]+",");	
		}
	}
	public static void workingWithArrayClass()
	{
		int numberArray[]=new int[10];
		for(int i=0;i<10;i++)
		{
		numberArray[i]=-3*i;
		}
		System.out.println("Original contents");
		int lengthofarray=numberArray.length;
		System.out.println("Array length is" + lengthofarray);
		for(int i=0;i<lengthofarray;i++)
		{
			System.out.println(numberArray[i]+"");
		}
	}


}

