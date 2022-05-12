package com.chainsys.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    
    public static void main(String args[]) {
    int charfromfile;
    FileInputStream fin=null; 
    String fname="d:\\temp\\Ajitha.txt";
    try {
    fin = new FileInputStream (fname);
    }
    catch (FileNotFoundException e)
    {
    System.out.println("File Not Found");
    return;
    }
    // checking if data isAvailable
    try
    {
    do {
    charfromfile = fin.read();
    if (charfromfile != -1) 
        System.out.print((char) charfromfile);
    } 
    while (charfromfile != -1);
    } catch (IOException e) {
    System.out.println("Error in read "+e.getMessage());
    }
    finally
    {
    try
    {
    if (null!=fin) fin.close();
    } catch (IOException el)
    {
    System.out.println (el.getMessage());
    }
}}}