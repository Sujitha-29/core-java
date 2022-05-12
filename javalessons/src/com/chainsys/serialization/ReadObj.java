package com.chainsys.serialization;


import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class ReadObj 
{
	public static void main(String arg[])throws Exception
    {
         FileInputStream fis =new FileInputStream("d://temp//chainsys.txt") ;
         ObjectInputStream ois = new ObjectInputStream(fis) ;
         Emp1 ob =null;
         try
        {
            ob = (Emp1) ois.readObject();
        }
        catch(Exception e)
        {
            System.out.println("Exception during deserialization: " +e);
        }
        finally
        {
            try
            {
                ois.close();
            }
            catch(Exception e)
            {
                System.out.println("Exception during ois close: " + e);
            }
        }
        if(null!=ob)
        {
            System.out.println(ob.getId() +" "+ ob.Name);
            System.out.println("HashCode "+ob.hashCode());            
        }
    }
}




