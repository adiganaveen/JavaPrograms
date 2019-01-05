/******************************************************************************
 *  Compilation:  javac -d bin OrderedList.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.OrderedList n
 *  
 *  Purpose: Read .a List of Numbers from a file and arrange it ascending Order in a
 *		 	 Linked List. Take user input for a number, if found then pop the number out of the
 *		 	 list else insert the number in appropriate position
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   1-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.datastructuresprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import javax.xml.crypto.Data;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.LinkedList;

public class OrderedList {
	public static void main(String[] args) throws IOException {
		String str = "/home/admin1/Desktop/file3.txt";
		FileReader f = new FileReader(str);
		BufferedReader read = new BufferedReader(f);
		final String DELIMITER = " ";
		int n = 0;
		LinkedList<Integer> li = new LinkedList<>();
		LinkedList<Integer> li2 = new LinkedList<>();
		try {
			String word;
			while ((word = read.readLine()) != null) {
				String[] tokens = word.split(DELIMITER);
				for (String token : tokens) {
					li.add(Integer.parseInt(token));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("List of integers in a file are :");
		int length = li.size();
		li.printNew();
		int[] arr = li.convInteger(li, length);
		int[] arr2 = li.sortArray(arr);
		System.out.println("\nafter sorting:");
		for (int i : arr2) {
			li2.add(i);
		}
		li2.printNew();
		do {
			System.out.println(
					"\n1.Enter the integer value to be to be searched\n2.Exit the program and display the file ");
			int choice = DataStructureUtility.userInteger();
			switch (choice) {
			case 1:
				System.out.println("enter the word to be searched from sorted list:");
				int key = DataStructureUtility.userInteger();
				DataStructureUtility.OrderedSearch(li2, key);
				break;

			case 2:
				DataStructureUtility.orderedWrite(li2, li);
				System.exit(0);
				break;
			default:
				System.out.println("please select correct choice");
				break;
			}

			n++;
		} while (n < 30);
	}
}
