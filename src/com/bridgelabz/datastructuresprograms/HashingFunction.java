/******************************************************************************
 *  Compilation:  javac -d bin HashingFunction.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.HashingFunction n
 *  
 *  Purpose: Hashing Function to search a Number in a slot
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   4-12-2018
 *
 ******************************************************************************/


package com.bridgelabz.datastructuresprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.bridgelabz.util.AlgorithmUtility;
import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.LinkedList;

public class HashingFunction {
	/*
	* The main function is to read from a file and use hash numbers
	* to find the searched data.
	*/
	public static <E> void main(String[] args) throws NumberFormatException, IOException {
		//Customized LinkedList
		LinkedList<Integer> linkedList1=new LinkedList<>();
		LinkedList<Integer> linkedList2 = null;
		LinkedList<Integer> linkedList3=new LinkedList<>();
		int n=0;
		Map<Integer, LinkedList<Integer>> map=new LinkedHashMap<Integer, LinkedList<Integer>>();
//		Map<Integer, LinkedList<Integer>> map2=new LinkedHashMap<Integer, LinkedList<Integer>>();
		for(int i=0;i<10;i++){
			linkedList2 = new LinkedList<>();
			map.put(i, linkedList2);
		}
		FileReader fr=new FileReader("/home/admin1/Desktop/HashingFile");
		@SuppressWarnings("resource")
		BufferedReader br=new BufferedReader(fr);
		FileWriter w=new FileWriter("/home/admin1/Desktop/HashingFile",true);
		BufferedWriter writer = new BufferedWriter(w);
		int rem;
		String read;
		String delimitor=" ";
		while((read=br.readLine())!=null){
			String tokens[]=read.split(delimitor);
			for(String token:tokens){
				linkedList1.add(Integer.parseInt(token));
			}
		}
		System.out.println("The numbers in the file are:");
		linkedList1.printNew();
		System.out.println();
		int len=linkedList1.size();
		int [] arr=linkedList1.convInteger(linkedList1,len);
 		int [] arr2=linkedList1.sortArray(arr);
 		System.out.println("after sorting:");
 		for(int i:arr2)
 		  {
 			linkedList3.add(i);
 		  }
 		linkedList3.printNew();
 		System.out.println();
		System.out.println("Dividing each number by 11 and storing set");
		for(int i=0;i<arr2.length;i++){
			rem=arr2[i]%11;
			if(map.isEmpty()){
				linkedList2.add(arr2[i]);
				linkedList2.print();
				map.put(rem, linkedList2.getValue());
			}
			else{
				map.put(rem, linkedList2);
				linkedList2=map.get(rem);
				linkedList2.print();
				if(linkedList2.size()==0){
					linkedList2.add(arr2[i]);
				}
				else{
					if(!linkedList2.search(arr2[i])){
						linkedList2.add(arr2[i]);
						map.put(rem, linkedList2);
					}
				}
				
			}
		}
//		System.out.println(map.entrySet());
//		map2=DataStructureUtility.mapCall(map);
//		System.out.println(map2);
		Iterator<E> entries = (Iterator<E>) map.entrySet().iterator();
		while (entries.hasNext()) {
		    Map.Entry<Integer, LinkedList<Integer>> entry = (Entry<Integer, LinkedList<Integer>>) entries.next();
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		
		 do {
			  System.out.println();
			  System.out.println("1.Enter the integer value to be to be searched\n2.Exit the program and display the file ");
			  int choice=DataStructureUtility.userInteger();
			  switch(choice)
			  {
			  case 1: System.out.println("enter the word to be searched from sorted list:");
			  		  int key=DataStructureUtility.userInteger();
			  		  int length=linkedList2.size();
			  		  System.out.println(length);
			  		  boolean b=linkedList2.findIntegerValue(length,key,linkedList2);
			  		  if(b)
			  		  {
			  			  System.out.println("name found");
			  			  System.out.println("number is removed from the file ");
			  			  System.out.println("new file list is :");
			  			  linkedList2.printNew();
			  		  }
			  		  else
			  		  {
			  			  System.out.println("name not found");
			  			  System.out.println("seached number added to file ");
			  			  linkedList2.printNew();
			  		  }
			  		  break;
			  		  
			  case 2:  
				  	    FileOutputStream writer2 = new FileOutputStream("/home/admin1/Desktop/HashingFile");
				        writer2.write(("").getBytes());
				        writer2.close();
				  		int len2=linkedList2.size();
				  		linkedList2.printNew();
				  		int [] newStr=linkedList2.convertInt(linkedList2, len2);
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
