/******************************************************************************
 *  Compilation:  javac -d bin UnOrderedList.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.UnOrderedList n
 *  
 *  Purpose: Reads the text from a file, split it into words and arrange it as Linked List.
 *  		 Takes a user input to search a Word in the List. If the Word is not found then 
 *  		 add it to the list, and if it found then remove the word from the List.
 *  		 In the end save the list into a file
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   2-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.datastructuresprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.LinkedList;

public class UnOrderedList  {
	/*
	* The main function is read a file and add to customized linked 
	* list to find the searched word
	*/
	public static void main(String[] args) throws IOException 
	{
		String str="/home/admin1/Desktop/file2.txt";
		FileReader f=new FileReader(str);
		@SuppressWarnings("resource")
		BufferedReader read=new BufferedReader(f);
		FileWriter w=new FileWriter("/home/admin1/Desktop/file2.txt",true);
		BufferedWriter writer = new BufferedWriter(w);
		final String DELIMITER=" ";
		int n=0;
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
			    }
			  }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			  System.out.println("words in a file are :");
			  int length=li.print();
			  do {
				  System.out.println("1.Enter the name to be searched\n2.Exit the program and display the file ");
				  int choice=DataStructureUtility.userInteger();
				  switch(choice)
				  {
				  case 1: System.out.println("enter the word to be searched");
				  		  String key=DataStructureUtility.userString();
				  		  boolean b=li.printValue(length,key,li);
				  		  if(b)
				  		  {
				  			  System.out.println("name found");
				  			  System.out.println("word is removed from the file ");
				  			  System.out.println("new file list is :");
				  			  li.print();
				  		  }
				  		  else
				  		  {
				  			  System.out.println("name not found");
				  			  System.out.println("seached word added to file ");
				  		  }
				  		  break;
				  		  
				  case 2:  
					  	    FileOutputStream writer2 = new FileOutputStream("/home/admin1/Desktop/file2.txt");
					        writer2.write(("").getBytes());
					        writer2.close();
					  		int len=li.print();
					  		String [] newStr=li.convString(li, len);
					  		for(int i=0;i<newStr.length;i++)
					  		{
					  			writer.write(newStr[i]);
					  			writer.write(" ");
					  		}
					  		writer.close();
					  		System.exit(0);
					  		break;
				  default :System.out.println("please select correct choice");
				  			break;
				  }
				  
			  n++;
			  }while(n<30);
		

	}


}
