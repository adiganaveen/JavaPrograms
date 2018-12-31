package com.bridgelabz.datastructuresprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

import com.bridgelabz.util.DataStructureUtility;

public class UnOrderedList  {
	public static void main(String[] args) throws FileNotFoundException 
	{
		String str="/home/admin1/Desktop/file2.txt";
		FileReader f=new FileReader(str);
		BufferedReader read=new BufferedReader(f);
		final String DELIMITER=" ";
		Node nd=null;
		LinkedList<String> li=new LinkedList<>();
		try 
		{
			String word; 
			  while ((word = read.readLine()) != null) 
			  {
			  String[] tokens = word.split(DELIMITER);
			    for(String token:tokens)
			    {
			    	li.add(token);
//			    	System.out.println(token);
			    }
			  }
			  System.out.println("words in a file are :");
			  int length=li.traverse();
			  System.out.println("length is :"+length);
			  System.out.println("enter the word to be searched");
			  String key=DataStructureUtility.userString();
			  boolean b=li.printValue(length,key,li);
			  if(b)
			  {
				  System.out.println("name found");
			  }
			  else
			  {
				  System.out.println("name not found");
			  }
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}


}
