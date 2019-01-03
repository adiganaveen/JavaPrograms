package com.bridgelabz.datastructuresprograms;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.LinkedList;

public class OrderedList  {
	public static void main(String[] args) throws IOException 
	{
		String str="/home/admin1/Desktop/file3.txt";
		FileReader f=new FileReader(str);
		BufferedReader read=new BufferedReader(f);
		FileWriter w=new FileWriter("/home/admin1/Desktop/file4.txt",true);
		BufferedWriter writer = new BufferedWriter(w);
		final String DELIMITER=" ";
//		Node nd=null;
		int n=0;
		LinkedList<Integer> li=new LinkedList<>();
		LinkedList<Integer> li2=new LinkedList<>();
		try 
		{
			String word; 
			  while ((word = read.readLine()) != null) 
			  {
			  String[] tokens = word.split(DELIMITER);
			    for(String token:tokens)
			    {
			    	li.add(Integer.parseInt(token));
			    }
			  }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		      
			  System.out.println("List of integers in a file are :");
			  int length=li.print();
			  int [] arr=li.convInteger(li,length);
	  		  int [] arr2=li.sortArray(arr);
	  		  System.out.println("after sorting:");
	  		  for(int i:arr2)
	  		  {
	  			  li2.add(i);
	  		  }
	  		  li2.print();
			  do {
				  System.out.println("1.Enter the integer value to be to be searched\n2.Exit the program and display the file ");
				  int choice=DataStructureUtility.userInteger();
				  switch(choice)
				  {
				  case 1: System.out.println("enter the word to be searched from sorted list:");
				  		  int key=DataStructureUtility.userInteger();
				  		  int len=li2.size();
				  		  System.out.println(len);
				  		  boolean b=li2.findIntegerValue(len,key,li2);
				  		  if(b)
				  		  {
				  			  System.out.println("name found");
				  			  System.out.println("number is removed from the file ");
				  			  System.out.println("new file list is :");
				  			  li2.printNew();
				  		  }
				  		  else
				  		  {
				  			  System.out.println("name not found");
				  			  System.out.println("seached word added to file ");
				  			  li2.printNew();
				  		  }
				  		  break;
				  		  
				  case 2:  
					  	    FileOutputStream writer2 = new FileOutputStream("/home/admin1/Desktop/file4.txt");
					        writer2.write(("").getBytes());
					        writer2.close();
					  		int len2=li2.size();
					  		li2.printNew();
					  		int [] newStr=li.convertInt(li2, len2);
					  		String[] newStringArray = new String[newStr.length];
					  		for(int i=0; i<newStr.length; i++) {
					  			newStringArray[i] = String.valueOf(newStr[i]);
					  		}
					  		for(int i=0;i<newStringArray.length;i++)
					  		{
					  			writer.write(newStringArray[i]);
					  			writer.write(" ");
					  		}
					  		writer.flush();
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

