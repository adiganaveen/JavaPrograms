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



import com.bridgelabz.util.AlgorithmUtility;

public class DayOfWeek 
{
	/*
	* The main function is written to take input from the user and and 
	* call the dayOfWeek function that returns the integer 
	* representation of the week
	*/
	
	public static void main(String[] args) {
		System.out.println("enter day");
		int day=AlgorithmUtility.userInteger();
		System.out.println("enter month");
		int month=AlgorithmUtility.userInteger();
		System.out.println("enter year");
		int year=AlgorithmUtility.userInteger();
		System.out.println();
		int day1=AlgorithmUtility.dayIs(month, day, year);
		String[] str = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
		System.out.println(str[day1]);
		
	}

}
