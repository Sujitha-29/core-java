package com.chainsys.introduction;

public class Sixth
{

        public static void main(String[] args) {
               EvenNumber();
        	//Number();
        }
        
public static void EvenNumber() {
        int i, remainder=0,temp;
        int number=1546903;
        temp=number;
        for(i=0;i<=temp;i++)
       {
        	remainder=temp%10;
               if(remainder%2==0)
                {
                        System.out.println(remainder);
        
                }
               temp=temp/10;
        }
        
}
public static void Number()
{ 
	java.util.Scanner sc=new java.util.Scanner(System.in); 
    System.out.println("Enter the number");
    int Number=sc.nextInt();
    sc.close();
    int remainder,temp,sum=0;
    temp=Number;
    while(Number>0)
    {
    	remainder=Number%10;
    	sum=sum+(remainder*remainder*remainder);
    	Number=Number/10;
    }
    if(sum==temp)
    {
    	System.out.println("Same as input");
    }	
    else
    {
    	System.out.println("Different Number");
    }
    
	
}
}