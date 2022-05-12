package com.chainsys.introduction;

import java.util.Scanner;

public class Second {

        public static void main(String[] args) {
                //taskA();
                //taskB();
                //System.out.println("End....");
        	//checkAlphabets();
        	//checkRain();
        	Equation();
        }
        public static void taskA()
        {
        int x=100;
        int y=200;
        int z=x+y;
        System.out.println("result="+z);
        }
        public static void taskB()
        {
        int x=100;
        int y=200;
        int z=x+y;
        System.out.println("result="+z);

        }
        public static void checkAlphabets()
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the input");
                String userInput=sc.nextLine();
                sc.close();
                System.out.println("Input is " + userInput);
                char[] nameAsCharacters=userInput.toCharArray();
                int lengthofCharArray=nameAsCharacters.length;
                System.out.println("length of name is"+lengthofCharArray);
                if(lengthofCharArray>8)
                {
                        System.out.println("Input is not less than 8 characters");
                        return;
                }
                else
                {
                	System.out.println("Input is less than 8 characters");
                }
      }
        public static void checkRain()
        {
                java.util.Scanner sc=new java.util.Scanner(System.in); 
                System.out.println("Enter your question");
                String question=sc.nextLine();
                //int i=Integer.parseInt(question);
                System.out.println("Yes");
                String ans=sc.nextLine();
                System.out.println("Bring an umberlla");
                System.out.println("Enter the temperature");
                int temperature=sc.nextInt();
                sc.close();
                if(temperature==32)
                {
                	System.out.println("Bring a heavy jocket");
                }
                else if(temperature>32 && temperature<50)
                {
                	System.out.println("Bring light jocket");
                }
                else
                {
                	System.out.println("No jacket at all");
                }
               
                
        }
        public static void Equation()
        {
        	 java.util.Scanner sc=new java.util.Scanner(System.in); 
        	 int y;
        	 System.out.println("Enter the value of x :");
        	 int x=sc.nextInt();
        	 y=2*x*x+x+5;
        	 System.out.println("Value of y is: " + y);
        }
}