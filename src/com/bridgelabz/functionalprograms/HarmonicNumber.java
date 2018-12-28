/******************************************************************************
 *  Compilation:  javac -d bin HarmonicNumber.java
 *  Execution:    java -cp bin package com.bridgelabz.functionalprograms.HarmonicNumber
 *  
 *  Purpose: Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/


package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class HarmonicNumber 
{
	/*
	* The main function is written to take input from the user and
	* call harmonicValue function that prints harmonic value
	*/
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the harmonic value of n");
		//Reading the input from the user
		int n=sc.nextInt();
		//Method 1- using static function of FunctionalUtilty class of com.bridgelabz.util package
		double value=FunctionalUtility.harmonicValue(n);
		if(value==2)
		{
			System.out.println("invalid harmonic value");
		}
		else
		System.out.println("harmonic value of "+n+" is "+value);
		sc.close();
	}
}
