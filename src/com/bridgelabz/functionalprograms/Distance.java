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
		System.out.println("enter the range x");
		int x=sc.nextInt();
		System.out.println("enter the range y");
		//Reading inputs from the user
		int y=sc.nextInt();
		//Method 1- using static function of FunctionalUtilty class of com.bridgelabz.util package
		double result=FunctionalUtility.getDistance(x,y);
		System.out.println("the Euclidean distance from the point ("+x+","+ y+") to the origin (0, 0) is "+result); //display result
		sc.close();
	}

}
