package com.chainsys.introduction;

public class Fifth {

        public static void main(String[] args) {
                //printDiamond();
        	printNumbersonetoHundred();
        }
        public static void printNumbersOneToHundred()
        {
                int count=0;
                for(count=1;count<=100;count++)
                {
                        System.out.println(count + " ");
                }
        }
        public static void printNumbersonetoHundred()
        {
        	for(int i=1;i<=100;i++)
        	{
        		if(i%3==0)
        		{
        		   System.out.println("fizz" );
        		}
        		if(i%5==0)
        		{
        			System.out.println("Buzz" );
        		}
        		if(i%3==0 && i%5==0)
        		{
        			System.out.println("Fizz Buzz" + i);
        		}
        		System.out.println(i);
        			
        	}
        }
        public static void printNumbersTenToOne()
        {
                int count=0;
                for(count=10;count>=1;count--)
                {
                        System.out.println(count + " ");
                }
        }
        public static void printMatrix()
        {
                int countA=0;
                for(countA=1;countA<=10;countA++)
                {
                        for(int countB=1;countB<=10;countB++)
                        {
                                System.out.print(countB + " ");
                        }
                        System.out.println();
                }
        }
        public static void printTriangle()
        {
                int countA=0;
                for(countA=1;countA<=10;countA++)
                {
                        for(int countB=1;countB<=countA;countB++)
                        {
                                System.out.print(countB + " ");
                        }
                        System.out.println();
                }
        }
        public static void printTriangleB()
        {
                int countA=0;
                for(countA=1;countA<=10;countA++)
                {
                        for(int countB=10;countB>countA;countB--)
                        {
                                System.out.print(".");
                        }
                        for(int countc=countA;countc>=1;countc--)
                        {
                        System.out.print(countc);
                }
                        System.out.println();
        }
        }
        
public static void printDiamond()
        {
                int countA=0;
                for(countA=1;countA<10;countA++)
                {
                        for(int countB=10;countB>countA;countB--)
                        {
                                System.out.print(".");
                        }
                        for(int countc=countA;countc>=1;countc--)
                        {
                        System.out.print(countc);
                }
                        for(int countD=2;countD<=countA;countD++)
                        {
                        System.out.print(countD);        
                        }
                        System.out.println();
        }
              //for(countA=4;countA>=1;countA--)
                //{
                       // for(int countB=5;countB>countA;countB--)
                        //{
                                //System.out.print(" ");
                       // }
                       // for(int countc=countA;countc>=1;countc--)
                       // {
                      //  System.out.print(countc);
                //}
                        //for(int countD=2;countD<=countA;countD++)
                       // {
                       // System.out.print(countD);        
                       // }
                       // System.out.println();
        //}
        }
}
