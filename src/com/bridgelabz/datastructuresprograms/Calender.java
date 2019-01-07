/******************************************************************************
 *  Compilation:  javac -d bin Calender.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.Calender n
 *  
 *  Purpose: Prints the Calendar of the given month
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   5-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.datastructuresprograms;

import com.bridgelabz.util.DataStructureUtility;

public class Calender {
	/*
	* The main function is written to take input from the user
	* and print the calendar
	*/
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		String[] months = { "","January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		 //Method 1- using function of FunctionalUtility class of com.bridgelabz.util package
		if (month == 2 && DataStructureUtility.isLeapYear(year)) {
			days[month] = 29;
		}
		System.out.println("\t\t " + months[month] + " " + year);
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		//Method 2- using function of FunctionalUtility class of com.bridgelabz.util package
		int d = DataStructureUtility.day(month, 1, year);
		for (int i = 0; i < d; i++)
			System.out.print(" \t");
		for (int i = 1; i <= days[month]; i++) {
			System.out.print(i + "\t");
			if (((i + d) % 7 == 0) ) {
				System.out.println();
			}
		}
	}
}