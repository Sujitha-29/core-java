package com.chainsys.charstreams;

import java.io.IOException;
import java.io.InputStreamReader;

public class INputRead {

	public static void main(String[] args) throws IOException {
		char c;
		InputStreamReader sr= new InputStreamReader(System.in);
		System.out.println("Enter characetr,'q' to quit");
		do
		{
			c=(char) sr.read();
			System.out.println(c);
		}
		while(c!='q');

	}

}
