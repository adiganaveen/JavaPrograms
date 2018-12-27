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
//		String i=args[0];
//		String j=args[1];
//		String k=args[2];
//		int month=Integer.parseInt(i);
//		int day=Integer.parseInt(j);
//		int year=Integer.parseInt(k);
//		AlgorithmUtility algo=new AlgorithmUtility();
//		Scanner sc=new Scanner(System.in);
		//Reading inputs from the user
		System.out.println("enter day");
		int day=AlgorithmUtility.userInteger();//user input
		System.out.println("enter month");
		int month=AlgorithmUtility.userInteger();//user input
		System.out.println("enter year");
		int year=AlgorithmUtility.userInteger();//user input
		System.out.println();
		//Method 1- using static function of AlgorithmUtility class of com.bridgelabz.util package		
		int day1=AlgorithmUtility.dayIs(month, day, year);
		String[] str = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
		System.out.println(str[day1]);
		
	}

}
