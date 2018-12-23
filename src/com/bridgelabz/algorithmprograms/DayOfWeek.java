/******************************************************************************
 *  Compilation:  javac -d bin DayOfWeek.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.DayOfWeek n
 *  
 *  Purpose: Finds the day of the week for the given date.
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/



package com.bridgelabz.algorithmprograms;

import java.math.BigInteger;
import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class DayOfWeek 
{
	/*
	* The main function is written to take input from the user and and 
	* call the dayOfWeek function that returns the integer 
	* representation of the week
	*/
	
	public static void main(String[] args) {
//		String i=args[0];
//		String j=args[1];
//		String k=args[2];
//		int month=Integer.parseInt(i);
//		int day=Integer.parseInt(j);
//		int year=Integer.parseInt(k);
		AlgorithmUtility algo=new AlgorithmUtility();
		Scanner sc=new Scanner(System.in);
		//Reading inputs from the user
		System.out.println("enter day");
		int day=sc.nextInt();
		System.out.println("enter month");
		int month=sc.nextInt();
		System.out.println("enter year");
		int year=sc.nextInt();
		System.out.println();
		//Method 1- using non-static function of AlgorithmUtility class of com.bridgelabz.util package		
		algo.dayIs(month, day, year);
		
	}

}
