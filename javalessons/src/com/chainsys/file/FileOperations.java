package com.chainsys.file;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileOperations {

	public static void main(String[] args) throws IOException 
	{
		//createfile();
		//deletefile();
		//renamefile();
		//appendDataToFile();
		//readDataFromFile();
		//moveFile();
		//copyFile();
		 modifyDataInFile(); 
	}
	public static void createfile()
	{
	  File file=new File("d:\\temp\\NewFile.txt");
	  try {
		  if(file.createNewFile())
		  {
			  System.out.println("File created " + file.getName());
		  }
		  else
		  {
			  System.out.println("File already exists");
		  }
	  }catch(IOException e)
	  {
		  System.out.println("An error occured");
		  e.printStackTrace();
	  }
	  
	}
	public static void deletefile()
	{
		File file=new File("d:\\temp\\sujitha.txt");
		if(file.delete())
		{
			System.out.println("File is deleted");
		}
		else
		{
			System.out.println("failed to delete the file");
		}
	}
	public static void renamefile()
	{
		File oldName=new File("d:\\temp\\NewFile.txt");
		File newName=new File("d:\\temp\\chainsys.txt");
		if(oldName.renameTo(newName))
		{
			System.out.println("File Name Is Changed");
		}
		else
		{
			System.out.println("Error");
		}
	}
	public static void appendDataToFile()
	{
		String data=" chainsys,chennai";
		try
		{
			FileWriter fw = new FileWriter("d:\\temp\\NSK.txt",true);
			fw.write(data);
			System.out.println("Data appended");
			fw.close();
		}catch(IOException e)
		{
			System.out.println("File append error");
		}
	}
	public static void modifyDataInFile() throws IOException
	{
	         FileOutputStream file = new FileOutputStream("d:/temp/chainsys.txt");
	         String modify = "Madurai.";
	         byte[] b = modify.getBytes();
	         file.write(b);
	         file.close();
	         System.out.println("Modification Complete");
	         FileInputStream file1 = new FileInputStream("d:/temp/chainsys.txt");
	         int i;
	         while((i=file1.read())!=-1)
	         {
	         System.out.print((char)i);
	         }
	         file1.close(); 
	    
	}
	public static void  readDataFromFile()
	{
		try
		{
			File file=new File("d:\\temp\\reader.txt");
			Scanner sc=new Scanner(file);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
		}catch(IOException e)
		{
			System.out.println("Error");
		}
	}
	public static void moveFile()
	{
		String fromFile="d:\\temp\\reader.txt";
		String toFile="d:\\temp\\New folder\\reader.txt";
		Path source=Paths.get(fromFile);
		Path target=Paths.get(toFile);
		try
		{
          java.nio.file.Files.move(source, target);
          System.out.println("File moved");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
  	public static void copyFile()
	{
	    try 
	        {
	            InputStream input=new FileInputStream("d:/temp/NSK.txt");
	            OutputStream output=new FileOutputStream("d:/temp/Ajay.txt ");
	            int info=input.read();
	            while(info != -1)
	            {
	                output.write(info);
	                info=input.read();
	            }
	            output.flush();
	            System.out.println("File copied");
	        }
	        catch (IOException e) 
	        {
	            e.printStackTrace();
	        }
	    }
	}


