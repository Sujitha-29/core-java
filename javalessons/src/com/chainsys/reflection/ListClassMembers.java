package com.chainsys.reflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Scanner;


public class ListClassMembers {

	public static void main(String args[])
	  {
		// printClassInfo(obj);
		// testA();
		//lateBinding();
		// queryTypeInfo();
		testsetAccessible() ;
		//Class<Actor> actorClass=(Class<Actor>)actor.getClass();
		//string firstString="Its August";
	    //printClassInfo(firstString);
	}
	public static void printClassInfo(Object ob)
	  {
		 Class<?> classreflected= ob.getClass();
		 //class<?>contains meta data of the class
		 System.out.println(classreflected.getName());
		 System.out.println("Constructors:");
	     Constructor<?> constructorlist[] = classreflected.getConstructors();//return an array
	     for(int i = 0; i < constructorlist.length; i++)
	     {
	       System.out.println("\t" + constructorlist[i]);
	     }
	     //
	     System.out.println("Methods:");
	     Method methodlist[] = classreflected.getMethods();//Method object is an functional pointer(pointer that points to a function)
	     for(int i = 0; i < methodlist.length; i++)
	     {
	   	  methodlist[i].setAccessible(true);
	      System.out.println("\t Method Name: " + methodlist[i].getName()+
	       		" ParameterCount "+ methodlist[i].getParameterCount()+
	       		" returnType "+ methodlist[i].getReturnType());
	     }
	     
	  }
	public static void earlyBinding()
	{
		Actor actorReference=new Actor();
		actorReference.Name="SK";
		actorReference.city="Chennai";
		actorReference.printCity();
		actorReference.printName();	
	}
	public static void lateBinding()
	{
		java.util.Scanner sc = new Scanner(System.in);
		try
		{			
			System.out.println("Enter Class Name");
			String className = sc.nextLine();
			// load the class -- A a1;
			Class<?> classReference = Class.forName(className);
			// create Object a1=new A();
			Object obj = classReference.getDeclaredConstructor().newInstance();			
			System.out.println("Class Name " + obj.getClass().getName());
			System.out.println("Hash Code " + obj.hashCode());
			System.out.println("Parent class" + classReference.getSuperclass().getName());
			int mod=classReference.getModifiers();
			System.out.println("IsPublic" + Modifier.isPublic(mod));
			System.out.println("IsPrivate" + Modifier.isPrivate(mod));
			System.out.println("IsAbstract" + Modifier.isAbstract(mod));
			System.out.println("IsProtected" + Modifier.isProtected(mod));
			//System.out.println("Parent class" + classReference.getModifiers());
		}catch (Exception e) 
		{
			System.out.println("Exception: " + e);
		}
		finally
		{
			sc.close();
		}
	}
	public static void queryTypeInfo()
	{
		java.util.Scanner sc = new Scanner(System.in);
		try
		   {
			System.out.println("Enter Class Name");
			String cname = sc.nextLine();
			Class<?> classReferenace = Class.forName(cname);
			System.out.println("Constructors:");
			Constructor<?> clist[] = classReferenace.getConstructors();
			for (int i = 0; i < clist.length; i++) {
				System.out.println("\t" + clist[i]);
			}
			System.out.println("Fields:");
			Field flist[] = classReferenace.getFields();
			for (int i = 0; i < flist.length; i++)
			{
				flist[i].setAccessible(true);
				String modifier = ConstantsUtil.getModifierName(flist[i].getModifiers(),Class.forName("java.lang.reflect.Modifier"));
				System.out.println("\t" + flist[i].getType() + " " + flist[i].getName() + " Modifier " +modifier );
			}
			System.out.println("Methods:");
			Method mlist[] = classReferenace.getMethods();
			for (int i = 0; i < mlist.length; i++) 
			{
				mlist[i].setAccessible(true);
				System.out.println("\t Method Name: " + mlist[i].getName() + " ParameterCount" + mlist[i].getParameterCount() + " returnType " + mlist[i].getReturnType());
				if (mlist[i].getParameterCount() > 0) 
				{
					Parameter[] param = mlist[i].getParameters();
					for (Parameter p1 : param)
					{
						System.out.println("\t\t" + p1.getName() + " " + p1.getParameterizedType().getTypeName());
					}
				}
			}
		} catch (Exception e) 
		{
			System.out.println("Exception: " + e);
		}
		finally
		{
			sc.close();
		}
	}
	public static void testA()
    {
   	 String s1="Hello";
   	 printClassInfo(s1);
   	 Integer x=2000;
   	 printClassInfo(x);
   	 Emp firstEmp=new Emp();
   	 printClassInfo(firstEmp);
   	 Actor hero=new Actor();
   	 printClassInfo(hero);
   	 
    }
	public static void testB()
	{
		String classname="com.chainsys.reflection.Actor";
		 Class<?> actorclass = null;
		 try
		 {
			actorclass=Class.forName(classname); // Actor actorclass=null;
		 }catch (ClassNotFoundException e1) 
		 {
			e1.printStackTrace();
		 } 
		 Object obj = null;
		 try 
		 {
			//obj=actorclass.newInstance(); // new Actor();
		    obj = actorclass.getDeclaredConstructors()[0].newInstance();
		 }catch (IllegalArgumentException e)
		 {
				e.printStackTrace();
				return;
		 } 
	     catch (InvocationTargetException e)
		 {
				e.printStackTrace();
				return;
		 } catch (SecurityException e)
		 {
				e.printStackTrace();
				return;
		 }catch (InstantiationException e)
		 {
				e.printStackTrace();
				return;
		 } catch (IllegalAccessException e) 
		 {
				e.printStackTrace();
				return;
		 }
		 printClassInfo(obj);
		
	}
	public static void testsetAccessible() 
	{
		try 
		{
			String cname = "com.chainsys.reflection.Actor";
			Class<?> classReference = Class.forName(cname);
			Object objReference = classReference.getDeclaredConstructor().newInstance();
            // city is default access modifier
			Field fieldCity = objReference.getClass().getDeclaredField("pincode");
			fieldCity.setAccessible(true);
			fieldCity.set(objReference,625006);
			Object cityFieldInstance = fieldCity.get(objReference);
			System.out.println(cityFieldInstance);
       }catch (Exception e) 
		{
			System.out.println("Exception: " + e);
		}
	}

}
