/******************************************************************************
 *  Compilation:  javac -d bin LeapYear.java
 *  Execution:    java -cp bin package com.bridgelabz.functionalprograms.LeapYear
 *  
 *  Purpose: Determines whether the given year is a leap year or not.
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class LeapYear 
{
	/*
	* The main function is written to take input from the user and
	* call leapYear function that determines if a year is a leap 
	* year or not
	*/
	public static void main(String[] args) 
	{
//		FunctionalUtility func=new FunctionalUtility();
		Scanner sc=new Scanner(System.in);
		int i=0;
		do {
			System.out.println("Select your choice :");
			System.out.println("1. Find leap year \n2. exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println("enter the year");
					int year=sc.nextInt(); //user input
					if (Integer.toString(year).length() != 4) {
						System.out.println("please enter the valid 4 digit year");
					}
					//Method 1- using static function of FunctionalUtilty class of com.bridgelabz.util package
					boolean b=FunctionalUtility.leapYear(year);
					if(b)
					{
						System.out.println(year + "is a leap year"); //display result
					}
					else
					{
						System.out.println(year + " not a leap year"); ////display result
					}
					break;
			case 2:System.exit(0);
			break;
			default :System.out.println("please select correct choice ");
			break;
			}
			i++;
		}	while(i<30);
		sc.close();
	}

}
