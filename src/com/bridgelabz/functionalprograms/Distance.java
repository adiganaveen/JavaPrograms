/******************************************************************************
 *  Compilation:  javac -d bin Distance.java
 *  Execution:    java -cp bin package com.bridgelabz.functionalprograms.Distance
 *  
 *  Purpose: Determines euclidean distance between two points.
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   19-12-2018
 *
 ******************************************************************************/


package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class Distance 
{
	/*
	* The main function is written to take input from the user and
	* call distance function that calculates the euclidean distance
	*/
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//Reading inputs from the user
		String i=args[0];
		String j=args[1];
		int x=Integer.parseInt(i);
		int y=Integer.parseInt(j);
		//Method 1- using static function of FunctionalUtilty class of com.bridgelabz.util package
		double result=FunctionalUtility.getDistance(x,y);
		System.out.println("the Euclidean distance from the point ("+x+","+ y+") to the origin (0, 0) is "+result); //display result
		sc.close();
	}

}
