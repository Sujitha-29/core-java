package com.chainsys.exceptions;
import java.util.Scanner;

public class NestedTry {
	static String[] data;

	public static void main(String[] args) {
		int num=0;
		int numValue=0;
		data=new String[2];
		java.util.Scanner sc=null;
		try
		{
			sc=new Scanner(System.in);
			try
			{
				System.out.println("Enter value foe X");
				data[0]=sc.nextLine();//123--abcd--123
				//data[6]=sc.nextLine();show an error.
				numValue=Integer.parseInt(data[0]);//data[2]
				System.out.println("The Square is" + numValue*numValue);
						
			}
			catch(NumberFormatException nb)
			{
				System.out.println("Not a number!");
				
			}
			num=data.length;
			System.out.println("Array Length"+num);
		}catch(ArrayIndexOutOfBoundsException ne)
		{
			System.out.println("ArrayIndexOutOfBoundsException-No aruguments given!!!");
			
		}
		catch(Exception er)
		{
			System.out.println("Exception "+ er.getMessage());
		}

	}

}
