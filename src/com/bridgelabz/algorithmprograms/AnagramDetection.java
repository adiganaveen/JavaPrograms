/******************************************************************************
 *  Compilation:  javac -d bin AnagramDetection.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.AnagramDetection n
 *  
 *  Purpose: Determines whether two strings are anagram.
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   21-12-2018
 *
 ******************************************************************************/


package com.bridgelabz.algorithmprograms;

import java.security.AlgorithmConstraints;
import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class AnagramDetection 
{
	/*
	* The main function is written to take input from the user and and 
	* call the isAnagram function that checks anagram of two strings
	*/
	public static void main(String[] args) {
		AlgorithmUtility algo=new AlgorithmUtility();
		Scanner sc=new Scanner(System.in);
		//Reading input two input strings from user
		System.out.println("Enter the first string");
		String str1=sc.nextLine();
		//Reading input two input strings from user
		System.out.println("Enter the second string");
		String str2=sc.nextLine();
		//Method 1- using non-static function of AlgorithmUtility class of com.bridgelabz.util package
		boolean b1=algo.anagramDetection(str1,str2);
		if(b1==true)
		{
			System.out.println("the given two strings "+str1+" and "+str2+" are anagram");
		}
		else 
			System.out.println("the given two strings "+str1+" and "+str2+" are not an anagram");
	}
}
